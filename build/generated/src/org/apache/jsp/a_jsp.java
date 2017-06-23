package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class a_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("    </head>\n");
      out.write("    <title></title>\n");
      out.write("    <script>\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${accessToken}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function file_change(f) {\n");
      out.write("            var reader = new FileReader();\n");
      out.write("            reader.onload = function (e) {\n");
      out.write("                var img = document.getElementById(\"img\");\n");
      out.write("                img.src = e.target.result;\n");
      out.write("                img.style.display = \"inline\";\n");
      out.write("            };\n");
      out.write("            reader.readAsDataURL(f.files[0]);\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    <div id=\"fb-root\"></div>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            window.fbAsyncInit = function () {\n");
      out.write("                FB.init({\n");
      out.write("                    appId: '1828321464051818',\n");
      out.write("                    cookie: true,\n");
      out.write("                    xfbml: true,\n");
      out.write("                    version: 'v2.8'\n");
      out.write("                });\n");
      out.write("                \n");
      out.write("                FB.api('/me/','GET', {\"fields\": \"friends.limit(120)\",\"access_token\": \"EAACEdEose0cBAB7RWN7OiMGUQcjgctm05WYJHbhT1d9bpOYNnvTAHlDvFooFg1JEtvV5UlSv684FUayvIebGqVy9IqwpwIyMHjnqEb33xcWdgx5LlKbseqwKgaH7mWshjB0RPi0VxuOMq1mfmhKQDdm7V9TJdHJjzyqPyKlTGMKkUboH8HwXyKxfaodFMNvNjdr3rQZDZD\"},\n");
      out.write("                        function (response) {\n");
      out.write("                            console.log(response);\n");
      out.write("                             var element = document.getElementById('message');\n");
      out.write("                            var data = response.friends.data;\n");
      out.write("                                for (i in response.friends.data) {\n");
      out.write("                                    element.innerHTML += '<div> ' + data[i].id + ' ' + data[i].name + ' </div> <br />';\n");
      out.write("                                }\n");
      out.write("                        }\n");
      out.write("                );\n");
      out.write("            \n");
      out.write("            };\n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("                \n");
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
      out.write("    <h1>File Upload Form</h1>\n");
      out.write("    <fieldset>\n");
      out.write("        <legend>Upload File</legend>\n");
      out.write("\n");
      out.write("        <form action=\"FbLogin?code=FileUploadServlet\" method=\"post\"\n");
      out.write("              enctype=\"multipart/form-data\">\n");
      out.write("            <label for=\"fileName\">Select File: </label> \n");
      out.write("            <input id=\"fileName\" type=\"file\" name=\"fileName\" size=\"30\" value=\"\" onchange=\"file_change(this)\"  /><br />\n");
      out.write("            <img id=\"img\" style=\"display: none; width: 200px; height: 250px\">\n");
      out.write("            <input type=\"submit\" value=\"Upload\" name=\"action\"/>\n");
      out.write("        </form>\n");
      out.write("    </fieldset>\n");
      out.write("    <div data-width=\"500\"><a href=\"FbLogin?code=img&name=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${filename}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" > <img width=\"200\" height=\"250\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></a></div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
