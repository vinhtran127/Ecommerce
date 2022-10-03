package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <!-- Page Header Start -->\n");
      out.write("            <div class=\"container-fluid bg-secondary mb-5\">\n");
      out.write("                <div class=\"d-flex flex-column align-items-center justify-content-center\" style=\"min-height: 300px\">\n");
      out.write("                    <h1 class=\"font-weight-semi-bold text-uppercase mb-3\">Checkout</h1>\n");
      out.write("                    <div class=\"d-inline-flex\">\n");
      out.write("                        <p class=\"m-0\"><a href=\"\">Home</a></p>\n");
      out.write("                        <p class=\"m-0 px-2\">-</p>\n");
      out.write("                        <p class=\"m-0\">Checkout</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Page Header End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Checkout Start -->\n");
      out.write("            <div class=\"container-fluid pt-5\">\n");
      out.write("                <div class=\"row px-xl-5\">\n");
      out.write("                    <div class=\"col-lg-8\">\n");
      out.write("                        <div class=\"mb-4\">\n");
      out.write("                            <h4 class=\"font-weight-semi-bold mb-4\">Billing Address</h4>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-6 form-group\">\n");
      out.write("                                    <label>First Name</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" placeholder=\"John\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6 form-group\">\n");
      out.write("                                    <label>Last Name</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" placeholder=\"Doe\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6 form-group\">\n");
      out.write("                                    <label>E-mail</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" placeholder=\"example@email.com\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6 form-group\">\n");
      out.write("                                    <label>Mobile No</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" placeholder=\"+123 456 789\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6 form-group\">\n");
      out.write("                                    <label>Address Line 1</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" placeholder=\"123 Street\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6 form-group\">\n");
      out.write("                                    <label>Address Line 2</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" placeholder=\"123 Street\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6 form-group\">\n");
      out.write("                                    <label>Country</label>\n");
      out.write("                                    <select class=\"custom-select\">\n");
      out.write("                                        <option selected>United States</option>\n");
      out.write("                                        <option>Afghanistan</option>\n");
      out.write("                                        <option>Albania</option>\n");
      out.write("                                        <option>Algeria</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6 form-group\">\n");
      out.write("                                    <label>City</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" placeholder=\"New York\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6 form-group\">\n");
      out.write("                                    <label>State</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" placeholder=\"New York\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6 form-group\">\n");
      out.write("                                    <label>ZIP Code</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" placeholder=\"123\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12 form-group\">\n");
      out.write("                                    <div class=\"custom-control custom-checkbox\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"newaccount\">\n");
      out.write("                                        <label class=\"custom-control-label\" for=\"newaccount\">Create an account</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4\">\n");
      out.write("                        <div class=\"card border-secondary mb-5\">\n");
      out.write("                            <div class=\"card-header bg-secondary border-0\">\n");
      out.write("                                <h4 class=\"font-weight-semi-bold m-0\">Order Total</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5 class=\"font-weight-medium mb-3\">Products</h5>\n");
      out.write("                                <div class=\"d-flex justify-content-between\">\n");
      out.write("                                    <p>Colorful Stylish Shirt 1</p>\n");
      out.write("                                    <p>$150</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"d-flex justify-content-between\">\n");
      out.write("                                    <p>Colorful Stylish Shirt 2</p>\n");
      out.write("                                    <p>$150</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"d-flex justify-content-between\">\n");
      out.write("                                    <p>Colorful Stylish Shirt 3</p>\n");
      out.write("                                    <p>$150</p>\n");
      out.write("                                </div>\n");
      out.write("                                <hr class=\"mt-0\">\n");
      out.write("                                <div class=\"d-flex justify-content-between mb-3 pt-1\">\n");
      out.write("                                    <h6 class=\"font-weight-medium\">Subtotal</h6>\n");
      out.write("                                    <h6 class=\"font-weight-medium\">$150</h6>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"d-flex justify-content-between\">\n");
      out.write("                                    <h6 class=\"font-weight-medium\">Shipping</h6>\n");
      out.write("                                    <h6 class=\"font-weight-medium\">$10</h6>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-footer border-secondary bg-transparent\">\n");
      out.write("                                <div class=\"d-flex justify-content-between mt-2\">\n");
      out.write("                                    <h5 class=\"font-weight-bold\">Total</h5>\n");
      out.write("                                    <h5 class=\"font-weight-bold\">$160</h5>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card border-secondary mb-5\">\n");
      out.write("                            <div class=\"card-header bg-secondary border-0\">\n");
      out.write("                                <h4 class=\"font-weight-semi-bold m-0\">Payment</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"custom-control custom-radio\">\n");
      out.write("                                        <input type=\"radio\" class=\"custom-control-input\" name=\"payment\" id=\"paypal\">\n");
      out.write("                                        <label class=\"custom-control-label\" for=\"paypal\">Paypal</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"custom-control custom-radio\">\n");
      out.write("                                        <input type=\"radio\" class=\"custom-control-input\" name=\"payment\" id=\"directcheck\">\n");
      out.write("                                        <label class=\"custom-control-label\" for=\"directcheck\">Direct Check</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"\">\n");
      out.write("                                    <div class=\"custom-control custom-radio\">\n");
      out.write("                                        <input type=\"radio\" class=\"custom-control-input\" name=\"payment\" id=\"banktransfer\">\n");
      out.write("                                        <label class=\"custom-control-label\" for=\"banktransfer\">Bank Transfer</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-footer border-secondary bg-transparent\">\n");
      out.write("                                <button class=\"btn btn-lg btn-block btn-primary font-weight-bold my-3 py-3\">Place Order</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Checkout End -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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
