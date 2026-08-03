package br.gov.es.pmo.user_a_identify.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PublicAgentSearchResult {

    private final PublicIdentityStatus status;
    private final List<PublicAgentSummary> agents;

    private PublicAgentSearchResult(
        final PublicIdentityStatus status,
        final List<PublicAgentSummary> agents
    ) {
        this.status = status;
        this.agents = Collections.unmodifiableList(
            new ArrayList<>(agents == null ? Collections.emptyList() : agents)
        );
    }

    public static PublicAgentSearchResult found(final List<PublicAgentSummary> agents) {
        return new PublicAgentSearchResult(PublicIdentityStatus.FOUND, agents);
    }

    public static PublicAgentSearchResult unavailable() {
        return new PublicAgentSearchResult(PublicIdentityStatus.UNAVAILABLE, Collections.emptyList());
    }

    public PublicIdentityStatus getStatus() {
        return this.status;
    }

    public List<PublicAgentSummary> getAgents() {
        return this.agents;
    }
}
