package br.gov.es.pmo.public_identity_check.model;

public final class PublicAgentSummary {

    private final String sub;
    private final String name;

    public PublicAgentSummary(final String sub, final String name) {
        this.sub = sub;
        this.name = name;
    }

    public String getSub() {
        return this.sub;
    }

    public String getName() {
        return this.name;
    }
}
