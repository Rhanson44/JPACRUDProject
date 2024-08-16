package com.skilldistillery.album.data;

import java.util.List;

import com.skilldistillery.album.entities.Album;

public interface AlbumDAO {

	Album findById(int albumId);
	List<Album> findAll();
	Album create(Album newAlbum);
	Album update(int albumId, Album album);
	boolean deleteById(int albumId);
}
