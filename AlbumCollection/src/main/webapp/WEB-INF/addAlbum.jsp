<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="addAlbum.do" name="addAlbum" method="POST">
    Title<input type="text" name="title">
    Artist<input type="text" name="artist">
    Release Year<input type="text" name="releaseYear">
    Genre<input type="text" name="genre">
    Album Cover<input type="text" name="imageUrl">
    Sale Price<input type="text" name="salePrice">
    <input type="submit" value="Add Album">
</form>
</body>
</html>