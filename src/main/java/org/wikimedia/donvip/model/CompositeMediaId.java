package org.wikimedia.donvip.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public record CompositeMediaId(
        @Column(nullable = false, length = 64) String repoId,
        @Column(nullable = false, length = 512) String mediaId
) implements Serializable, Comparable<CompositeMediaId> {

    private static final long serialVersionUID = 1L;

    public CompositeMediaId(String jsonId) {
        this(jsonId.substring(0, jsonId.indexOf(':')), jsonId.substring(jsonId.indexOf(':') + 1));
    }

    @Override
    public int compareTo(CompositeMediaId o) {
        return toString().compareTo(o.toString());
    }

    @Override
    public String toString() {
        return repoId + ':' + mediaId;
    }
}
