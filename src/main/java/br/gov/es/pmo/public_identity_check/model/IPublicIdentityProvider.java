package br.gov.es.pmo.public_identity_check.model;

/**
 * Provider-independent contract for locating identities that can receive an
 * OpenPMO permission.
 */
public interface IPublicIdentityProvider {

    PublicIdentityResult findByCpf(String cpf);

    PublicAgentSearchResult findPublicAgentsByName(String name);

    PublicIdentityResult findPublicAgentBySub(String sub);
}
