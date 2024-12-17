package org.wikimedia.donvip.model;

import java.util.List;

public interface WithAuthors {

    List<Author> getAuthors();

    void setAuthors(List<Author> authors);

    default boolean addAuthor(Author author) {
        return getAuthors().add(author);
    }
}
