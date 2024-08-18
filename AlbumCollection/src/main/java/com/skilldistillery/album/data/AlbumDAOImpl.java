package com.skilldistillery.album.data;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skilldistillery.album.entities.Album;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class AlbumDAOImpl implements AlbumDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Album findById(int albumId) {
		return em.find(Album.class, albumId);
	}

	@Override
	public List<Album> findAll() {
		return em.createQuery("SELECT a FROM Album a", Album.class).getResultList();
	}

	@Override
	public Album create(Album newAlbum) {
		em.persist(newAlbum);
		return newAlbum;
	}

	@Override
	@Transactional
	public Album update(Album album) {
		Album existingAlbum = em.find(Album.class, album.getId());
		if (existingAlbum != null) {
			existingAlbum.setName(album.getName());
			existingAlbum.setArtist(album.getArtist());
			existingAlbum.setReleaseYear(album.getReleaseYear());
			existingAlbum.setGenre(album.getGenre());
			existingAlbum.setImageUrl(album.getImageUrl());
			existingAlbum.setSalePrice(album.getSalePrice());
			return em.merge(existingAlbum);
		}
		return null;
	}

	@Override
	public boolean deleteById(int albumId) {
		Album album = em.find(Album.class, albumId);
		if (album != null) {
			em.remove(album);
			return true;
		} else {
			System.out.println("No entity found with ID: " + albumId);
			return false;
		}
	}

}
