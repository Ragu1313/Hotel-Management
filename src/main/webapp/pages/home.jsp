<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form id="loginForm" action="/addmember" method="post">
      <h2>Login</h2>
      <label for="name">name</label>
      <input type="text" id="email_id" name="name" required>
       <label for="date">Choose a date:</label>
        <input type="date" id="date" name="date" required>
      <input type="submit" value="Login" name="submit">
      <!-- <button type="submit" name="submit">Login</button> -->
    </form>
</body>
</html>