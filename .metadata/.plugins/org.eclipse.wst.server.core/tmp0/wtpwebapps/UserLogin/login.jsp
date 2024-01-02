<!-- login.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <script>
        function validateLoginForm() {
            var username = document.getElementById("username").value.trim();
            var password = document.getElementById("password").value.trim();

            if (username === "" || password === "") {
                alert("Please fill in all fields.");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
    <h2>Login</h2>
    <form action="LoginServlet" method="post" onsubmit="return validateLoginForm()">
        Username: <input type="text" name="username" id="username"><br>
        Password: <input type="password" name="password" id="password"><br>
        <input type="submit" value="Login">
    </form>
    <br>
    <a href="register.jsp">New User? Register here</a>
</body>
</html>
