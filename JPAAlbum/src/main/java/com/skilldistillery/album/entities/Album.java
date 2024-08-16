package com.skilldistillery.album.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Album {
	
	public Album() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String artist;
	@Column(name="release_year")
	private int releaseYear;
	private String genre;
	@Column(name="image_url")
	private String imageUrl;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Album [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", artist=");
		builder.append(artist);
		builder.append(", releaseYear=");
		builder.append(releaseYear);
		builder.append(", genre=");
		builder.append(genre);
		builder.append(", imageUrl=");
		builder.append(imageUrl);
		builder.append("]");
		return builder.toString();
	}
}
