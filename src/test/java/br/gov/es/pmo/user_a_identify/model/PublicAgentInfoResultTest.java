package br.gov.es.pmo.user_a_identify.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class PublicAgentInfoResultTest {

    @Test
    public void shouldCreateFoundResult() {
        final PublicAgentInfo information = new PublicAgentInfo(
            "agent-sub",
            0L,
            "Nome",
            "Apelido",
            "agente@example.com"
        );

        final PublicAgentInfoResult result = PublicAgentInfoResult.found(information);

        assertEquals(PublicIdentityStatus.FOUND, result.getStatus());
        assertSame(information, result.getInformation());
        assertTrue(result.isFound());
    }

    @Test
    public void shouldCreateNotFoundResultWithoutInformation() {
        final PublicAgentInfoResult result = PublicAgentInfoResult.notFound();

        assertEquals(PublicIdentityStatus.NOT_FOUND, result.getStatus());
        assertNull(result.getInformation());
    }
}
