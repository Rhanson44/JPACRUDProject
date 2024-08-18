<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Album Collection</title>
</head>
<body>
<h1>Album Collection</h1>
<a href="addAlbumForm.do">Add an Album</a>
<c:forEach items="${albums}" var="album">
		<h2>${album.name}</h2>
		<h3>${album.artist}</h3>
		<h5>${album.releaseYear}</h2>
		<h5>${album.genre}</h2>
		<form action="deleteAlbum.do" method="post" style="display:inline;">
        <input type="hidden" name="albumId" value="${album.id}">
        <button type="submit">Delete</button>
        </form>
		<hr>
</c:forEach>
</body>
</html>