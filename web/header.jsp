<%-- 
    Document   : footer
    Created on : Feb 17, 2022, 8:23:56 PM
    Author     : vinh2
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>EShopper - Bootstrap Shop Template</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="Free HTML Templates" name="keywords">
        <meta content="Free HTML Templates" name="description">

        <!-- Favicon -->
        <link href="img/favicon.ico" rel="icon">

        <!-- Google Web Fonts -->
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap" rel="stylesheet"> 

        <!-- Font Awesome -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">

        <!-- Libraries Stylesheet -->
        <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

        <!-- Customized Bootstrap Stylesheet -->
        <link href="css/style.css" rel="stylesheet">
        <!-- CSS -->
        <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/alertify.min.css"/>
        <!-- Default theme -->
        <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/default.min.css"/>
        <!-- Semantic UI theme -->
        <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/semantic.min.css"/>
        <!-- Bootstrap theme -->
        <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/bootstrap.min.css"/>
        <script src="https://kit.fontawesome.com/4e4039a7d0.js" crossorigin="anonymous"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    </head>
    <!--/head-->
    <body>
        <!-- Topbar Start -->
        <div class="container-fluid">
            <div class="row bg-secondary py-2 px-xl-5">
                <div class="col-lg-6 d-none d-lg-block">
                    <div class="d-inline-flex align-items-center">
                        <a class="text-dark" href="">FAQs</a>
                        <span class="text-muted px-2">|</span>
                        <a class="text-dark" href="">Help</a>
                        <span class="text-muted px-2">|</span>
                        <a class="text-dark" href="">Support</a>
                    </div>
                </div>
                <div class="col-lg-6 text-center text-lg-right">
                    <div class="d-inline-flex align-items-center">
                        <a class="text-dark px-2" href="">
                            <i class="fab fa-facebook-f"></i>
                        </a>
                        <a class="text-dark px-2" href="">
                            <i class="fab fa-twitter"></i>
                        </a>
                        <a class="text-dark px-2" href="">
                            <i class="fab fa-linkedin-in"></i>
                        </a>
                        <a class="text-dark px-2" href="">
                            <i class="fab fa-instagram"></i>
                        </a>
                        <a class="text-dark pl-2" href="">
                            <i class="fab fa-youtube"></i>
                        </a>
                    </div>
                </div>
            </div>
            <div class="row align-items-center py-3 px-xl-5">
                <div class="col-lg-3 d-none d-lg-block">
                    <a href="" class="text-decoration-none">
                        <h1 class="m-0 display-5 font-weight-semi-bold"><span class="text-primary font-weight-bold border px-3 mr-1">E</span>Shopper</h1>
                    </a>
                </div>
                <div class="col-lg-6 col-6 text-left">
                </div>
                <div class="col-lg-3 col-6 text-right">
                    <a id= "numP" href="showCart" class="btn border">
                        <c:if test="${sessionScope.numberP==null}">
                            <i class="fas fa-shopping-cart text-primary"></i>
                            <span id ="numP" class="badge">0</span>
                        </c:if>
                        <c:if test="${sessionScope.numberP!=null}">
                            <i class="fas fa-shopping-cart text-primary"></i>
                            <span id ="numP" class="badge">${sessionScope.numberP}</span>
                        </c:if>
                    </a>    
                </div>
            </div>
        </div>
        <!-- Topbar End -->


        <!-- Navbar Start -->
        <div class="container-fluid">
            <div class="row border-top px-xl-5">
                <div class="col-lg-3 d-none d-lg-block">
                    <a class="btn shadow-none d-flex align-items-center justify-content-between bg-primary text-white w-100" data-toggle="collapse" href="#navbar-vertical" style="height: 65px; margin-top: -1px; padding: 0 30px;">
                        <h6 class="m-0">Categories</h6>
                        <i class="fa fa-angle-down text-dark"></i>
                    </a>
                    <nav class="collapse position-absolute navbar navbar-vertical navbar-light align-items-start p-0 border border-top-0 border-bottom-0 bg-light" id="navbar-vertical" style="width: calc(100% - 30px); z-index: 1;">
                        <div class="navbar-nav w-100 overflow-hidden" style="height: 250px;">
                            <c:forEach items="${sessionScope.listC}" var="o">
                                <a href="shopByCate?cateID=${o.categoryID}" class="nav-item nav-link">${o.title}</a>
                            </c:forEach>
                        </div>
                    </nav>
                </div>
                <div class="col-lg-9">
                    <nav class="navbar navbar-expand-lg bg-light navbar-light py-3 py-lg-0 px-0">
                        <a href="" class="text-decoration-none d-block d-lg-none">
                            <h1 class="m-0 display-5 font-weight-semi-bold"><span class="text-primary font-weight-bold border px-3 mr-1">E</span>Shopper</h1>
                        </a>
                        <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse justify-content-between" id="navbarCollapse">
                            <div class="navbar-nav mr-auto py-0">
                                <a href="home" class="nav-item nav-link">Home</a>
                                <a href="shop" class="nav-item nav-link">Shop</a>
                                <div class="nav-item dropdown">
                                    <c:if test="${sessionScope.acc.isAdmin==false||sessionScope.acc.isAdmin==null}">
                                        <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Pages</a>
                                        <div class="dropdown-menu rounded-0 m-0">
                                            <a href="showCart" class="dropdown-item">Shopping Cart</a>
                                            <a href="checkout.html" class="dropdown-item">Checkout</a>
                                        </div>
                                    </c:if>
                                </div>
                                <a href="contact.html" class="nav-item nav-link">Contact</a>
                                <c:if test="${sessionScope.acc.isAdmin==true}">
                                    <a href="productManager" class="nav-item nav-link">Manage product</a>
                                    <a href="manageAccount" class="nav-item nav-link">Manage account</a>
                                </c:if>
                            </div>
                            <div class="navbar-nav ml-auto py-0">
                                <c:if test="${sessionScope.acc !=null}">
                                    <div class="nav-item dropdown">
                                        <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Your account</a>
                                        <div class="dropdown-menu rounded-0 m-0">
                                            <a href="editProfile" class="dropdown-item">Edit profile</a>
                                            <a href="changePass.jsp" class="dropdown-item">Change password</a>
                                            <c:if test="${sessionScope.acc.isAdmin==false}">
                                                <a href="showCart" class="dropdown-item">Cart</a>
                                                <a href="orderHistory" class="dropdown-item">Order history</a>
                                            </c:if>

                                        </div>
                                    </div>
                                    <a href="logout" class="nav-item nav-link">Logout</a>

                                </c:if>
                                <c:if test="${sessionScope.acc ==null}">
                                    <a href="login.jsp" class="nav-item nav-link">Login</a>
                                    <a href="signup.jsp" class="nav-item nav-link">Signup</a>
                                </c:if>
                            </div>
                        </div>
                    </nav>
                </div>
            </div>
        </div>

    </body>

</html>
