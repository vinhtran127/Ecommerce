<%-- 
    Document   : accountManager
    Created on : Feb 18, 2022, 10:00:14 AM
    Author     : vinh2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
            <!-- Page Header Start -->
            <div class="container-fluid bg-secondary mb-5">
                <div class="d-flex flex-column align-items-center justify-content-center" style="min-height: 300px">
                    <h1 class="font-weight-semi-bold text-uppercase mb-3">Manage account</h1>
                    <div class="d-inline-flex">
                        <p class="m-0"><a href="home">Home</a></p>
                        <p class="m-0 px-2">-</p>
                        <p class="m-0">Manage account</p>
                    </div>
                </div>
            </div>
            <!-- Page Header End -->  

            <div class="container">
                <div class="table-wrapper">
                    <div class="table-title">
                        <div class="row">
                            <div class="col-sm-6">
                                <h2>Manage <b>account</b></h2>
                                <h2 id="test"></h2>
                            </div>   

                        </div>
                    </div>
                    <table class="table table-striped table-hover">
                        <thead>
                            <tr>
                                <th>Email</th>
                                <th>Username</th>
                                <th>IsAdmin</th>
                                <th>IsCustomer</th>
                                <th>Send discount</th>

                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${listA}" var="o">
                            <tr>
                                <td>${o.email}</td>
                                <td>${o.username}</td>
                                <td><input onclick="checkAd(${o.accID})" id="checkAdmin${o.accID}" type="checkbox" ${o.isAdmin == true ? "checked":""}></td>
                                <td><input onclick="checkCus(${o.accID})" id="checkCus${o.accID}" type="checkbox" ${o.isCustomer == true ? "checked":""}></td>
                                <td><a onclick="sendDiscount(${o.accID},${o.email})" class="btn">Send discount</a></td>
                            </tr>
                        </c:forEach>

                    </tbody>
                </table>

            </div>
            <a href="home"><button type="button" class="btn btn-primary">Quay về trang chủ</button></a>

        </div>
        <!-- Edit Modal HTML -->


        <jsp:include page="footer.jsp"></jsp:include>
        <script>
            function checkCus(param) {
                var checkAdmin = document.getElementById("checkAdmin" + param);
                var checkCustomer = document.getElementById("checkCus" + param);
                $.ajax({
                    url: "/ECommerce/setRole",
                    type: "get",
                    data: {
                        accID: param,
                        isAdmin: checkAdmin.checked,
                        isCustomer: checkCustomer.checked
                    },
                    success: function (data) {
                        alertify.success('Modify role success');
                        console.log(checkAdmin.checked);
                        console.log(checkCustomer.checked);
                        document.getElementById("test").innerHTML+=data;
                    }

                });
            }
            function checkAd(param) {
                var checkAdmin = document.getElementById("checkAdmin" + param);
                var checkCustomer = document.getElementById("checkCus" + param);
                $.ajax({
                    url: "/ECommerce/setRole",
                    type: "get",
                    data: {
                        accID: param,
                        isAdmin: checkAdmin.checked,
                        isCustomer: checkCustomer.checked
                    },
                    success: function (data) {
                        alertify.success('Modify role success');
                    }

                });
            }
            function sendDiscount(accID, email) {
                $.ajax({
                    url: "/ECommerce/sendDiscount",
                    type: "get",
                    data: {
                        email: email,
                        accID: accID
                    },
                    success: function (data) {
                        alertify.success('Discount have been sent to ' + email + ' succesfully');
                    }

                });
            }


        </script>
        <script src="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/alertify.min.js"></script>

    </body>
</html>
