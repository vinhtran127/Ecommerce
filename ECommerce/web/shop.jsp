<%-- 
    Document   : Shop
    Created on : Feb 17, 2022, 10:05:45 PM
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
            .page-link {
                position: relative !important; 
                display: block !important;
                padding: 0.5rem 0.75rem !important;
                margin-left: -1px !important;
                line-height: 1.25 !important;
                color: #D19C97 !important;
                background-color: #fff !important;
                border: 1px solid #dee2e6 !important;
            } 
            .page-item .active{
                background-color: #D19C97 !important;
                border-color: #D19C97 !important;
                color: black !important;
            }
        </style>
    </head>
    <body>
        <jsp:include page = "header.jsp"></jsp:include>
            <!-- Page Header Start -->
            <div class="container-fluid bg-secondary mb-5">
                <div class="d-flex flex-column align-items-center justify-content-center" style="min-height: 300px">
                    <h1 class="font-weight-semi-bold text-uppercase mb-3">Our Shop</h1>
                    <div class="d-inline-flex">
                        <p class="m-0"><a href="home">Home</a></p>
                        <p class="m-0 px-2">-</p>
                        <p class="m-0">Shop</p>
                    </div>
                </div>
            </div>
            <!-- Page Header End -->


            <!-- Shop Start -->
            <div class="container-fluid pt-5">
                <div class="row px-xl-5">
                    <!-- Shop Product Start -->
                    <div class="col-lg-12 col-md-12">
                        <div class="row pb-3">
                            <div class="col-12 pb-1">
                                <div class="d-flex align-items-center justify-content-between mb-4">
                                    <form action="search" method="post">
                                        <div class="input-group">
                                            <input name="txt" type="text" class="form-control" placeholder="Search by name">
                                            <div class="input-group-append">
                                                <button class="input-group-text bg-transparent text-primary">
                                                    <i class="fa fa-search"></i>
                                                </button>
                                            </div>
                                        </div>
                                    </form>
                                    <div class="dropdown ml-4">
                                        <button class="btn border dropdown-toggle" type="button" id="triggerId" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                            Sort by
                                        </button>
                                        <div class="dropdown-menu dropdown-menu-right" aria-labelledby="triggerId">
                                            <a class="dropdown-item" href="sort?cateID=${sessionScope.cateID}&txt=${txtSearch}&option=1&index=1">Latest</a>
                                        <a class="dropdown-item" href="sort?cateID=${sessionScope.cateID}&txt=${txtSearch}&option=2&index=1">Popularity</a>
                                        <a class="dropdown-item" href="sort?cateID=${sessionScope.cateID}&txt=${txtSearch}&option=3&index=1">Price</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <c:forEach items="${sessionScope.listP}" var="o">
                            <div class="col-lg-4 col-md-6 col-sm-12 pb-1">
                                <div class="card product-item border-0 mb-4">
                                    <div class="card-header product-img position-relative overflow-hidden bg-transparent border p-0">
                                        <img class="img-fluid w-100" src="img/product-1.jpg" alt="">
                                    </div>
                                    <div class="card-body border-left border-right text-center p-0 pt-4 pb-3">
                                        <h6 class="text-truncate mb-3">${o.name}</h6>
                                        <div class="d-flex justify-content-center">
                                            <h6>${o.price*(100-o.sale)/100}</h6>
                                            <h6 class="text-muted ml-2" style=${o.sale ==0?"display:none;":"display:inline-block;"} ><del>${o.price}</del></h6>
                                        </div>
                                    </div>
                                    <div class="card-footer d-flex justify-content-between bg-light border">
                                        <a href="detail?productID=${o.productID}" class="btn btn-sm text-dark p-0"><i class="fas fa-eye text-primary mr-1"></i>View
                                            Detail
                                        </a>
                                        <c:if test="${sessionScope.acc.isAdmin==false||sessionScope.acc.isAdmin==null}">
                                            <c:if test="${o.quantity>0}">
                                                <a onclick="addToCart(${o.productID})" class="btn btn-sm text-dark p-0"><i
                                                        class="fas fa-shopping-cart text-primary mr-1"></i>Add To Cart</a>
                                                </c:if>
                                                <c:if test="${o.quantity==0}">
                                                <p class="text-warning">Sold out</p>
                                            </c:if>
                                        </c:if>
                                    </div>

                                </div>
                            </div>
                        </c:forEach>
                        <div class="col-12 pb-1">
                            <nav aria-label="Page navigation">
                                <ul class="pagination justify-content-center mb-3">
                                    <li class="pagfootere-item disabled">
                                        <a class="page-link" href="${sessionScope.serv}?cateID=${sessionScope.cateID}&txt=${txtSearch}&option=${option}&index=${page!=1?(page-1):(page)}" aria-label="Previous">
                                            <span aria-hidden="true">&laquo;</span>
                                            <span class="sr-only">Previous</span>
                                        </a>
                                    </li>
                                    <c:forEach begin="1" end="${endPage}" var="i">
                                        <li class="page-item active"><a class="page-link ${page == i ?"active":""} btn btn-default" href="${sessionScope.serv}?cateID=${sessionScope.cateID}&txt=${txtSearch}&option=${option}&index=${i}">${i}</a></li>
                                        </c:forEach>
                                    <li class="page-item">
                                        <a class="page-link" href="${sessionScope.serv}?cateID=${sessionScope.cateID}&txt=${txtSearch}&option=${option}&index=${page!=endPage?(page+1):(page)}" aria-label="Next">
                                            <span aria-hidden="true">&raquo;</span>
                                            <span class="sr-only">Next</span>
                                        </a>
                                    </li>
                                </ul>
                            </nav>
                        </div>
                    </div>
                </div>
                <!-- Shop Product End -->
            </div>
        </div>
        <!-- Shop End -->
        <jsp:include page = "footer.jsp"></jsp:include>
        <script>
            function addToCart(param) {
                $.ajax({
                    url: "/ECommerce/addToCart",
                    type: "get",

                    data: {productID: param,
                        quantity: 1
                    },
                    success: function (response) {
                        alertify.success('Add to cart success');
                        var numP = document.getElementById("numP");
                        numP.innerHTML = response;
                    }

                });
            }
        </script>
        <script src="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/alertify.min.js"></script>

    </body>
</html>
