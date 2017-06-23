<%-- 
    Document   : a
    Created on : Apr 19, 2017, 9:05:32 AM
    Author     : Diem
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    </head>
    <title></title>
</head>
<body>
    <div id="fb-root"></div>

    <script type="text/javascript">
        var accessToken = "<%= (String) request.getAttribute("accessToken")%>";
        console.log(accessToken);

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
                var name = response.id;
                element.innerHTML += response.name;
                document.getElementById("name").setAttribute("value", name);
            }
            );
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
<!--    <h1>${name}</h1>-->
    <table>
        <a href="FbLogin?code=trangchu&accessToken=${accessToken}">Trang chủ</a></br>
        <a href="FbLogin?code=out&accessToken=${accessToken}" >Đăng xuất</a>
        <tbody>
            <c:forEach var="item" items="${photos}">
            <td data-width="500">
                <a href="FbLogin?code=img&name=${item.link}&accessToken=${accessToken}&id=${item.name}" > 
                    <img width="200" height="150" src="${item.link}"/>
                </a></br>
            </td>
        </c:forEach>
    </tbody>
</table>


</body>
</html>