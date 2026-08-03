package br.gov.es.pmo.user_a_identify.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PublicIdentityResult {

    private final PublicIdentityStatus status;
    private final PublicIdentityType type;
    private final String cpf;
    private final String sub;
    private final String name;
    private final String email;
    private final String corporateEmail;
    private final List<PublicAgentAssignment> assignments;

    private PublicIdentityResult(
        final PublicIdentityStatus status,
        final PublicIdentityType type,
        final String cpf,
        final String sub,
        final String name,
        final String email,
        final String corporateEmail,
        final List<PublicAgentAssignment> assignments
    ) {
        this.status = status;
        this.type = type;
        this.cpf = cpf;
        this.sub = sub;
        this.name = name;
        this.email = email;
        this.corporateEmail = corporateEmail;
        this.assignments = Collections.unmodifiableList(
            new ArrayList<>(assignments == null ? Collections.emptyList() : assignments)
        );
    }

    public static PublicIdentityResult found(
        final PublicIdentityType type,
        final String cpf,
        final String sub,
        final String name,
        final String email,
        final String corporateEmail,
        final List<PublicAgentAssignment> assignments
    ) {
        return new PublicIdentityResult(
            PublicIdentityStatus.FOUND,
            type,
            cpf,
            sub,
            name,
            email,
            corporateEmail,
            assignments
        );
    }

    public static PublicIdentityResult notFound(final String cpf) {
        return empty(PublicIdentityStatus.NOT_FOUND, cpf);
    }

    public static PublicIdentityResult unavailable(final String cpf) {
        return empty(PublicIdentityStatus.UNAVAILABLE, cpf);
    }

    private static PublicIdentityResult empty(
        final PublicIdentityStatus status,
        final String cpf
    ) {
        return new PublicIdentityResult(
            status,
            null,
            cpf,
            null,
            null,
            null,
            null,
            Collections.emptyList()
        );
    }

    public PublicIdentityStatus getStatus() {
        return this.status;
    }

    public PublicIdentityType getType() {
        return this.type;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getSub() {
        return this.sub;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getCorporateEmail() {
        return this.corporateEmail;
    }

    public List<PublicAgentAssignment> getAssignments() {
        return this.assignments;
    }

    public boolean isFound() {
        return PublicIdentityStatus.FOUND.equals(this.status);
    }
}
