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
	public Album update(int albumId, Album album) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int albumId) {
		// TODO Auto-generated method stub
		return false;
	}

}
