package br.gov.es.pmo.user_a_identify.model;

/**
 * Provider-independent contract for locating identities that can receive an
 * OpenPMO permission.
 */
public interface IPublicIdentityProvider {

    PublicIdentityResult findByCpf(String cpf);

    PublicAgentSearchResult findPublicAgentsByName(String name);

    PublicIdentityResult findPublicAgentBySub(String sub);

    PublicAgentInfoResult findPublicAgentInformationBySub(String sub);
}
