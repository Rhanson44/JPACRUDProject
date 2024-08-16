package com.skilldistillery.album.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

class AlbumTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Album album;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPAAlbum");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		album = em.find(Album.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		album = null;
	}

	@Test
	void test_album_entity_mappings() {
		assertNotNull(album);
		assertEquals("Good luck, babe!", album.getName());
	}

}
