package br.gov.es.pmo.user_a_identify.model;

public final class PublicAgentInfoResult {

    private final PublicIdentityStatus status;
    private final PublicAgentInfo information;

    private PublicAgentInfoResult(
        final PublicIdentityStatus status,
        final PublicAgentInfo information
    ) {
        this.status = status;
        this.information = information;
    }

    public static PublicAgentInfoResult found(final PublicAgentInfo information) {
        if(information == null) {
            throw new IllegalArgumentException("As informações do agente público são obrigatórias.");
        }
        return new PublicAgentInfoResult(PublicIdentityStatus.FOUND, information);
    }

    public static PublicAgentInfoResult notFound() {
        return new PublicAgentInfoResult(PublicIdentityStatus.NOT_FOUND, null);
    }

    public static PublicAgentInfoResult unavailable() {
        return new PublicAgentInfoResult(PublicIdentityStatus.UNAVAILABLE, null);
    }

    public PublicIdentityStatus getStatus() {
        return this.status;
    }

    public PublicAgentInfo getInformation() {
        return this.information;
    }

    public boolean isFound() {
        return PublicIdentityStatus.FOUND.equals(this.status);
    }
}
