package org.wikimedia.donvip.model;

import java.util.Objects;

import jakarta.persistence.Embedded;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

/**
 * Base class of all media.
 */
@MappedSuperclass
public class BugMedia {

    @Id
    @Embedded
    private CompositeMediaId id;

    public CompositeMediaId getId() {
        return id;
    }

    public void setId(CompositeMediaId id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        BugMedia other = (BugMedia) obj;
        return Objects.equals(id, other.id);
    }
}
