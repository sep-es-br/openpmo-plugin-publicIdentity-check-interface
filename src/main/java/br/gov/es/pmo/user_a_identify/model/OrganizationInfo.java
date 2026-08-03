package br.gov.es.pmo.user_a_identify.model;

import java.util.Objects;

public final class OrganizationInfo {

    private final String guid;
    private final String corporateName;
    private final String tradeName;
    private final String abbreviation;
    private final String parentOrganizationGuid;

    public OrganizationInfo(
        final String guid,
        final String corporateName,
        final String tradeName,
        final String abbreviation,
        final String parentOrganizationGuid
    ) {
        this.guid = guid;
        this.corporateName = corporateName;
        this.tradeName = tradeName;
        this.abbreviation = abbreviation;
        this.parentOrganizationGuid = parentOrganizationGuid;
    }

    public String getGuid() {
        return this.guid;
    }

    public String getCorporateName() {
        return this.corporateName;
    }

    public String getTradeName() {
        return this.tradeName;
    }

    public String getAbbreviation() {
        return this.abbreviation;
    }

    public String getParentOrganizationGuid() {
        return this.parentOrganizationGuid;
    }

    @Override
    public boolean equals(final Object other) {
        if(this == other) return true;
        if(!(other instanceof OrganizationInfo)) return false;
        final OrganizationInfo that = (OrganizationInfo) other;
        return Objects.equals(this.guid, that.guid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.guid);
    }
}
