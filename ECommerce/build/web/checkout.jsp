<%-- 
    Document   : checkout
    Created on : Feb 17, 2022, 10:00:45 PM
    Author     : vinh2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page = "header.jsp"></jsp:include>
            <!-- Page Header Start -->
            <div class="container-fluid bg-secondary mb-5">
                <div class="d-flex flex-column align-items-center justify-content-center" style="min-height: 300px">
                    <h1 class="font-weight-semi-bold text-uppercase mb-3">Checkout</h1>
                    <div class="d-inline-flex">
                        <p class="m-0"><a href="home">Home</a></p>
                        <p class="m-0 px-2">-</p>
                        <p class="m-0">Checkout</p>
                    </div>
                </div>
            </div>
            <!-- Page Header End -->

            <form action="verifyBuying" method="get">

                <!-- Checkout Start -->
                <div class="container-fluid pt-5">
                    <div class="row px-xl-5">
                        <div class="col-lg-6">
                            <div class="mb-4">
                                <h4 class="font-weight-semi-bold mb-4">Billing Address</h4>
                                <div class="row">
                                    <div class="col-md-12 form-group">
                                        <label>Full name</label>
                                        <input class="form-control" type="text" value="${sessionScope.acc.fullname}" required>
                                </div>
                                <div class="col-md-12 form-group">
                                    <label>E-mail</label>
                                    <input class="form-control"  type="email" value="${sessionScope.acc.email}" required readonly>
                                </div>
                                <div class="col-md-12 form-group">
                                    <label>Number phone</label>
                                    <input class="form-control" type="text" value ="${sessionScope.acc.phone}">
                                </div>
                                <div class="col-md-12 form-group">
                                    <label>Address</label>
                                    <c:forEach items="${listAddress}" var="o">
                                        <c:if test="${o.defaultAdd == true}">
                                            <input name="address" class="form-control" type="text" value ="${o.address}">
                                        </c:if>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="card border-secondary mb-5">
                            <div class="card-header bg-secondary border-0">
                                <h4 class="font-weight-semi-bold m-0">Order Total</h4>
                            </div>
                            <div class="card-body">
                                <h5 class="font-weight-medium mb-3">Products</h5>
                                <c:forEach items="${listCart}" var="i">
                                    <div class="d-flex justify-content-between">
                                        <p>${i.productName} x ${i.quantity}  (${i.size})</p>
                                        <p>${i.price*i.quantity}₫</p>
                                    </div>
                                </c:forEach>    

                            </div>
                            <div class="card-footer border-secondary bg-transparent">
                                <div class="d-flex justify-content-between mt-2">
                                    <h5 class="font-weight-bold">Total</h5>
                                    <h5 class="font-weight-bold">${sessionScope.productPayment}</h5>
                                </div>
                            </div>
                        </div>
                        <div class="card border-secondary mb-5">

                            <div class="card-header bg-secondary border-0">
                                <h4 class="font-weight-semi-bold m-0">Payment</h4>
                            </div>
                            <div class="card-body">
                                <div class="form-group">
                                    <div class="custom-control custom-radio">
                                        <input type="radio" class="custom-control-input" name="payment" id="paypal" value="Paypal">
                                        <label class="custom-control-label" for="paypal">Paypal</label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="custom-control custom-radio">
                                        <input type="radio" class="custom-control-input" name="payment" id="directcheck" value="Direct Check">
                                        <label class="custom-control-label" for="directcheck">Direct Check</label>
                                    </div>
                                </div>
                                <div class="">
                                    <div class="custom-control custom-radio">
                                        <input type="radio" class="custom-control-input" name="payment" id="banktransfer" value="Bank Transfer">
                                        <label class="custom-control-label" for="banktransfer">Bank Transfer</label>
                                    </div>
                                </div>
                            </div>
                            <div class="card-footer border-secondary bg-transparent">
                                <button class="btn btn-lg btn-block btn-primary font-weight-bold my-3 py-3">Place Order</button>
                            </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Checkout End -->

            <jsp:include page="footer.jsp"></jsp:include>
            <!--        <script>
                        function verifier() {
                            var getCheck = document.getElementsByName("payment");
                            for (i = 0; i < getCheck.length; i++) {
                                if (getCheck[i].checked) {
                                    var result = getCheck[i].value;
                                }
                            }
                            $.ajax({
                                url: "/ECommerce/verifyBuying",
                                type: "get",
                    
                                data: {
                                    result: result
                                },
                                success: function (data) {
                                    console.log(result);
                                }
                    
                            });
                        }
                    </script>-->
            <script src="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/alertify.min.js"></script>

    </body>
</html>
