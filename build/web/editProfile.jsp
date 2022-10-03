<%-- 
    Document   : editProfile
    Created on : Mar 21, 2022, 9:27:54 AM
    Author     : vinh2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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

                    <form action="saveEditProfile" method="post">
                        <h2>Edit your profile</h2>
                        <table style="width: 150%" >
                            <tbody>
                                <tr>
                                    <td>Email: </td>
                                    <td><input type="email" name= "email" value="${email}" readonly/></td>
                            </tr>
                            <tr>
                                <td>Phone: </td>
                                <td><input type="text" name= "phone" placeholder="Phone number" value="${phone}" /></td>

                            </tr>
                            <tr>
                                <td>Fullname: </td>
                                <td><input type="text" name="fullname" placeholder="Your Full Name" value="${fullname}" required/></td>

                            </tr>
                            <tr>
                                <td>Username: </td>
                                <td><input type="text" name="username" placeholder="Username" required value="${username}"/></td>

                            </tr>
                            <tr>
                                <td>Address: </td>
                                <td><input type="text" name="address" placeholder="address" required value="${address}"/></td>

                            </tr>
                            <tr>
                                <td>Sercurity ques: </td>
                                <td>
                                    <select name="securityQues">
                                        <option value="What was your first car?"  ${sQues=="What was your first car?"?selected:""}>What was your first car?</option>
                                        <option value ="What is the name of your first pet?" ${sQues=="What is the name of your first pet?"?selected:""}>What is the name of your first pet?</option>
                                        <option value="What elementary school did you attend?" ${sQues=="What elementary school did you attend?"?selected:""}>What elementary school did you attend?</option>
                                        <option value="What is the name of the town where you were born?" ${sQues=="What is the name of the town where you were born?"?selected:""}>What is the name of the town where you were born?</option>
                                    </select>
                                </td>

                            </tr>
                            <tr>
                                <td>Sercurity answer: </td>
                                <td>
                                    <input type="text" name="answer" value="${sAnswer}" placeholder="Answer"/> 
                                </td>

                            </tr>
                        </tbody>
                    </table>
                    <p class="text-warning">${mess1}</p> 
                    <input type="submit" value="Save" />
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
        <script src="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/alertify.min.js"></script>
    </body>
</html>
