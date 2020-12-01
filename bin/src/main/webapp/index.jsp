

<html>
<head>
    <title> welcome</title>
<%--    <link rel="stylesheet"  href="${pageContext.request.contextPath}/resources/design.css">--%>
    <style>
        .register {
            text-align: center;
            background-color: #81AB42;
            border: 5px solid black;
            height: 40%;
            width: 50%;
        }
        .rname{
            text-align: center;
            border: 2px solid black;
            height: 10%;
            width: 20%;


        }
        .remail{
            text-align: center;
            border: 2px solid black;
            height: 10%;
            width: 20%;

        }
        .rpwd{
            text-align: center;
            border: 2px solid black;
            height: 10%;
            width: 20%;

        }
        .rnumber{
            text-align: center;
            border: 2px solid black;
            height: 10%;
            width: 20%;

        }


        .body{ background-color: #81AB42;

        }
        h1 {
            text-shadow: 0 0 3px #FF0000, 0 0 5px #0000FF;
            font-size: 50px;
            font-style: italic;
            background-color: yellow;
            text-align: center;
        }
        /*.full{*/
        /*    background-image: url("back.jpg");*/
        /*    background-repeat: no-repeat;*/


        /*.full{*/
        /*     background-image: url("back.jpg");*/
        /*     background-repeat: no-repeat;*/



        .login{
            text-align: center;
            background-color: #81AB42;
            border: 5px solid black;
            height: 40%;
            width: 50%;

        }
        .lemail{
            text-align: center;
            border: 2px solid black;
            height: 10%;
            width: 20%;

        }
        .lpwd{
            text-align: center;
            border: 2px solid black;
            height: 10%;
            width: 20%;

        }






    </style>

    <script src="https://apis.google.com/js/platform.js" async defer></script>
    <meta name="google-signin-client_id" content="1004794509567-gpsfrgpl3efkvin2k6bfdkobsa3bola7.apps.googleusercontent.com">
    <script>
        function onSignin(googleUser) {
            let profile = googleUser.getBasicProfile();


            console.log('Name: ' + profile.getName());
            document.getElementsByClassName('rname').value=profile.getName();

            console.log('Email: ' + profile.getEmail());
            document.getElementsByClassName('remail').value=profile.getEmail;
            var auth2 = gapi.auth2.getAuthInstance();
            auth2.signOut().then(function () {
                console.log('User signed out.');

            });

        }
    </script>
</head>

<body>
<div class="full">


    <h1> Getting Started  <3 </h1>
    <form action="register" class="register">

        <h2> Register here"</h2>
        <input type="text" placeholder="entername" name="rname" class="rname" required="true"><br>
        <input type="email" placeholder="email" name="remail" class="remail" required="true"><br>
        <input type="password" placeholder="enterpassword" name="rpwd" class="rpwd" required="true"><br>
        <input type="text" placeholder="enternumber" name="rnumber" class="rnumber" required="true"><br>
        <input type="submit">
        <div class="g-signin2" data-onsuccess="onSignIn"></div>
    </form>

    <form action="login" class="login">
        <h3>login here</h3>
        <input type="email" placeholder="email" name="lemail" class="lemail" required="true"><br>
        <input type="password" placeholder="password" name="lpwd" class="lpwd" required="true"><br>
        <input type="submit">

    </form>
</div>
</body>


</html>
