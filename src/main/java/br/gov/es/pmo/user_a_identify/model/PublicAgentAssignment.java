package br.gov.es.pmo.user_a_identify.model;

public final class PublicAgentAssignment {

    private final String roleGuid;
    private final String roleName;
    private final String roleType;
    private final String workLocationGuid;
    private final OrganizationInfo organization;

    public PublicAgentAssignment(
        final String roleGuid,
        final String roleName,
        final String roleType,
        final OrganizationInfo organization
    ) {
        this(roleGuid, roleName, roleType, null, organization);
    }

    public PublicAgentAssignment(
        final String roleGuid,
        final String roleName,
        final String roleType,
        final String workLocationGuid,
        final OrganizationInfo organization
    ) {
        this.roleGuid = roleGuid;
        this.roleName = roleName;
        this.roleType = roleType;
        this.workLocationGuid = workLocationGuid;
        this.organization = organization;
    }

    public String getRoleGuid() {
        return this.roleGuid;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public String getRoleType() {
        return this.roleType;
    }

    public String getWorkLocationGuid() {
        return this.workLocationGuid;
    }

    public OrganizationInfo getOrganization() {
        return this.organization;
    }
}
