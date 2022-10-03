<%-- 
    Document   : cart
    Created on : Feb 17, 2022, 8:24:32 PM
    Author     : vinh2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/alertify.min.css"/>
        <!-- Default theme -->
        <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/default.min.css"/>
        <!-- Semantic UI theme -->
        <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/semantic.min.css"/>
        <!-- Bootstrap theme -->
        <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/bootstrap.min.css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <style>
            body {
                margin: 0;
                font-family: "Poppins", sans-serif;
                font-size: 1rem;
                font-weight: 400;
                line-height: 1.5;
                color: #6F6F6F;
                text-align: left;
                background-color: #fff;
            }
            #cart_items .cart_info .image {
                padding-left: 30px;
            }
            .table>thead:first-child>tr:first-child>td {
                border-top: 0;
            }
            .cart_info table tr td {
                border-top: 0 none;
                vertical-align: inherit;
            }
            .table-condensed>thead>tr>td {
                padding: 5px;
            }
            #cart_items .cart_info .cart_menu {
                background: #D19C97;
                color: #fff;
                font-size: 20px;
                font-family: 'Roboto', sans-serif;
                font-weight: normal;
            }
            .row-s:after {
                clear: both;
            }
            .row-s:after {
                display: table;
                content: " ";
            }
            .row-s {
                display: block !important;
                margin-right: -15px;
                margin-left: -15px;
            }
            @media (min-width: 768px){            
                .col-sm-6 {
                    width: 50% !important;
                }
            }
            .heading h3 {
                color: #363432;
                font-size: 20px;
                font-family: 'Roboto', sans-serif;
            }
            #do_action .total_area, #do_action .chose_area {
                border: 1px solid #E6E4DF;
                color: #696763;
                padding: 30px 25px 30px 0;
                margin-bottom: 80px;
            }
            .total_area ul li {
                background: #E6E4DF;
                color: #696763;
                margin-top: 10px;
                padding: 7px 20px;
            }
            ul li {
                list-style: none !important;
            }
            .btn {
                text-align: center !important;
                white-space: nowrap !important;
                vertical-align: middle !important;
                cursor: pointer !important;
                padding: 6px 12px !important;
                margin-bottom: 0 !important;
            }
            .update, .check_out {
                background: #D19C97 !important;
                border-radius: 0 !important;
                color: #FFFFFF !important;
                margin-top: 18px !important;
                border: none !important;
                padding: 5px 15px !important;
            }
            .update {
                margin-left: 40px;
            }
            .check_out {
                margin-left: 20px;
            }

        </style>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
            <!-- Page Header Start -->
            <div class="container-fluid bg-secondary mb-5">
                <div class="d-flex flex-column align-items-center justify-content-center" style="min-height: 300px">
                    <h1 class="font-weight-semi-bold text-uppercase mb-3">Our Shop</h1>
                    <div class="d-inline-flex">
                        <p class="m-0"><a href="home">Home</a></p>
                        <p class="m-0 px-2">-</p>
                        <p class="m-0">Cart</p>
                    </div>
                </div>
            </div>
            <!-- Page Header End -->    
            <section id="cart_items">
                <div class="container">
                    <div class="table-responsive cart_info">
                        <table class="table table-condensed">
                            <thead>
                                <tr class="cart_menu">
                                    <td class="image">Product</td>
                                    <td class="name">Image</td> 
                                    <td class="description">Size</td>
                                    <td class="price">Price</td>
                                    <td class="quantity">Quantity</td>
                                    <td class="total">Total</td>
                                    <td></td>
                                </tr>
                            </thead>
                            <tbody id="showOut">
                            <c:forEach items="${listCart}" var="o">
                                <tr>
                                    <td class="cart_product">
                                        <a href="">${o.productName}</a>

                                    </td>
                                    <td class="cart_img">
                                        <a href=""><img src="${o.imgLink}" width="120px" alt=""></a>
                                    </td>
                                    <td class ="cart_size">
                                        <p id="needToGet">${o.size}</p>
                                    </td>
                                    <td class="cart_price">
                                        <p>${o.price}₫</p>
                                    </td>
                                    <td class="cart_quantity">
                                        <div class="cart_quantity_button">
                                            <a onclick="setNewQuan(${o.productID},${o.quantity-1})" class="btn cart_quantity_up" >-</a>

                                            <input class="cart_quantity_input" type="text" name="quantity" value="${o.quantity}" readonly="" size="2">
                                            <a onclick="setNewQuan(${o.productID},${o.quantity+1})" class="btn cart_quantity_down" >+</a>

                                        </div>
                                    </td>
                                    <td class="cart_total">
                                        <p class="cart_total_price">${o.quantity * o.price}₫</p>
                                    </td>
                                    <td class="cart_delete">
                                        <a onclick="remove(${o.productID})" class="btn cart_quantity_delete"><i class="fa fa-times"></i></a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </section> <!--/#cart_items-->

        <section id="do_action">
            <div class="container">

                <div class="row-s">

                    <div class="col-sm-6" style="float: right">
                        <div class="heading">
                            <h3>Payment</h3>
                            <!--<p>Hãy chọn </p>-->
                        </div>
                        <div class="total_area">
                            <ul id="payment">
                                <li>Products payment    <span>${sessionScope.productPayment}₫</span></li>
                                <li>Transport fee       <span>Free</span></li>
                                <li>Total payment       <span>${sessionScope.productPayment}₫</span></li>
                            </ul>
                            <a class="btn btn-default update" href="home">Buy more</a>
                            <a class="btn btn-default check_out" href="checkout">Purchase</a>

                        </div>
                    </div>
                </div>
            </div>
        </section><!--/#do_action-->

        <jsp:include page="footer.jsp"></jsp:include>
        <script>
            function setNewQuan(pID, newQuan) {
                var getSize = document.getElementById("needToGet").innerHTML;

                if (newQuan > 0) {
                    $.ajax({
                        url: "/ECommerce/setNewQuan",
                        type: "get",

                        data: {productID: pID,
                            newQuan: newQuan,
                            size: getSize
                        },
                        success: function (data) {
                            var i = String(data).split("^");
                            var i1 = i[0];
                            var i2 = i[1];
                            document.getElementById("showOut").innerHTML = i1;
                            document.getElementById("payment").innerHTML = i2;
                            console.log("success");
                            console.log(newQuan);
                        }

                    });
                }else{
                    alert("quantity can not smaller than one");
                }
            }
            function remove(pID) {
                var getSize = document.getElementById("needToGet").innerHTML;
                $.ajax({
                    url: "/ECommerce/removeFromCart",
                    type: "get",

                    data: {productID: pID,
                        size: getSize
                    },
                    success: function (data) {
                        var i = String(data).split("^");
                        var i1 = i[0];
                        var i2 = i[1];
                        document.getElementById("showOut").innerHTML = i1;
                        document.getElementById("payment").innerHTML = i2;
                        console.log("success");
                    }

                });
            }

        </script>
        <script src="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/alertify.min.js"></script>
        <!--        <script src="js/jquery.js"></script>
                <script src="js/bootstrap.min.js"></script>
                <script src="js/jquery.scrollUp.min.js"></script>
                <script src="js/jquery.prettyPhoto.js"></script>
                <script src="js/main.js"></script>-->
    </body>
</html>
