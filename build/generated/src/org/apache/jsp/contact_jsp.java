package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Page Header Start -->\n");
      out.write("            <div class=\"container-fluid bg-secondary mb-5\">\n");
      out.write("                <div class=\"d-flex flex-column align-items-center justify-content-center\" style=\"min-height: 300px\">\n");
      out.write("                    <h1 class=\"font-weight-semi-bold text-uppercase mb-3\">Contact Us</h1>\n");
      out.write("                    <div class=\"d-inline-flex\">\n");
      out.write("                        <p class=\"m-0\"><a href=\"\">Home</a></p>\n");
      out.write("                        <p class=\"m-0 px-2\">-</p>\n");
      out.write("                        <p class=\"m-0\">Contact</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Page Header End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Contact Start -->\n");
      out.write("            <div class=\"container-fluid pt-5\">\n");
      out.write("                <div class=\"text-center mb-4\">\n");
      out.write("                    <h2 class=\"section-title px-5\"><span class=\"px-2\">Contact For Any Queries</span></h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row px-xl-5\">\n");
      out.write("                    <div class=\"col-lg-7 mb-5\">\n");
      out.write("                        <div class=\"contact-form\">\n");
      out.write("                            <div id=\"success\"></div>\n");
      out.write("                            <form name=\"sentMessage\" id=\"contactForm\" novalidate=\"novalidate\">\n");
      out.write("                                <div class=\"control-group\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"name\" placeholder=\"Your Name\"\n");
      out.write("                                           required=\"required\" data-validation-required-message=\"Please enter your name\" />\n");
      out.write("                                    <p class=\"help-block text-danger\"></p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"control-group\">\n");
      out.write("                                    <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Your Email\"\n");
      out.write("                                           required=\"required\" data-validation-required-message=\"Please enter your email\" />\n");
      out.write("                                    <p class=\"help-block text-danger\"></p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"control-group\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"subject\" placeholder=\"Subject\"\n");
      out.write("                                           required=\"required\" data-validation-required-message=\"Please enter a subject\" />\n");
      out.write("                                    <p class=\"help-block text-danger\"></p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"control-group\">\n");
      out.write("                                    <textarea class=\"form-control\" rows=\"6\" id=\"message\" placeholder=\"Message\"\n");
      out.write("                                              required=\"required\"\n");
      out.write("                                              data-validation-required-message=\"Please enter your message\"></textarea>\n");
      out.write("                                    <p class=\"help-block text-danger\"></p>\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <button class=\"btn btn-primary py-2 px-4\" type=\"submit\" id=\"sendMessageButton\">Send\n");
      out.write("                                        Message</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-5 mb-5\">\n");
      out.write("                        <h5 class=\"font-weight-semi-bold mb-3\">Get In Touch</h5>\n");
      out.write("                        <p>Justo sed diam ut sed amet duo amet lorem amet stet sea ipsum, sed duo amet et. Est elitr dolor elitr erat sit sit. Dolor diam et erat clita ipsum justo sed.</p>\n");
      out.write("                        <div class=\"d-flex flex-column mb-3\">\n");
      out.write("                            <h5 class=\"font-weight-semi-bold mb-3\">Store 1</h5>\n");
      out.write("                            <p class=\"mb-2\"><i class=\"fa fa-map-marker-alt text-primary mr-3\"></i>123 Street, New York, USA</p>\n");
      out.write("                            <p class=\"mb-2\"><i class=\"fa fa-envelope text-primary mr-3\"></i>info@example.com</p>\n");
      out.write("                            <p class=\"mb-2\"><i class=\"fa fa-phone-alt text-primary mr-3\"></i>+012 345 67890</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"d-flex flex-column\">\n");
      out.write("                            <h5 class=\"font-weight-semi-bold mb-3\">Store 2</h5>\n");
      out.write("                            <p class=\"mb-2\"><i class=\"fa fa-map-marker-alt text-primary mr-3\"></i>123 Street, New York, USA</p>\n");
      out.write("                            <p class=\"mb-2\"><i class=\"fa fa-envelope text-primary mr-3\"></i>info@example.com</p>\n");
      out.write("                            <p class=\"mb-0\"><i class=\"fa fa-phone-alt text-primary mr-3\"></i>+012 345 67890</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Contact End -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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
