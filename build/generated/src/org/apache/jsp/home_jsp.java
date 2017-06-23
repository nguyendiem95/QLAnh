package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n");
      out.write("    </head>\n");
      out.write("    <link href=\"css/tooplate_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
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
      out.write("\n");
      out.write("    <div id=\"fb-root\"></div>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        var accessToken = \"");
      out.print( (String) request.getAttribute("accessToken"));
      out.write("\";\n");
      out.write("        console.log(accessToken);\n");
      out.write("\n");
      out.write("        window.fbAsyncInit = function () {\n");
      out.write("            FB.api('/me/', 'GET', {\"fields\": \"cover\", \"access_token\": accessToken}, function (response) {\n");
      out.write("                console.log(response);\n");
      out.write("                var link = response.cover.source;\n");
      out.write("                document.getElementById(\"linh\").setAttribute(\"src\", link);\n");
      out.write("            }\n");
      out.write("            );\n");
      out.write("\n");
      out.write("            FB.api('/me', 'GET', {\"access_token\": accessToken}, function (response) {\n");
      out.write("                console.log(response);\n");
      out.write("                var element = document.getElementById('message');\n");
      out.write("                var name = response.name;\n");
      out.write("                element.innerHTML += response.name;\n");
      out.write("                document.getElementById(\"name\").setAttribute(\"value\", name);\n");
      out.write("            }\n");
      out.write("            );\n");
      out.write("        };\n");
      out.write("\n");
      out.write("        (function (d) {\n");
      out.write("            var js, id = 'facebook-jssdk', ref = d.getElementsByTagName('script')[0];\n");
      out.write("            if (d.getElementById(id)) {\n");
      out.write("                return;\n");
      out.write("            }\n");
      out.write("            js = d.createElement('script');\n");
      out.write("            js.id = id;\n");
      out.write("            js.async = true;\n");
      out.write("            js.src = \"//connect.facebook.net/en_US/all.js\";\n");
      out.write("            ref.parentNode.insertBefore(js, ref);\n");
      out.write("        }(document));\n");
      out.write("    </script>\n");
      out.write("    <div class=\"left\">\n");
      out.write("        <a href=\"FbLogin?code=profile&accessToken=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${accessToken}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            <img  width=\"50\" height=\"50\" id=\"linh\" src=\"#\"/> \n");
      out.write("        </a>\n");
      out.write("        <form action=\"FbLogin?code=FileUploadServlet&accessToken=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${accessToken}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" method=\"post\"\n");
      out.write("              enctype=\"multipart/form-data\" id=\"testform\">\n");
      out.write("            <tr>\n");
      out.write("            <input id=\"name\" type=\"hidden\" name=\"firstname\" value =\"\">\n");
      out.write("            <div id=\"message\" style=\"color: red\" name=\"namep\"></div>\n");
      out.write("            </tr>\n");
      out.write("            <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("            <h1>File Upload Form</h1>\n");
      out.write("            <tr>\n");
      out.write("                <td align=\"right\">Chủ đề</td>\n");
      out.write("                <td>\n");
      out.write("                    <select id=\"chon\" name=\"chon\">\n");
      out.write("                        <option value=\"Gia đình\">Gia đình</option>\n");
      out.write("                        <option value=\"Bạn bè\">Bạn bè</option>\n");
      out.write("                        <option value=\"Công việc\">Công việc</option>\n");
      out.write("                        <option value=\"Thiên nhiên\">Thiên nhiên</option>\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("            </tr></br>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td><input type=\"file\" name=\"fileup\" accept =\"image/*\" size=\"30\" value=\"\" onchange=\"file_change(this)\"/><br /></td>\n");
      out.write("                <td><img id=\"img\" style=\"display: none; width: 200px; height: 250px\"></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td><input type=\"submit\" value=\"Upload\" name=\"action\"/></td>\n");
      out.write("            </tr>\n");
      out.write("        </form></br></br>\n");
      out.write("        <h1>Form tìm kiếm</h1>\n");
      out.write("        <form action=\"FbLogin?code=seach&accessToken=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${accessToken}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <td><input type=\"text\" name=\"timkiem\" value=\"\" placeholder=\"hh:mm:ss dd/MM/yyyy\"/></td>\n");
      out.write("\n");
      out.write("                <td><input type=\"submit\" value=\"Tìm kiếm\"></td>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"mains\">\n");
      out.write("        <a href=\"\">Đăng xuất</a>\n");
      out.write("        <div class=\"new-product\">\n");
      out.write("            <h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("item");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${photos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <ul>\n");
          out.write("                    <li>\n");
          out.write("                        <div data-width=\"500\" class=\"box\">\n");
          out.write("                            <a href=\"FbLogin?code=img&name=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.link}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&accessToken=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${accessToken}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" > \n");
          out.write("                                <img width=\"200\" height=\"250\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.link}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("                            </a></br>\n");
          out.write("                        </div>\n");
          out.write("\n");
          out.write("                    </li>\n");
          out.write("                </ul>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
