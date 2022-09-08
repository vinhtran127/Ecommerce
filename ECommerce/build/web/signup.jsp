<%-- 
    Document   : signup
    Created on : Mar 13, 2022, 8:13:57 PM
    Author     : vinh2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Login | E-Shopper</title>
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/prettyPhoto.css" rel="stylesheet">
        <link href="css/price-range.css" rel="stylesheet">
        <link href="css/animate.css" rel="stylesheet">
        <link href="css/main.css" rel="stylesheet">
        <link href="css/responsive.css" rel="stylesheet">
        <!--[if lt IE 9]>
        <script src="js/html5shiv.js"></script>
        <script src="js/respond.min.js"></script>
        <![endif]-->
        <link rel="shortcut icon" href="images/ico/favicon.ico">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
        <title>EShopper - Bootstrap Shop Template</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="Free HTML Templates" name="keywords">
        <meta content="Free HTML Templates" name="description">
        <style>
            *{
                padding:0px;
                margin:0px;
                color:#808080;
                font-family:arial;
                box-sizing:border-box;
            }
            body{
                background-color:#0062c4;
            }
            a{
                text-decoration:none;
            }
            .link{
                color: gray;
                font-weight: 600;
            }
            p{
                margin:5px 0px;
            }
            .box{
                width:400px;
                height:auto;
                margin:0 auto;
                background-color:white;
            }
            .inner-box{
                padding:20px;
            }
            .box h1,h2,h3,h4,h5,h6{
                text-align:center;
                margin:5px 0px;
            }
            .forgot{
                float:right;
            }
            input[type="text"],input[type="password"],input[type="submit"],input[type="email"], select{
                width:100%;
                padding:10px;
                margin:10px 0px;
                border:2px solid #c0c0c0;
            }
            input[type="submit"] {
                border:1px solid #D19C97 !important;
                background-color:#D19C97 !important;
                color:white;
                font-size:16px;
                font-weight:600;
                cursor:pointer;
            }
            option:hover{
                color: black;
                background: #D19C07;
            }

        </style>
    </head>
    <body>
        <jsp:include page = "header.jsp"></jsp:include>
            <!-- Page Header Start -->
            <div class="container-fluid bg-secondary mb-5">
                <div class="d-flex flex-column align-items-center justify-content-center" style="min-height: 300px">
                    <h1 class="font-weight-semi-bold text-uppercase mb-3">Sign up</h1>
                    <div class="d-inline-flex">
                        <p class="m-0"><a href="">Home</a></p>
                        <p class="m-0 px-2">-</p>
                        <p class="m-0">Sign up</p>
                    </div>
                </div>
            </div>
            <!-- Page Header End -->

            <div class="box">

                <div class="inner-box">

                    <form action="signup" method="post">
                        <h2>Sign Up Today</h2>
                        <input type="email" name= "email" placeholder="Email Address" value="${sessionScope.email}" required/>
                    <!--<input type="text" name= "phone" placeholder="Phone number" value="${sessionScope.phone}" required/>-->
                    <input type="text" name="fullname" placeholder="Your Full Name" value="${sessionScope.fullname}" required/>
                    <input type="text" name="username" placeholder="Username" required ${sessionScope.username}/>
<!--                    <input type="text" name="address" placeholder="address" required ${sessionScope.address}/>
                    <select name="securityQues">
                        <option value="What was your first car?">What was your first car?</option>
                        <option value = "What is the name of your first pet?">What is the name of your first pet?</option>
                        <option value="What elementary school did you attend?">What elementary school did you attend?</option>
                        <option value="What is the name of the town where you were born?">What is the name of the town where you were born?</option>
                    </select>-->
                    <!--<input type="text" name="answer" placeholder="Answer" required/>-->
                    <input type="password" name="pass" placeholder="Password" required/>
                    <input type="password" name="repass" placeholder="Conform Password" required/>
                    <p class="text-warning">${mess1}</p> 
                    <input type="submit" value="SignUp" />
                    <p style="text-align:center;" >
                        <span>Already Register ? </span><a class="link" href="login.jsp">Sign In</a>
                    </p>
                </form>
            </div>

        </div>
        <jsp:include page = "footer.jsp"></jsp:include>
        <script src="js/jquery.js"></script>
        <script src="js/price-range.js"></script>
        <script src="js/jquery.scrollUp.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
