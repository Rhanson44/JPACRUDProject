<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Album Collection</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<h1>Album Collection</h1>
<h2><a href="addAlbumForm.do">Add an Album</a></h2>
<br>
<c:forEach items="${albums}" var="album">
  <div class="album-container">
    <div class="album-image">
      <img src="${album.imageUrl}" alt="${album.name}" width="375" height="300">
    </div>
    <div class="album-info">
      <h2>${album.name} - ${album.artist}</h2>
      <h3>${album.releaseYear}</h3>
      <h3>${album.genre}</h3>
      <div class="album-buttons">
        <form action="deleteAlbum.do" method="post">
          <input type="hidden" name="albumId" value="${album.id}">
          <button type="submit">Delete</button>
        </form>
        <form action="updateAlbumForm.do" method="get">
          <input type="hidden" name="albumId2" value="${album.id}">
          <button type="submit">Update</button>
        </form>
      </div>
    </div>
  </div>
  <hr>
</c:forEach>
</body>
</html>