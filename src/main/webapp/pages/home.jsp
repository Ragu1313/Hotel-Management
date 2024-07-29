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
  <form id="loginForm" action="addmember" method="post">
      <h2>Login In</h2>
      <label for="email">Email:</label>
      <input type="text" id="email" name="email" required>
      <br>
      <label for="password">Create a strong Password:</label>
      <input type="password" id="password" name="password" required>
      <br>
      <label for="fullname">Full name:</label>
      <input type="text" id="fullname" name="fullname" required>
      <br>
      <label for="indate">In Date:</label>
      <input type="date" id="indate" name="indate" required>
      <br>
      <label for="itime">In time:</label>
      <input type="time" id="itime" name="itime" required>
      <br>
      <label for="noofdays">No of Days:</label>
      <input type="text" id="noofdays" name="noofdays" max="10" min="1" required>
      <br>
      <label for="outdate">Out Date:</label>
      <input type="date" id="outdate" name="outdate" required>
      <br>
      <label for="otime">Out time:</label>
      <input type="time" id="otime" name="otime" required>
      <br>
      <input type="submit" value="Login" name="submit">    
    </form>
</body>
</html>
