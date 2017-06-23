package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/tooplate_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function file_change(f) {\n");
      out.write("                var reader = new FileReader();\n");
      out.write("                reader.onload = function (e) {\n");
      out.write("                    var img = document.getElementById(\"img\");\n");
      out.write("                    img.src = e.target.result;\n");
      out.write("                    img.style.display = \"inline\";\n");
      out.write("                };\n");
      out.write("                reader.readAsDataURL(f.files[0]);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <div class=\"left\">\n");
      out.write("\n");
      out.write("            <a href=\"FbLogin?code=profile&accessToken=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${accessToken}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                <img id=\"linh\" src=\"#\"/> \n");
      out.write("            </a>\n");
      out.write("            <div id=\"message\" style=\"color: red;\"></div> \n");
      out.write("            <form action=\"FbLogin?code=FileUploadServlet&accessToken=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${accessToken}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" method=\"post\"\n");
      out.write("                  enctype=\"multipart/form-data\" id=\"testform\">\n");
      out.write("                <tr>\n");
      out.write("                <input id=\"name\" type=\"hidden\" name=\"firstname\" value =\"\">\n");
      out.write("                <div id=\"message\" style=\"color: red\" name=\"namep\">\n");
      out.write("                </div>\n");
      out.write("                <a href=\"FbLogin?code=trangchu&accessToken=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${accessToken}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Trang chủ</a></br>\n");
      out.write("                </tr>\n");
      out.write("                <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("                <h1>File Upload Form</h1>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"right\">Chủ đề</td>\n");
      out.write("                    <td>\n");
      out.write("                        <div id = \"chon-wrap\">\n");
      out.write("                            <select id=\"chon\" name=\"chon\">\n");
      out.write("                                <option value=\"Gia đình\">Gia đình</option>\n");
      out.write("                                <option value=\"Bạn bè\">Bạn bè</option>\n");
      out.write("                                <option value=\"Công việc\">Công việc</option>\n");
      out.write("                                <option value=\"Thiên nhiên\">Thiên nhiên</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </td>\n");
      out.write("                </tr></br>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"file\" name=\"fileup\" accept =\"image/*\" size=\"30\" value=\"\" onchange=\"file_change(this)\"/><br /></td>\n");
      out.write("                    <td><img id=\"img\" style=\"display: none; width: 200px; height: 250px\"></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <div id = \"upload-wrap\">\n");
      out.write("                            <input type=\"submit\" value=\"Upload\" name=\"action\"/>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mains\">\n");
      out.write("            <a href=\"FbLogin?code=out&accessToken=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${accessToken}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >Đăng xuất</a>\n");
      out.write("            <div data-width=\"500\"> <img width=\"480\" height=\"400\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></div>\n");
      out.write("\n");
      out.write("            <div id=\"fb-root\"></div>\n");
      out.write("            <script>\n");
      out.write("                (function (d, s, id) {\n");
      out.write("                    var js, fjs = d.getElementsByTagName(s)[0];\n");
      out.write("                    if (d.getElementById(id))\n");
      out.write("                        return;\n");
      out.write("                    js = d.createElement(s);\n");
      out.write("                    js.id = id;\n");
      out.write("                    js.src = \"//connect.facebook.net/vi_VN/sdk.js#xfbml=1&version=v2.9&appId=1808355339414146\";\n");
      out.write("                    fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("                }(document, 'script', 'facebook-jssdk'));\n");
      out.write("\n");
      out.write("                var accessToken = \"");
      out.print( (String) request.getAttribute("accessToken"));
      out.write("\";\n");
      out.write("                console.log(accessToken);\n");
      out.write("\n");
      out.write("                window.fbAsyncInit = function () {\n");
      out.write("                    FB.api('/me/', 'GET', {\"fields\": \"cover\", \"access_token\": accessToken}, function (response) {\n");
      out.write("                        console.log(response);\n");
      out.write("                        var link = response.cover.source;\n");
      out.write("                        document.getElementById(\"linh\").setAttribute(\"src\", link);\n");
      out.write("                    }\n");
      out.write("                    );\n");
      out.write("\n");
      out.write("                    FB.api('/me', 'GET', {\"access_token\": accessToken}, function (response) {\n");
      out.write("                        console.log(response);\n");
      out.write("                        var element = document.getElementById('message');\n");
      out.write("                        element.innerHTML += response.name;\n");
      out.write("                    }\n");
      out.write("                    );\n");
      out.write("                };\n");
      out.write("            </script>\n");
      out.write("            <a href=\"#\">Xem trang cá nhân người đăng ảnh</a>\n");
      out.write("            ");
      out.write("\n");
      out.write("            <div class=\"fb-like\" data-href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${link}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" \n");
      out.write("                 data-layout=\"standard\" data-action=\"like\" data-size=\"small\" \n");
      out.write("                 data-show-faces=\"true\" data-share=\"true\"></div></br>\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            <div class=\"fb-comments\" \n");
      out.write("                 data-href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${link}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                 data-width=\"500\"\n");
      out.write("                 data-num-posts=\"10\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
