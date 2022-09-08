<%-- 
    Document   : detail
    Created on : Feb 17, 2022, 9:34:41 PM
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
        <style>
            .fa-star:before {
                color:#D19C97;
            }
        </style>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
            <!-- Page Header Start -->
            <div class="container-fluid bg-secondary mb-5">
                <div class="d-flex flex-column align-items-center justify-content-center" style="min-height: 300px">
                    <h1 class="font-weight-semi-bold text-uppercase mb-3">Shop Detail</h1>
                    <div class="d-inline-flex">
                        <p class="m-0"><a href="">Home</a></p>
                        <p class="m-0 px-2">-</p>
                        <p class="m-0">Shop Detail</p>
                    </div>
                </div>
            </div>
            <!-- Page Header End -->

            <!-- Shop Detail Start -->
            <div class="container-fluid py-5">
                <div class="row px-xl-5">
                    <div class="col-lg-5 pb-5">
                        <div id="product-carousel" class="carousel slide" data-ride="carousel">
                            <div class="carousel-inner border">
                                <div class="carousel-item active">
                                    <img class="w-100 h-100" src="img/product-1.jpg" alt="Image">
                                </div>
                                <div class="carousel-item">
                                    <img class="w-100 h-100" src="img/product-2.jpg" alt="Image">
                                </div>
                                <div class="carousel-item">
                                    <img class="w-100 h-100" src="img/product-3.jpg" alt="Image">
                                </div>
                                <div class="carousel-item">
                                    <img class="w-100 h-100" src="img/product-4.jpg" alt="Image">
                                </div>
                            </div>
                            <a class="carousel-control-prev" href="#product-carousel" data-slide="prev">
                                <i class="fa fa-2x fa-angle-left text-dark"></i>
                            </a>
                            <a class="carousel-control-next" href="#product-carousel" data-slide="next">
                                <i class="fa fa-2x fa-angle-right text-dark"></i>
                            </a>
                        </div>
                    </div>

                    <div class="col-lg-7 pb-5">
                        <h3 class="font-weight-semi-bold">${p.name}</h3>
                    <div class="d-flex mb-3">
                        <div class="text-primary mr-2">
                            <small class="fas fa-star"></small>
                            <small class="fas fa-star"></small>
                            <small class="fas fa-star"></small>
                            <small class="fas fa-star-half-alt"></small>
                            <small class="far fa-star"></small>
                        </div>
                        <small class="pt-1">(rating)</small>
                    </div>
                    <h3 class="font-weight-semi-bold mb-4">${p.price*(100-p.sale)/100}₫</h3>
                    <p class="mb-4"> ${p.description}</p>
                    <div class="d-flex mb-3">
                        <p class="text-dark font-weight-medium mb-0 mr-3">Sizes:</p>
                        <form>
                            <c:forEach items="${listSize}" var="o">
                                <div class="custom-control custom-radio custom-control-inline">
                                    <input type="radio" class="custom-control-input" id="size-${o}" name="size" value="${o}">
                                    <label class="custom-control-label" for="size-${o}"> ${o}</label>
                                </div>
                            </c:forEach>
                        </form>
                    </div>
                    <div class="d-flex mb-4">
                    </div>
                    <div class="d-flex align-items-center mb-4 pt-2">
                        <div class="input-group quantity mr-3" style="width: 130px;">
                            <div class="input-group-btn">
                                <button class="btn btn-primary btn-minus" >
                                    <i class="fa fa-minus"></i>
                                </button>
                            </div>
                            <input id="numberToAdd" type="text" class="form-control bg-secondary text-center" value="1">
                            <div class="input-group-btn">
                                <button class="btn btn-primary btn-plus">
                                    <i class="fa fa-plus"></i>
                                </button>
                            </div>
                        </div>
                        <c:if test="${sessionScope.acc.isAdmin==false||sessionScope.acc.isAdmin==null}">
                            <a onclick="addToCart(${p.productID})" class="btn btn-primary px-3"><i class="fa fa-shopping-cart mr-1"></i> Add To Cart</a>

                        </c:if>
                    </div>
                    <div class="d-flex pt-2">
                        <p class="text-dark font-weight-medium mb-0 mr-2">Share on:</p>
                        <div class="d-inline-flex">
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
                                <i class="fab fa-pinterest"></i>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row px-xl-5">
                <div class="col">
                    <div class="nav nav-tabs justify-content-center border-secondary mb-4">
                        <a class="nav-item nav-link active" data-toggle="tab" href="#tab-pane-1">Description</a>
                        <a id ="numberOfReview" class="nav-item nav-link" data-toggle="tab" href="#tab-pane-2">Reviews (${size})</a>
                    </div>
                    <div class="tab-content">
                        <div class="tab-pane fade show active" id="tab-pane-1">
                            <h4 class="mb-3">Product Description</h4>
                            <p>${p.description}</p>
                        </div>
                        <div class="tab-pane fade" id="tab-pane-2">
                            <div class="row">
                                <div id="allComment" class="col-md-6">
                                    <h4 class="mb-4">reviews for ${p.name}</h4>
                                    <c:forEach items="${listComment}" var="o">
                                        <div class="media mb-4">
                                            <img src="img/user.jpg" alt="Image" class="img-fluid mr-3 mt-1" style="width: 45px;">
                                            <div class="media-body">
                                                <h6>${o.username}<small> - <i>${o.date}</i></small></h6>
                                                <div class="text-primary mb-2">
                                                    <c:forEach begin="1" end="5" var="j">
                                                        <c:if test="${j<=o.rating}">
                                                            <i class="fa-solid fa-star"></i>
                                                        </c:if>
                                                        <c:if test="${j>o.rating}">
                                                            <i class="far fa-star"></i>
                                                        </c:if>
                                                    </c:forEach>
                                                </div>
                                                <p>${o.content}</p>
                                            </div>
                                        </div>
                                    </c:forEach>

                                </div>
                                <div class="col-md-6">
                                    <h4 class="mb-4">Leave a review</h4>
                                    <small>Your email address will not be published. Required fields are marked *</small>
                                    <div class="d-flex my-3">
                                        <p class="mb-0 mr-2">Your Rating * :</p>
                                        <div class="text-primary" id="ratingStar">
                                            <c:forEach begin="1" end="5" var="i">
                                                <a onclick="ratingStar(${i})" class="btn btn-sm p-0" >
                                                    <i class="far fa-star"></i>
                                                </a>
                                            </c:forEach>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="getMess">Your Review *</label>
                                        <textarea id="getMess" cols="30" rows="5" class="form-control"></textarea>
                                    </div>
                                    <div class="form-group mb-0">
                                        <a onclick="postReview(${p.productID})" class="btn btn-primary px-3">Post your review</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Shop Detail End -->


        <!-- Products Start -->
        <div class="container-fluid py-5">
            <div class="text-center mb-4">
                <h2 class="section-title px-5"><span class="px-2">You May Also Like</span></h2>
            </div>
            <div class="row px-xl-5">
                <div class="col">
                    <div class="owl-carousel related-carousel">
                        <c:forEach items="${listP}" var="i">
                            <div class="card product-item border-0">
                                <div class="card-header product-img position-relative overflow-hidden bg-transparent border p-0">
                                    <img class="img-fluid w-100" src="img/product-1.jpg" alt="">
                                </div>
                                <div class="card-body border-left border-right text-center p-0 pt-4 pb-3">
                                    <h6 class="text-truncate mb-3">${i.name}</h6>
                                    <div class="d-flex justify-content-center">
                                        <h6>${i.price*(100-o.sale)/100}</h6>
                                        <h6 class="text-muted ml-2" style=${i.sale ==0?"display:none;":"display:inline-block;"} ><del>${i.price}</del></h6>
                                    </div>
                                </div>
                                <div class="card-footer d-flex justify-content-between bg-light border">
                                    <a href="detail?productID=${i.productID}" class="btn btn-sm text-dark p-0"><i class="fas fa-eye text-primary mr-1"></i>View
                                        Detail
                                    </a>
                                    <c:if test="${sessionScope.acc.isAdmin==false||sessionScope.acc.isAdmin==null}">
                                        <c:if test="${i.quantity>0}">
                                            <a onclick="addToCart(${i.productID})" class="btn btn-sm text-dark p-0"><i
                                                    class="fas fa-shopping-cart text-primary mr-1"></i>Add To Cart</a>
                                            </c:if>
                                            <c:if test="${i.quantity==0}">
                                            <p class="text-warning">Sold out</p>
                                        </c:if>
                                    </c:if>
                                </div>
                            </div>
                        </c:forEach>

                    </div>
                </div>
            </div>
        </div>
        <!-- Products End -->
        <jsp:include page="footer.jsp"></jsp:include>
        <script>

            function ratingStar(param) {
                $.ajax({
                    url: "/ECommerce/ratingStar",
                    type: "get",
                    data: {starPoint: param},
                    success: function (response) {
                        var ratingStar = document.getElementById("ratingStar");
                        ratingStar.innerHTML = response;
                    }

                });
            }
            function postReview(pID) {
                var cmt = document.getElementById("getMess").value;
                $.ajax({
                    url: "/ECommerce/addComment",
                    type: "post",
                    data: {
                        productID: pID,
                        comment: cmt
                    },
                    success: function (response) {
                        var s = String(response).split(",");
                        var s1 = s[0];
                        var s2 = s[1];
                        var s3 = s[2];
                        var allComment = document.getElementById("allComment");
//                        allComment.innerHTML += response;
                        allComment.innerHTML += s1;
                        document.getElementById("getMess").value = "";
                        document.getElementById("ratingStar").innerHTML = s2;
                        document.getElementById("numberOfReview").innerHTML = s3;


                    }
                });
            }
            function addToCart(param) {
                var sizes = document.getElementsByName("size");
                var getQuantity = document.getElementById("numberToAdd").value;
                for (i = 0; i < sizes.length; i++) {
                    if (sizes[i].checked) {
                        var getSize = sizes[i].value;
                    }
                }
                $.ajax({
                    url: "/ECommerce/addToCart",
                    type: "get",

                    data: {productID: param,
                        size: getSize,
                        quantity: getQuantity
                    },
                    success: function (response) {
                        alertify.success('Add to cart success');
                        var numP = document.getElementById("numP");
                        numP.innerHTML = response;
                        document.getElementById("numberToAdd").value = 1;
                    }

                });
            }
        </script>
        <script src="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/alertify.min.js"></script>
    </body>
</html>
