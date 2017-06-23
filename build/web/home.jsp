<%-- 
    Document   : a
    Created on : Apr 19, 2017, 9:05:32 AM
    Author     : Diem
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    </head>
    <link href="css/tooplate_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <script type="text/javascript">
        function file_change(f) {
            var reader = new FileReader();
            reader.onload = function (e) {
                var img = document.getElementById("img");
                img.src = e.target.result;
                img.style.display = "inline";
            };
            reader.readAsDataURL(f.files[0]);
        }
    </script>

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
                var name = response.name;
                var id = response.id;
                element.innerHTML += response.name;
                document.getElementById("name").setAttribute("value", id);
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
    <div class="left">
        <a href="FbLogin?code=profile&accessToken=${accessToken}">
            <img id="linh" src="#"/> 
        </a>
        <form action="FbLogin?code=FileUploadServlet&accessToken=${accessToken}" method="post"
              enctype="multipart/form-data" id="testform">
            <tr>
            <input id="name" type="hidden" name="firstname" value ="">
            <div id="message" style="color: #FF9800;" name="namep"></div>
            </tr>
            <h1>${message}</h1>
            <h1>File Upload Form</h1>
            <tr>
                <td align="right">Chủ đề</td>
                <td>
                <div id = "chon-wrap">
                    <select id="chon" name="chon">
                        <option value="Gia đình">Gia đình</option>
                        <option value="Bạn bè">Bạn bè</option>
                        <option value="Công việc">Công việc</option>
                        <option value="Thiên nhiên">Thiên nhiên</option>
                    </select>
                </div>
                </td>
            </tr></br>

            <tr>
                <td><input type="file" name="fileup" accept ="image/*" size="30" value="" onchange="file_change(this)"/><br /></td>
                <td><img id="img" style="display: none; width: 200px; height: 150px"></td>
            </tr>

            <tr>
                <div id = "upload-wrap">
                <td><input type="submit" value="Upload" name="action"/></td>
                </div>
            </tr>
        </form></br></br>
        <h1>Form tìm kiếm</h1>
        <form action="FbLogin?code=seach&accessToken=${accessToken}" method="post">
            <table>
                <td><input type="text" name="timkiem" value="" placeholder="hh:mm:ss dd/MM/yyyy"/></td>

                <td><input type="submit" value="Tìm kiếm"></td>
            </table>
        </form>
    </div>
    <div class="mains">
        <a href="FbLogin?code=out&accessToken=${accessToken}" >Đăng xuất</a>
        <div class="new-product">
            <h2>${mg}</h2>
            <c:forEach var="item" items="${photos}">
                <ul>
                    <li>
                        <div data-width="500" class="box">
                            <a href="FbLogin?code=img&name=${item.link}&accessToken=${accessToken}&id=${item.name}" > 
                                <img width="200" height="150" src="${item.link}"/>
                            </a></br>
                        </div>
                    </li>
                </ul>
            </c:forEach>
        </div>
    </div>
</div>
</body>
</html>