package org.wikimedia.donvip.model;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Superclass of BugMedia CRUD repositories, handling pagination and sorting.
 *
 * @param <T>  the media type the repository manages
 */
@NoRepositoryBean
public interface BugMediaRepository<T extends BugMedia> extends JpaRepositoryImplementation<T, CompositeMediaId> {

}
