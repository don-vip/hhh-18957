package org.wikimedia.donvip;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.wikimedia.donvip.model.Author;
import org.wikimedia.donvip.model.BugMedihalMedia;
import org.wikimedia.donvip.model.BugMedihalMediaRepository;
import org.wikimedia.donvip.model.CompositeMediaId;

@SpringBootTest
class TestHHH18957 {

	@Autowired
	private BugMedihalMediaRepository repository;

	@Test
	void testSaveMedia() {
		BugMedihalMedia media = new BugMedihalMedia();
		media.setId(new CompositeMediaId("medihal", "123456"));
		media.setHalId("hal-123456");

		media.setAuthors(List.of(
				new Author.Builder().arxivId("binding 4, arxivId 1").firstName("binding 6, first name 1").fullName("binding 7, full name 1").lastName("binding 10, last name 1").wikidataId("binding 14, wikidata 1").build(),
				new Author.Builder().arxivId("binding 4, arxivId 2").firstName("binding 6, first name 2").fullName("binding 7, full name 2").lastName("binding 10, last name 2").wikidataId("binding 14, wikidata 2").build()));

		assertNotNull(this.repository.save(media));
	}
}
