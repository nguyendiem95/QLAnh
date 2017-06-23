package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <ti href=\"css/tooplate_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("        <link href=\"css/tooplate_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body style=\"body{font-family: arial; font-size: 12px ; padding: 0px; margin: 0px}\">\n");
      out.write("        <div class=\"warpper\">\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            var accessToken = \"");
      out.print( (String) request.getAttribute("accessToken"));
      out.write("\";\n");
      out.write("            console.log(accessToken);\n");
      out.write("            var name;\n");
      out.write("            window.fbAsyncInit = function () {\n");
      out.write("                FB.api('/me/', 'GET', {\"fields\": \"cover\", \"access_token\": accessToken}, function (response) {\n");
      out.write("                    console.log(response);\n");
      out.write("                    var link = response.cover.source;\n");
      out.write("                    document.getElementById(\"linh\").setAttribute(\"src\", link);\n");
      out.write("                }\n");
      out.write("                );\n");
      out.write("\n");
      out.write("                FB.api('/me', 'GET', {\"access_token\": accessToken}, function (response) {\n");
      out.write("                    console.log(response);\n");
      out.write("                    var element = document.getElementById('message');\n");
      out.write("                    name = response.name;\n");
      out.write("                    element.innerHTML += response.name;\n");
      out.write("                    document.getElementById(\"namep\").setAttribute(\"value\", name);\n");
      out.write("                    document.getElementById(\"namef\").setAttribute(\"value\", name);\n");
      out.write("                    document.getElementById(\"namen\").setAttribute(\"value\", name);\n");
      out.write("                    document.getElementById(\"namej\").setAttribute(\"value\", name);\n");
      out.write("                }\n");
      out.write("                );\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            (function (d) {\n");
      out.write("                var js, id = 'facebook-jssdk', ref = d.getElementsByTagName('script')[0];\n");
      out.write("                if (d.getElementById(id)) {\n");
      out.write("                    return;\n");
      out.write("                }\n");
      out.write("                js = d.createElement('script');\n");
      out.write("                js.id = id;\n");
      out.write("                js.async = true;\n");
      out.write("                js.src = \"//connect.facebook.net/en_US/all.js\";\n");
      out.write("                ref.parentNode.insertBefore(js, ref);\n");
      out.write("            }(document));\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <img  width=\"900\" height=\"400\" id=\"linh\" src=\"\"/>\n");
      out.write("        <div id=\"message\" style=\"color: red\" name=\"namep\"></div>\n");
      out.write("\n");
      out.write("        <a href=\"FbLogin?code=trangchu&accessToken=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${accessToken}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class = \"trang-chu\">Trang chủ</a>\n");
      out.write("   \n");
      out.write("    <div class=\"new-product\">\n");
      out.write("        <a href=\"FbLogin?code=out&accessToken=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${accessToken}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >Đăng xuất</a>\n");
      out.write("   \n");
      out.write("        <ul>\n");
      out.write("            <li>\n");
      out.write("                <div data-width=\"200\" class=\"box\">\n");
      out.write("                    <form method=\"post\" action=\"FbLogin?code=chude&chude=friend&accessToken=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${accessToken}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <input id=\"namep\" type=\"hidden\" name=\"firstname\" value =\"\">\n");
      out.write("                        <input id=\"linh\" type=\"image\" src=\"./img/5927208k0724_3.jpg\" width=\"50\" height=\"50\">\n");
      out.write("                        <a>Bạn bè</a>\n");
      out.write("                    </form> \n");
      out.write("\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <div data-width=\"200\" class=\"box\"> \n");
      out.write("                    <form method=\"post\" action=\"FbLogin?code=chude&chude=family&accessToken=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${accessToken}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <input id=\"namef\" type=\"hidden\" name=\"firstname\" value =\"\">\n");
      out.write("                        <input id=\"linh\" type=\"image\" src=\"./img/5927208k0724_3.jpg\" width=\"50\" height=\"50\">\n");
      out.write("                        <a>Gia đình</a>\n");
      out.write("                    </form>  \n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <div data-width=\"200\" class=\"box\"> \n");
      out.write("                    <form method=\"post\" action=\"FbLogin?code=chude&chude=natual&accessToken=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${accessToken}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <input id=\"namen\" type=\"hidden\" name=\"firstname\" value =\"\">\n");
      out.write("                        <input id=\"linh\" type=\"image\" src=\"./img/5927208k0724_3.jpg\" width=\"50\" height=\"50\">\n");
      out.write("                        <a>Thiên nhiên</a>\n");
      out.write("                    </form> \n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <div data-width=\"200\" class=\"box\"> \n");
      out.write("                    <form method=\"post\" action=\"FbLogin?code=chude&chude=job&accessToken=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${accessToken}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <input id=\"namej\" type=\"hidden\" name=\"firstname\" value =\"\">\n");
      out.write("                        <input id=\"linh\" type=\"image\" src=\"./img/5927208k0724_3.jpg\" width=\"50\" height=\"50\">\n");
      out.write("                        <a>Công việc</a>\n");
      out.write("                    </form> \n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
