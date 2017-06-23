package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class getaccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Web cua toi</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"fb-root\"></div>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            window.fbAsyncInit = function () {\n");
      out.write("                FB.init({\n");
      out.write("                    appId: '1828321464051818',\n");
      out.write("                    cookie: true,\n");
      out.write("                    xfbml: true,\n");
      out.write("                    version: 'v2.8'\n");
      out.write("                });\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            function Login() {\n");
      out.write("                FB.login(function (response) {\n");
      out.write("                    if (response.authResponse) {\n");
      out.write("                        console.log(response.authResponse);\n");
      out.write("                        // response.authResponse.accessToken = \"\"\n");
      out.write("                        getUserInfo();\n");
      out.write("                    } else {\n");
      out.write("                        console.log('User cancelled login or did not fully authorize.');\n");
      out.write("                    }\n");
      out.write("                }, {scope: 'publish_actions,user_friends'});\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function getUserInfo() {\n");
      out.write("                    FB.api(\n");
      out.write("  '/me',\n");
      out.write("  'GET',\n");
      out.write("  {\"fields\":\"context\",\"access_token\":\"EAAZAZB2UNmaGoBAPjNFN9h8TjLhXBcWGXn5YPTBGi9LbdZBPhWXX9LeVoZA6t3u48kePUHmsXP3tghCe5T3rDMXTFCYOCF1ZAloNlzx4ixOZBCKqviLKp9XW0ZAIO1GkJTDi1BMFk1QPPqyubSw9N4HXIX0UQZCNOYCTemrGXTtL5jMnFoeX7wAa\"},\n");
      out.write("  function(response) {\n");
      out.write("       console.log(response);\n");
      out.write("  }\n");
      out.write(");\n");
      out.write("               \n");
      out.write("            }\n");
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
      out.write("        <div align=\"center\">\n");
      out.write("            <h2>Facebook OAuth Javascript Demo</h2>\n");
      out.write("            <div id=\"status\">Click on Below Image to start the demo: <br/>\n");
      out.write("                <img src=\"http://hayageek.com/examples/oauth/facebook/oauth-javascript/LoginWithFacebook.png\" style=\"cursor:pointer;\" onclick=\"Login()\"/>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"message\"></div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
