package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <!-- Footer Start -->\n");
      out.write("        <div class=\"container-fluid bg-secondary text-dark mt-5 pt-5\">\n");
      out.write("            <div class=\"row px-xl-5 pt-5\">\n");
      out.write("                <div class=\"col-lg-4 col-md-12 mb-5 pr-3 pr-xl-5\">\n");
      out.write("                    <a href=\"\" class=\"text-decoration-none\">\n");
      out.write("                        <h1 class=\"mb-4 display-5 font-weight-semi-bold\"><span class=\"text-primary font-weight-bold border border-white px-3 mr-1\">E</span>Shopper</h1>\n");
      out.write("                    </a>\n");
      out.write("                    <p>Dolore erat dolor sit lorem vero amet. Sed sit lorem magna, ipsum no sit erat lorem et magna ipsum dolore amet erat.</p>\n");
      out.write("                    <p class=\"mb-2\"><i class=\"fa fa-map-marker-alt text-primary mr-3\"></i>123 Street, New York, USA</p>\n");
      out.write("                    <p class=\"mb-2\"><i class=\"fa fa-envelope text-primary mr-3\"></i>info@example.com</p>\n");
      out.write("                    <p class=\"mb-0\"><i class=\"fa fa-phone-alt text-primary mr-3\"></i>+012 345 67890</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-8 col-md-12\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4 mb-5\">\n");
      out.write("                            <h5 class=\"font-weight-bold text-dark mb-4\">Quick Links</h5>\n");
      out.write("                            <div class=\"d-flex flex-column justify-content-start\">\n");
      out.write("                                <a class=\"text-dark mb-2\" href=\"index.html\"><i class=\"fa fa-angle-right mr-2\"></i>Home</a>\n");
      out.write("                                <a class=\"text-dark mb-2\" href=\"shop.html\"><i class=\"fa fa-angle-right mr-2\"></i>Our Shop</a>\n");
      out.write("                                <a class=\"text-dark mb-2\" href=\"detail.html\"><i class=\"fa fa-angle-right mr-2\"></i>Shop Detail</a>\n");
      out.write("                                <a class=\"text-dark mb-2\" href=\"cart.html\"><i class=\"fa fa-angle-right mr-2\"></i>Shopping Cart</a>\n");
      out.write("                                <a class=\"text-dark mb-2\" href=\"checkout.html\"><i class=\"fa fa-angle-right mr-2\"></i>Checkout</a>\n");
      out.write("                                <a class=\"text-dark\" href=\"contact.html\"><i class=\"fa fa-angle-right mr-2\"></i>Contact Us</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 mb-5\">\n");
      out.write("                            <h5 class=\"font-weight-bold text-dark mb-4\">Quick Links</h5>\n");
      out.write("                            <div class=\"d-flex flex-column justify-content-start\">\n");
      out.write("                                <a class=\"text-dark mb-2\" href=\"index.html\"><i class=\"fa fa-angle-right mr-2\"></i>Home</a>\n");
      out.write("                                <a class=\"text-dark mb-2\" href=\"shop.html\"><i class=\"fa fa-angle-right mr-2\"></i>Our Shop</a>\n");
      out.write("                                <a class=\"text-dark mb-2\" href=\"detail.html\"><i class=\"fa fa-angle-right mr-2\"></i>Shop Detail</a>\n");
      out.write("                                <a class=\"text-dark mb-2\" href=\"cart.html\"><i class=\"fa fa-angle-right mr-2\"></i>Shopping Cart</a>\n");
      out.write("                                <a class=\"text-dark mb-2\" href=\"checkout.html\"><i class=\"fa fa-angle-right mr-2\"></i>Checkout</a>\n");
      out.write("                                <a class=\"text-dark\" href=\"contact.html\"><i class=\"fa fa-angle-right mr-2\"></i>Contact Us</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 mb-5\">\n");
      out.write("                            <h5 class=\"font-weight-bold text-dark mb-4\">Newsletter</h5>\n");
      out.write("                            <form action=\"\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control border-0 py-4\" placeholder=\"Your Name\" required=\"required\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"email\" class=\"form-control border-0 py-4\" placeholder=\"Your Email\" required=\"required\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <button class=\"btn btn-primary btn-block border-0 py-3\" type=\"submit\">Subscribe Now</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row border-top border-light mx-xl-5 py-4\">\n");
      out.write("                <div class=\"col-md-6 px-xl-0\">\n");
      out.write("                    <p class=\"mb-md-0 text-center text-md-left text-dark\">\n");
      out.write("                        &copy; <a class=\"text-dark font-weight-semi-bold\" href=\"#\">Your Site Name</a>. All Rights Reserved. Designed by\n");
      out.write("                        <a class=\"text-dark font-weight-semi-bold\" href=\"https://htmlcodex.com\">HTML Codex</a><br> Distributed By <a href=\"https://themewagon.com\" target=\"_blank\">ThemeWagon</a>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 px-xl-0 text-center text-md-right\">\n");
      out.write("                    <img class=\"img-fluid\" src=\"img/payments.png\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Footer End -->\n");
      out.write("        <a href=\"#\" class=\"btn btn-primary back-to-top\"><i class=\"fa fa-angle-double-up\"></i></a>\n");
      out.write("        <!-- JavaScript Libraries -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"lib/easing/easing.min.js\"></script>\n");
      out.write("        <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Contact Javascript File -->\n");
      out.write("        <script src=\"mail/jqBootstrapValidation.min.js\"></script>\n");
      out.write("        <script src=\"mail/contact.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Template Javascript -->\n");
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
