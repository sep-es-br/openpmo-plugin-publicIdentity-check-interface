package br.gov.es.pmo.user_a_identify.model;

public final class PublicAgentInfo {

    private final String sub;
    private final Long discontinuedSub;
    private final String name;
    private final String nickname;
    private final String email;

    public PublicAgentInfo(
        final String sub,
        final Long discontinuedSub,
        final String name,
        final String nickname,
        final String email
    ) {
        this.sub = sub;
        this.discontinuedSub = discontinuedSub;
        this.name = name;
        this.nickname = nickname;
        this.email = email;
    }

    public String getSub() {
        return this.sub;
    }

    public Long getDiscontinuedSub() {
        return this.discontinuedSub;
    }

    public String getName() {
        return this.name;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getEmail() {
        return this.email;
    }
}
