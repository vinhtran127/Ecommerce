package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <title>Login | E-Shopper</title>\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/price-range.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/animate.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"js/html5shiv.js\"></script>\n");
      out.write("        <script src=\"js/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/ico/favicon.ico\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" href=\"images/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("        <title>EShopper - Bootstrap Shop Template</title>\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"keywords\">\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"description\">\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("                padding:0px;\n");
      out.write("                margin:0px;\n");
      out.write("                color:#808080;\n");
      out.write("                font-family:arial;\n");
      out.write("                box-sizing:border-box;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-color:#0062c4;\n");
      out.write("            }\n");
      out.write("            a{\n");
      out.write("                text-decoration:none;\n");
      out.write("            }\n");
      out.write("            .link{\n");
      out.write("                color: gray;\n");
      out.write("                font-weight: 600;\n");
      out.write("            }\n");
      out.write("            p{\n");
      out.write("                margin:5px 0px;\n");
      out.write("            }\n");
      out.write("            .box{\n");
      out.write("                width:400px;\n");
      out.write("                height:auto;\n");
      out.write("                margin:0 auto;\n");
      out.write("                background-color:white;\n");
      out.write("            }\n");
      out.write("            .inner-box{\n");
      out.write("                padding:20px;\n");
      out.write("            }\n");
      out.write("            .box h1,h2,h3,h4,h5,h6{\n");
      out.write("                text-align:center;\n");
      out.write("                margin:5px 0px;\n");
      out.write("            }\n");
      out.write("            .forgot{\n");
      out.write("                float:right;\n");
      out.write("            }\n");
      out.write("            input[type=\"text\"],input[type=\"password\"],input[type=\"submit\"],input[type=\"email\"]{\n");
      out.write("                width:100%;\n");
      out.write("                padding:10px;\n");
      out.write("                margin:10px 0px;\n");
      out.write("                border:2px solid #c0c0c0;\n");
      out.write("            }\n");
      out.write("            input[type=\"submit\"]{\n");
      out.write("                border:1px solid #D19C97 !important;\n");
      out.write("                background-color:#D19C97 !important;\n");
      out.write("                color:white;\n");
      out.write("                font-size:16px;\n");
      out.write("                font-weight:600;\n");
      out.write("                cursor:pointer;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <!-- Page Header Start -->\n");
      out.write("            <div class=\"container-fluid bg-secondary mb-5\">\n");
      out.write("                <div class=\"d-flex flex-column align-items-center justify-content-center\" style=\"min-height: 300px\">\n");
      out.write("                    <h1 class=\"font-weight-semi-bold text-uppercase mb-3\">Login</h1>\n");
      out.write("                    <div class=\"d-inline-flex\">\n");
      out.write("                        <p class=\"m-0\"><a href=\"\">Home</a></p>\n");
      out.write("                        <p class=\"m-0 px-2\">-</p>\n");
      out.write("                        <p class=\"m-0\">Login</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Page Header End -->\n");
      out.write("            <div class=\"box\">\n");
      out.write("\n");
      out.write("                <div class=\"inner-box\">\n");
      out.write("\n");
      out.write("                    <form action=\"login\" method=\"post\">\n");
      out.write("\n");
      out.write("                        <h2>Login Here</h2>\n");
      out.write("\n");
      out.write("                        <input  name= \"email\" type=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${emailC}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"placeholder=\"Email\" required />\n");
      out.write("                        <input name=\"pass\" type=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${passC}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Password\" required />\n");
      out.write("                    <p class=\"text-warning\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${messAlert}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                    <p>\n");
      out.write("                        <input type=\"checkbox\"  name =\"remember\"/><span> Keep me Signed In</span>\n");
      out.write("\n");
      out.write("                        <span class=\"forgot\"><a href=\"recovery.jsp\">Forgot Password?</a></span>\n");
      out.write("                    </p>\n");
      out.write("                    <input type=\"submit\" value=\"Login\" />\n");
      out.write("\n");
      out.write("                    <p style=\"text-align:center;\">\n");
      out.write("                        <span>Not a member? </span><a class=\"link\" href=\"signup.jsp\">Sign Up</a>\n");
      out.write("                    </p>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/price-range.js\"></script>\n");
      out.write("        <script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.prettyPhoto.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
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
