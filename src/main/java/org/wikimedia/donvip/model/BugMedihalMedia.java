package org.wikimedia.donvip.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OrderColumn;

@Entity
public class BugMedihalMedia extends BugMedia implements WithAuthors {

    @Column(nullable = false)
    private String halId;

    @OrderColumn
    @ElementCollection(fetch = FetchType.EAGER)
    protected List<Author> authors = new ArrayList<>();

    public String getHalId() {
        return halId;
    }

    public void setHalId(String halId) {
        this.halId = halId;
    }

    @Override
    public List<Author> getAuthors() {
        return authors;
    }

    @Override
    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + Objects.hash(halId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj) || getClass() != obj.getClass())
            return false;
        BugMedihalMedia other = (BugMedihalMedia) obj;
        return Objects.equals(halId, other.halId);
    }
}
