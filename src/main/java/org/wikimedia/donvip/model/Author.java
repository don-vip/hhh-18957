package org.wikimedia.donvip.model;

import jakarta.persistence.Embeddable;

@Embeddable
public record Author(String firstName, String lastName, String fullName, String isniId, String viafId, String bnfId,
        String idrefId, String orcidId, String arxivId, String researcherId, String wikidataId) {

    public static class Builder {
        private String firstName;
        private String lastName;
        private String fullName;
        private String isniId;
        private String viafId;
        private String bnfId;
        private String idrefId;
        private String orcidId;
        private String arxivId;
        private String researcherId;
        private String wikidataId;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder fullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder isniId(String isniId) {
            this.isniId = isniId;
            return this;
        }

        public Builder viafId(String viafId) {
            this.viafId = viafId;
            return this;
        }

        public Builder bnfId(String bnfId) {
            this.bnfId = bnfId;
            return this;
        }

        public Builder idrefId(String idrefId) {
            this.idrefId = idrefId;
            return this;
        }

        public Builder orcidId(String orcidId) {
            this.orcidId = orcidId;
            return this;
        }

        public Builder arxivId(String arxivId) {
            this.arxivId = arxivId;
            return this;
        }

        public Builder researcherId(String researcherId) {
            this.researcherId = researcherId;
            return this;
        }

        public Builder wikidataId(String wikidataId) {
            this.wikidataId = wikidataId;
            return this;
        }

        public Author build() {
            return new Author(firstName, lastName, fullName, isniId, viafId, bnfId, idrefId, orcidId, arxivId,
                    researcherId, wikidataId);
        }
    }
}
