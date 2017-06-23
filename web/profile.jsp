<%-- 
    Document   : newjsp1
    Created on : Apr 25, 2017, 9:44:36 PM
    Author     : Diem
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <ti href="css/tooplate_style.css" rel="stylesheet" type="text/css" />
</head>
<link href="css/tooplate_style.css" rel="stylesheet" type="text/css" />
</head>
<body style="body{font-family: arial; font-size: 12px ; padding: 0px; margin: 0px}">
    <div class="warpper">
        <script type="text/javascript">
            var accessToken = "<%= (String) request.getAttribute("accessToken")%>";
            console.log(accessToken);
            var name;
            window.fbAsyncInit = function () {
                FB.api('/me/', 'GET', {"fields": "cover", "access_token": accessToken}, function (response) {
                    console.log(response);
                    var link = response.cover.source;
                    document.getElementById("linh").setAttribute("src", link);
                }
                );
                FB.api('/me', 'GET', {"access_token": accessToken}, function (response) {
                    console.log(response);
                    var element = document.getElementById('message');
                    name = response.id;
                    element.innerHTML += response.name;
                    document.getElementById("namep").setAttribute("value", name);
                    document.getElementById("namef").setAttribute("value", name);
                    document.getElementById("namen").setAttribute("value", name);
                    document.getElementById("namej").setAttribute("value", name);
                    document.getElementById("namea").setAttribute("value", name);
                }
                );
            };

            (function (d) {
                var js, id = 'facebook-jssdk', ref = d.getElementsByTagName('script')[0];
                if (d.getElementById(id)) {
                    return;
                }
                js = d.createElement('script');
                js.id = id;
                js.async = true;
                js.src = "//connect.facebook.net/en_US/all.js";
                ref.parentNode.insertBefore(js, ref);
            }(document));
        </script>

        <img  width="900" height="350" id="linh" src=""/>
        <div id="message" style="color: red" name="namep"></div>

        <a href="FbLogin?code=trangchu&accessToken=${accessToken}" class = "trang-chu">Trang chủ</a>

        <div class="new-product">
            <a href="FbLogin?code=out&accessToken=${accessToken}" >Đăng xuất</a>

            <ul>
                <li>
                    <div data-width="200" class="box">
                        <form method="post" action="FbLogin?code=chude&chude=friend&accessToken=${accessToken}">
                            <input id="namep" type="hidden" name="firstname" value ="">
                            <input id="linh" type="image" src="./img/c.jpg" width="150" height="150"></br>
                            <h2>Bạn bè</h2>
                        </form> 

                </li>
                <li>
                    <div data-width="200" class="box"> 
                        <form method="post" action="FbLogin?code=chude&chude=family&accessToken=${accessToken}">
                            <input id="namef" type="hidden" name="firstname" value ="">
                            <input id="linh" type="image" src="./img/113.jpg" width="150" height="150">
                            <h2>Gia đình</h2>
                        </form>  
                </li>
                <li>
                    <div data-width="200" class="box"> 
                        <form method="post" action="FbLogin?code=chude&chude=natual&accessToken=${accessToken}">
                            <input id="namen" type="hidden" name="firstname" value ="">
                            <input id="linh" type="image" src="./img/2.jpg" width="150" height="150">
                            <h2>Thiên nhiên</h2>
                        </form> 
                </li>



                <li>
                    <div data-width="200" class="box"> 
                        <form method="post" action="FbLogin?code=chude&chude=job&accessToken=${accessToken}">
                            <input id="namej" type="hidden" name="firstname" value ="">
                            <input id="linh" type="image" src="./img/11.jpg" width="150" height="150">
                            <h2>Công việc</h2>
                        </form> 
                </li>

                <li>
                    <div data-width="200" class="box"> 
                        <form method="post" action="FbLogin?code=chude&chude=all&accessToken=${accessToken}">
                            <input id="namea" type="hidden" name="firstname" value ="">
                            <input id="linh" type="image" src="./img/5927208k0724_3.jpg" width="150" height="150">
                            <h2>Cuộn ảnh</h2>
                        </form> 
                </li>
            </ul>
        </div>
    </div>
</body>
</html>