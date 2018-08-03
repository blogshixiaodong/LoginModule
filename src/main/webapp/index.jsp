<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <title>登陆</title>
    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="vendors/bootstrap/css/bootstrap.min.css" >
    <!-- Custom styles for this template -->
    <link href="vendors/login/signin.css" rel="stylesheet">
</head>
<body class="text-center">
    <form class="form-signin"  method="POST" action="user/login">
        <h1 class="h3 mb-3 font-weight-normal">Visitor Sign In</h1>
        <label for="inputAccount" class="sr-only">Account</label>
        <input type="text" id="inputAccount" name="accountId" class="form-control" placeholder="Account" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
        <button id="submit" class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
        <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
    </form>

    <script type="text/javascript" src="vendors/jquery/jquery.min.js"></script>

</body>
</html>