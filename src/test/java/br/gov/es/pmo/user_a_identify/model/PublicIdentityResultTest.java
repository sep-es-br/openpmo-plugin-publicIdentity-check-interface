package br.gov.es.pmo.user_a_identify.model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PublicIdentityResultTest {

    @Test
    public void shouldDefensivelyCopyAssignments() {
        final List<PublicAgentAssignment> assignments = new ArrayList<>();
        assignments.add(new PublicAgentAssignment("role", "Role", "TYPE", null));

        final PublicIdentityResult result = PublicIdentityResult.found(
            PublicIdentityType.PUBLIC_AGENT,
            "12345678900",
            "sub",
            "Name",
            "mail@example.com",
            null,
            assignments
        );

        assignments.clear();

        assertTrue(result.isFound());
        assertEquals(1, result.getAssignments().size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldExposeImmutableAssignments() {
        final PublicIdentityResult result = PublicIdentityResult.found(
            PublicIdentityType.CITIZEN,
            "12345678900",
            "sub",
            "Name",
            "mail@example.com",
            null,
            null
        );

        result.getAssignments().add(null);
    }
}
