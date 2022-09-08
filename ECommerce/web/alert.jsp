<%-- 
    Document   : alert
    Created on : Mar 17, 2022, 12:45:46 AM
    Author     : vinh2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="en-US">
    <head>
        <meta charset="UTF-8">
        <title>Alert things</title>

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
            input[type="text"],input[type="password"],input[type="submit"],input[type="email"]{
                width:100%;
                padding:10px;
                margin:10px 0px;
                border:2px solid #c0c0c0;
            }
            input[type="submit"]{
                border:1px solid #D19C97 !important;
                background-color:#D19C97 !important;
                color:white;
                font-size:16px;
                font-weight:600;
                cursor:pointer;
            }
        </style>
    </head>
    <body>
        <jsp:include page = "header.jsp"></jsp:include>
            <!-- Page Header Start -->
            <div class="container-fluid bg-secondary mb-5">
                <div class="d-flex flex-column align-items-center justify-content-center" style="min-height: 300px">
                    <h1 class="font-weight-semi-bold text-uppercase mb-3">Alert</h1>
                    <div class="d-inline-flex">
                        <p class="m-0"><a href="">Home</a></p>
                        <p class="m-0 px-2">-</p>
                        <p class="m-0">Alert</p>
                    </div>
                </div>
            </div>
            <!-- Page Header End -->
            <div class="box">

                <div class="inner-box">

                    <h3>Mess Alert</h3>

                    <p style="text-align:center;" >${messAlert}</p>

                    <p style="text-align:center;" >
                        <a class="link" href="showCart">Go back to cart</a>
                    </p>

                </div>

            </div>

        </body>
    <jsp:include page="footer.jsp"></jsp:include>

</html>
