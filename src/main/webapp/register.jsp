<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/24/2019
  Time: 5:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Congo</title>

    <style>
        h4 {
            text-shadow: 0 0 3px #FF0000, 0 0 5px #0000FF;
            font-size: 30px;
            font-style: italic;
            font-weight: bold;
        }
        h5{
            text-shadow: 0 0 3px #FF0000, 0 0 5px #0000FF;
            font-size: 20px;
            font-style: italic;
        }
        .loginpage{
            text-align: center;
            background-color: #81AB42;
            border: 5px solid black;
            height: 40%;
            width: 50%;

        }
        .loginemail{
            text-align: center;
            border: 2px solid black;
            height: 10%;
            width: 20%;


        }
        .loginpwd{
            text-align: center;
            border: 2px solid black;
            height: 10%;
            width: 20%;

        }



    </style>
</head>
<body>


<h4 class="h4"> Registration sucess...!!!! </h4>
<h5 class="h5"> Login below</h5><br>

<form action="login" class="loginpage">
    <h3>login here</h3>
    <input type="email" placeholder="email" name="lemail" class="loginemail" required="true"><br>
    <input type="password" placeholder="password" name="lpwd" class="loginpwd" required="true"><br>
    <input type="submit">

</form>
</body>
</html>
