<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Album</title>
</head>
<body>
<h1>Add New Album</h1>
<form action="addAlbum.do" name="addAlbum" method="POST">
    Title:<input type="text" name="name">
    Artist:<input type="text" name="artist">
    Release Year:<input type="text" name="releaseYear">
    Genre:<input type="text" name="genre">
    Album Cover URL:<input type="text" name="imageUrl">
    Sale Price:<input type="text" name="salePrice">
    <input type="submit" value="Add Album">
</form>
</body>
</html>