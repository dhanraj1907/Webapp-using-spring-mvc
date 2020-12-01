<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/24/2019
  Time: 4:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SORRY</title>
    <style>
        .lemail2{
            text-align: center;
            border: 2px solid black;
            height: 10%;
            width: 20%;

        }
        .lpwd2{
            text-align: center;
            border: 2px solid black;
            height: 10%;
            width: 20%;

        }
        .invalidlogin{
            text-align: center;
            background-color: #81AB42;
            border: 5px solid black;
            height: 40%;
            width: 50%;
        }






    </style>
</head>
<body>
<h1 class="invalid"> INVALID login credentials -_- </h1>


<form action="login" class="invalidlogin">
    <h3>login here</h3>
    <input type="email" placeholder="email" name="lemail" class="lemail2" required="true"><br>
    <input type="password" placeholder="password" name="lpwd" class="lpwd2" required="true"><br>
    <input type="submit">

</form>
</body>
</html>
