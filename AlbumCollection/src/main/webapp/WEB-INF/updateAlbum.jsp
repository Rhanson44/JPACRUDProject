<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Album</title>
</head>
<body>
<h1>Edit Album</h1>
<form action="updateAlbum.do" method="POST">
    <input type="hidden" name="albumId2" value="${album.id}">
    Title: <input type="text" name="name" value="${album.name}"><br>
    Artist: <input type="text" name="artist" value="${album.artist}"><br>
    Release Year: <input type="text" name="releaseYear" value="${album.releaseYear}"><br>
    Genre: <input type="text" name="genre" value="${album.genre}"><br>
    Album Cover URL: <input type="text" name="imageUrl" value="${album.imageUrl}"><br>
    Sale Price: <input type="text" name="salePrice" value="${album.salePrice}"><br>
    <input type="submit" value="Update Album">
</form>
<a href="home.do">Cancel</a>
</body>
</html>