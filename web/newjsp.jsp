<%-- 
    Document   : newjsp
    Created on : Apr 20, 2017, 10:27:04 PM
    Author     : Diem
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        <div class="left">

            <a href="FbLogin?code=profile&accessToken=${accessToken}">
                <img id="linh" src="#"/> 
            </a>
            <div id="message" style="color: red;"></div> 
            <form action="FbLogin?code=FileUploadServlet&accessToken=${accessToken}" method="post"
                  enctype="multipart/form-data" id="testform">
                <tr>
                <input id="name" type="hidden" name="firstname" value ="">
                <div id="message" style="color: red" name="namep">
                </div>
                <a href="FbLogin?code=trangchu&accessToken=${accessToken}">Trang chủ</a></br>
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
                    <td>
                        <div id = "upload-wrap">
                            <input type="submit" value="Upload" name="action"/>
                        </div>
                    </td>
                </tr>
            </form>
        </div>
        <div class="mains">
            <a href="FbLogin?code=out&accessToken=${accessToken}" >Đăng xuất</a>
            <a href="FbLogin?code=user&accessToken=${accessToken}&id=${id}">Cuộn ảnh</a>
            <div data-width="500"> <img width="450" height="400" src="${name}"/></div>

            <div id="fb-root"></div>
            <script>
                (function (d, s, id) {
                    var js, fjs = d.getElementsByTagName(s)[0];
                    if (d.getElementById(id))
                        return;
                    js = d.createElement(s);
                    js.id = id;
                    js.src = "//connect.facebook.net/vi_VN/sdk.js#xfbml=1&version=v2.9&appId=1808355339414146";
                    fjs.parentNode.insertBefore(js, fjs);
                }(document, 'script', 'facebook-jssdk'));

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
                        element.innerHTML += response.name;
                    }
                    );
                };
            </script>

            <%--Nút like --%>
            <div class="fb-like" data-href="${link}" 
                 data-layout="standard" data-action="like" data-size="small" 
                 data-show-faces="true" data-share="true"></div></br>

            <%--Comment --%>
            <div class="fb-comments" 
                 data-href="${link}"
                 data-width="500"
                 data-num-posts="10">
            </div>
        </div>
    </body>
</html>
