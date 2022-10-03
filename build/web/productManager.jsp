<%-- 
    Document   : productManager
    Created on : Feb 18, 2022, 10:00:35 AM
    Author     : vinh2
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>JSP Page</title>
        <!--<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">-->
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">-->
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
            body {
                font-family: "Helvetica Neue",Helvetica,Arial,sans-serif;
                font-size: 14px;
                line-height: 1.428571429;
                color: #333;
                background-color: #fff;
            }
            .table-title {
                padding-bottom: 15px;
                background: #D19C97;
                color: #fff;
                padding: 16px 30px;
                margin: -20px -25px 10px;
                border-radius: 3px 3px 0 0;
            }
            .table-wrapper {
                background: #fff;
                padding: 20px 25px;
                margin: 30px 0;
                border-radius: 3px;
                box-shadow: 0 1px 1px rgb(0, 0, 0, / 5%);
            }
            .table>thead>tr>th {
                vertical-align: bottom;
                border-bottom: 2px solid #ddd;
            }
            .rowss {
                display:block !important;
                margin-right: -15px;
                margin-left: -15px;
            }
            .rowss:after {
                display: table;
                content: " ";
            }
            .rowss:after {
                clear: both;
            }
            .rowss:before {
                display: table;
                content: " ";
            }
            @media (min-width: 768px){
                .col-sm-6 {
                    width: 50%;
                    float: left;
                }
            }

            .btn-success {
                color: #fff;
                background-color: gray !important;
            }
            .table-title {
                color: #fff;
            }
            .table>thead>tr>th, .table>tbody>tr>th, .table>tfoot>tr>th, .table>thead>tr>td, .table>tbody>tr>td, .table>tfoot>tr>td {
                padding: 8px;
                line-height: 1.428571429;
            }
            .table-title h2 {
                margin: 5px 0 0;
                font-size: 24px;
            }
            h2 {
                display: block;
                font-size: 1.5em;
                margin-block-start: 0.83em;
                margin-block-end: 0.83em;
                margin-inline-start: 0px;
                margin-inline-end: 0px;
                font-weight: bold;
            }
            h2{
                line-height: 1.1;
                color: #fff;

            }
            .btn {
                display: inline-block !important;
                padding: 6px 12px ;
                margin-bottom: 0 !important;
                font-weight: normal !important;
                line-height: 1.428571429 !important;
                text-align: center !important;
                white-space: nowrap !important;
                vertical-align: middle !important;
                cursor: pointer !important;
                background-image: none;
                user-select: none;
            }
            .table-title .btn {
                color: #fff;
                float: right;
                font-size: 13px;
                border: none;
                min-width: 50px;
                border-radius: 2px;
                border: none;
                outline: none !important;
                margin-left: 10px;
            }

            .material-icons {
                font-family: 'Material Icons';
                font-weight: normal;
                font-style: normal;
                font-size: 24px;
                line-height: 1;
                letter-spacing: normal;
                text-transform: none;
                display: inline-block;
                white-space: nowrap;
                word-wrap: normal;
                direction: ltr;
                -webkit-font-feature-settings: 'liga';
                -webkit-font-smoothing: antialiased;
            }
            .table-title .btn i {
                float: left;
                font-size: 21px;
                margin-right: 5px;
            }
            th {
                font-size: 14px !important;
                text-align: left !important;
                display: table-cell;
                font-weight: bold;
            }
            table {
                border-collapse: collapse;
                border-spacing: 0;
            }
            .table>thead>tr>th {
                vertical-align: bottom;
                border-bottom: 2px solid #ddd;
            }
            table.table tr th:last-child {
                width: 100px;
            }
            .hint-text {
                float: left;
                margin-top: 10px;
                font-size: 13px;
            }
            .table {
                width: 100%;
                margin-bottom: 20px;
            }
            .table-striped>tbody>tr:nth-child(odd)>td {
                background-color: #f9f9f9;
            }
            .table>tbody>tr>td{
                padding: 8px;
                line-height: 1.428571429;
                vertical-align: top;
                border-top: 1px solid #ddd;
            }
            a {
                transition: 300ms;
                background: transparent;
                color: #428bca;
                text-decoration: none;
            }
            .pagination li a {
                border: none;
                font-size: 13px;
                min-width: 30px;
                min-height: 30px;
                color: #999;
                margin: 0 2px;
                line-height: 30px;
                border-radius: 2px !important;
                text-align: center;
                padding: 0 6px;
            }
            .pagination li a{
                background-color: #f0f0e9;
                border: 0;
                float: left;
                line-height: 1.42857;
                margin-left: -1px;
                padding: 6px 12px;
                position: relative;
                text-decoration: none;
                margin-right: 5px;
                color: #000;
            }
            .pagination {
                float: right;
                margin: 0 0 5px;
            }
            pagination {
                display: inline-block;
                padding-left: 0;
                margin: 20px 0;
                border-radius: 4px;
            }
            .pagination {
                display: inline-block;
                margin-bottom: 25px;
                margin-top: 0;
                padding-left: 15px;
            }
            ul {
                display: block;
                list-style-type: disc;
                margin-block-start: 1em;
                margin-block-end: 1em;
                margin-inline-start: 0px;
                margin-inline-end: 0px;
                padding-inline-start: 40px;
            }
            /*            .pagination li.active a, .pagination li.active a.page-link {
                            background: #D19C97;
                        }*/
            .active {
                background: #D19C97 !important;
            }
            .clearfix:before {
                display: table;
                content: " ";
            }
            .clearfix:before, .clearfix:after {
                display: table !important;
                content: " " ;
                clear: both !important;
            }
        </style>
    </head>
    <body>

        <jsp:include page="header.jsp"></jsp:include>

            <div id="addEmployeeModal" class="modal fade">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <form action="addProduct" method="post" enctype="multipart/form-data">
                            <div class="modal-header">						
                                <h4 class="modal-title">Add more product</h4>
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            </div>
                            <div class="modal-body">					

                                <div class="form-group">
                                    <label>Product name</label>
                                    <input name="name" type="text" class="form-control" required placeholder="Product name">
                                </div>
                                <div class="form-group">
                                    <label>Description</label>
                                    <textarea name="description" type="text" class="form-control" placeholder="description"></textarea>
                                </div>
                                <div class="form-group">
                                    <label>Price</label>
                                    <input type="number" name="price" min="0" class="form-control" required placeholder="Ex: 100000">
                                </div>
                                <div class="form-group">
                                    <label>Image</label>
                                    <input onchange="previewFile()" type="file" name="imgFile" class="form-control" required>
                                    <img src="" height="200" alt="Image preview...">

                                </div>
                                <div class="form-group">
                                    <label>Quantity</label>
                                    <input type="number" name="quantity" class="form-control" min="0" required placeholder="Quantity">
                                </div>
                                <div class="form-group">
                                    <label>Size</label>
                                    <input name="size" class="form-control" required value="S">
                                </div>
                                <div class="form-group">
                                    <label>Category</label>
                                    <select name="category" class="form-select" aria-label="Default select example">
                                    <c:forEach items="${listC}" var="o">
                                        <option value="${o.categoryID}">${o.title}</option>
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Product name</label>
                                <select name="available" required>
                                    <option  class="form-control" value="true">Enable</option>   
                                    <option  class="form-control" value="false">Disable</option>   
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Sale(%)</label>
                                <input type="number" name="sale" class="form-control" required value="S">
                            </div>
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-success" value="Add">
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="rowss">
                        <div class="col-sm-6">
                            <h2>Manage <b>Product</b></h2>
                        </div>
                        <a href="#addEmployeeModal"  class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add product</span></a>
                    </div>
                </div>
                <form action="searchProduct" method="post" style="width: 300px !important;">
                    <div class="input-group" >
                        <input name="txt" type="text" class="form-control" placeholder="Search product" >
                        <div class="input-group-append">
                            <button class="input-group-text bg-transparent text-primary">
                                <i class="fa fa-search"></i>
                            </button>
                        </div>
                    </div>
                </form>
                <table class="table table-striped table-hover">
                    <thead>
                        <tr>
                            <th>Available</th>
                            <th>Product</th>
                            <th>Quantity</th>
                            <th>Image</th>
                            <th>Price</th>
                            <th>Sale</th>
                            <th>Edit/Delete</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${listP}" var="o">
                            <tr>
                                <c:if test="${o.available == true}">
                                    <td>On shop</td>
                                </c:if>
                                <c:if test="${o.available == false}">
                                    <td style="color:red">Stop</td>
                                </c:if>
                                <td>${o.name}</td>
                                <td>${o.quantity}</td>
                                <td>
                                    <img width="120px" src="${o.img}">
                                </td>
                                <td>${o.price}₫</td>
                                <td>${o.sale}%</td>
                                <td>
                                    <a href="editProduct?pid=${o.productID}" ><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                                    <a href="#" onclick="alertUser(${o.productID})" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                                </td>
                            </tr>
                        </c:forEach>

                    </tbody>
                </table>
                <p class="alert-warning">${messAlert}</p>
                <p class="alert-success">${messSuccess}</p>

                <div class="clearfix">
                    <c:if test="${page<endPage}">
                        <div class="hint-text">Show out <b>6</b> in <b>${allProduct}</b> products</div>
                    </c:if>
                    <c:if test="${page >= endPage}">
                        <div class="hint-text">Show out <b>${numInEnd}</b> in <b>${allProduct}</b> products</div>
                    </c:if>

                    <nav aria-label="Page navigation">
                        <ul class="pagination justify-content-center mb-3">
                            <li class="pagfootere-item disabled">
                                <a class="page-link" href="${sessionScope.servs}?index=${page!=1?(page-1):(page)}&txt=${txtSearch}" aria-label="Previous">
                                    <span aria-hidden="true">&laquo;</span>
                                    <span class="sr-only">Previous</span>
                                </a>
                            </li>
                            <c:forEach begin="1" end="${endPage}" var="i">
                                <li class="page-item "><a class=" ${page == i ?"active":""} page-link btn btn-default" href="${sessionScope.servs}?index=${i}&txt=${txtSearch}">${i}</a></li>
                                </c:forEach>
                            <li class="page-item">
                                <a class="page-link" href="${sessionScope.servs}?index=${page!=endPage?(page+1):(page)}&txt=${txtSearch}" aria-label="Next">
                                    <span aria-hidden="true">&raquo;</span>
                                    <span class="sr-only">Next</span>
                                </a>
                            </li>
                        </ul>
                    </nav>
                </div>
            </div>
            <a href="home"><button type="button" class="btn btn-primary">Back to home</button></a>
        </div>

        <jsp:include page="footer.jsp"></jsp:include>
        <script>
            function alertUser(productID) {
                var option = confirm('Are you sure to delete?');
                if (option === true) {
                    window.location.href = 'deleteProduct?pid=' + productID;
                }
            }
            function previewFile() {
                var preview = document.querySelector('img');
                var file = document.querySelector('input[type=file]').files[0];
                var reader = new FileReader();
                reader.onloadend = function () {
                    preview.src = reader.result;
                };
                if (file) {
                    reader.readAsDataURL(file);
                } else {
                    preview.src = "";
                }
            }
        </script>
    </body>
</html>
