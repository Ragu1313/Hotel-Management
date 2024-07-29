<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link rel="stylesheet" href="./css/home.css">
</head>
<body>
  <form id="loginForm" action="#" method="post">
      <h2>Login In</h2>
      <label for="UserId">UserId(if not sign up):</label>
      <input type="text" id="UserId" name="UserId" required>
      <br>
      <label for="password">Password:</label>
      <input type="password" id="password" name="password" required>
      <br>
      <label for="name">Fullname:</label>
      <input type="text" id="name" name="name" required>
      <br>
      <label for="indate">InDate:</label>
      <input type="date" id="indate" name="indate" required>
      <br>
      <label for="intime">Intime:</label>
      <input type="time" id="intime" name="intime" required>
      <br>
      <label for="outdate">OutDate:</label>
      <input type="date" id="outdate" name="outdate" required>
      <br>
      <label for="outtime">Outtime:</label>
      <input type="time" id="outtime" name="outtime" required>
      <br>
      <input type="submit" value="Login" name="submit">   <input type="submit" value="signup" name="signup">   
    </form>
</body>
</html>