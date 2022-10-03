package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>EShopper - Bootstrap Shop Template</title>\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"keywords\">\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"description\">\n");
      out.write("\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link href=\"img/favicon.ico\" rel=\"icon\">\n");
      out.write("\n");
      out.write("        <!-- Google Web Fonts -->\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap\" rel=\"stylesheet\"> \n");
      out.write("\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Libraries Stylesheet -->\n");
      out.write("        <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Customized Bootstrap Stylesheet -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <!-- Page Header Start -->\n");
      out.write("            <div class=\"container-fluid bg-secondary mb-5\">\n");
      out.write("                <div class=\"d-flex flex-column align-items-center justify-content-center\" style=\"min-height: 300px\">\n");
      out.write("                    <h1 class=\"font-weight-semi-bold text-uppercase mb-3\">Shop Detail</h1>\n");
      out.write("                    <div class=\"d-inline-flex\">\n");
      out.write("                        <p class=\"m-0\"><a href=\"\">Home</a></p>\n");
      out.write("                        <p class=\"m-0 px-2\">-</p>\n");
      out.write("                        <p class=\"m-0\">Shop Detail</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Page Header End -->\n");
      out.write("\n");
      out.write("            <!-- Shop Detail Start -->\n");
      out.write("            <div class=\"container-fluid py-5\">\n");
      out.write("                <div class=\"row px-xl-5\">\n");
      out.write("                    <div class=\"col-lg-5 pb-5\">\n");
      out.write("                        <div id=\"product-carousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                            <div class=\"carousel-inner border\">\n");
      out.write("                                <div class=\"carousel-item active\">\n");
      out.write("                                    <img class=\"w-100 h-100\" src=\"img/product-1.jpg\" alt=\"Image\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"carousel-item\">\n");
      out.write("                                    <img class=\"w-100 h-100\" src=\"img/product-2.jpg\" alt=\"Image\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"carousel-item\">\n");
      out.write("                                    <img class=\"w-100 h-100\" src=\"img/product-3.jpg\" alt=\"Image\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"carousel-item\">\n");
      out.write("                                    <img class=\"w-100 h-100\" src=\"img/product-4.jpg\" alt=\"Image\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <a class=\"carousel-control-prev\" href=\"#product-carousel\" data-slide=\"prev\">\n");
      out.write("                                <i class=\"fa fa-2x fa-angle-left text-dark\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"carousel-control-next\" href=\"#product-carousel\" data-slide=\"next\">\n");
      out.write("                                <i class=\"fa fa-2x fa-angle-right text-dark\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-7 pb-5\">\n");
      out.write("                        <h3 class=\"font-weight-semi-bold\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                        <div class=\"d-flex mb-3\">\n");
      out.write("                            <div class=\"text-primary mr-2\">\n");
      out.write("                                <small class=\"fas fa-star\"></small>\n");
      out.write("                                <small class=\"fas fa-star\"></small>\n");
      out.write("                                <small class=\"fas fa-star\"></small>\n");
      out.write("                                <small class=\"fas fa-star-half-alt\"></small>\n");
      out.write("                                <small class=\"far fa-star\"></small>\n");
      out.write("                            </div>\n");
      out.write("                            <small class=\"pt-1\">(50 Reviews)</small>\n");
      out.write("                        </div>\n");
      out.write("                        <h3 class=\"font-weight-semi-bold mb-4\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price*(100-p.sale)/100}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                        <p class=\"mb-4\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        <div class=\"d-flex mb-3\">\n");
      out.write("                            <p class=\"text-dark font-weight-medium mb-0 mr-3\">Sizes:</p>\n");
      out.write("                            <form>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"d-flex mb-4\">\n");
      out.write("                        <p class=\"text-dark font-weight-medium mb-0 mr-3\">Colors:</p>\n");
      out.write("                        <form>\n");
      out.write("                            <div class=\"custom-control custom-radio custom-control-inline\">\n");
      out.write("                                <input type=\"radio\" class=\"custom-control-input\" id=\"color-1\" name=\"color\">\n");
      out.write("                                <label class=\"custom-control-label\" for=\"color-1\">Black</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"custom-control custom-radio custom-control-inline\">\n");
      out.write("                                <input type=\"radio\" class=\"custom-control-input\" id=\"color-2\" name=\"color\">\n");
      out.write("                                <label class=\"custom-control-label\" for=\"color-2\">White</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"custom-control custom-radio custom-control-inline\">\n");
      out.write("                                <input type=\"radio\" class=\"custom-control-input\" id=\"color-3\" name=\"color\">\n");
      out.write("                                <label class=\"custom-control-label\" for=\"color-3\">Red</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"custom-control custom-radio custom-control-inline\">\n");
      out.write("                                <input type=\"radio\" class=\"custom-control-input\" id=\"color-4\" name=\"color\">\n");
      out.write("                                <label class=\"custom-control-label\" for=\"color-4\">Blue</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"custom-control custom-radio custom-control-inline\">\n");
      out.write("                                <input type=\"radio\" class=\"custom-control-input\" id=\"color-5\" name=\"color\">\n");
      out.write("                                <label class=\"custom-control-label\" for=\"color-5\">Green</label>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"d-flex align-items-center mb-4 pt-2\">\n");
      out.write("                        <div class=\"input-group quantity mr-3\" style=\"width: 130px;\">\n");
      out.write("                            <div class=\"input-group-btn\">\n");
      out.write("                                <button class=\"btn btn-primary btn-minus\" >\n");
      out.write("                                    <i class=\"fa fa-minus\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                            <input type=\"text\" class=\"form-control bg-secondary text-center\" value=\"1\">\n");
      out.write("                            <div class=\"input-group-btn\">\n");
      out.write("                                <button class=\"btn btn-primary btn-plus\">\n");
      out.write("                                    <i class=\"fa fa-plus\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <button class=\"btn btn-primary px-3\"><i class=\"fa fa-shopping-cart mr-1\"></i> Add To Cart</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"d-flex pt-2\">\n");
      out.write("                        <p class=\"text-dark font-weight-medium mb-0 mr-2\">Share on:</p>\n");
      out.write("                        <div class=\"d-inline-flex\">\n");
      out.write("                            <a class=\"text-dark px-2\" href=\"\">\n");
      out.write("                                <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"text-dark px-2\" href=\"\">\n");
      out.write("                                <i class=\"fab fa-twitter\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"text-dark px-2\" href=\"\">\n");
      out.write("                                <i class=\"fab fa-linkedin-in\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"text-dark px-2\" href=\"\">\n");
      out.write("                                <i class=\"fab fa-pinterest\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row px-xl-5\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <div class=\"nav nav-tabs justify-content-center border-secondary mb-4\">\n");
      out.write("                        <a class=\"nav-item nav-link active\" data-toggle=\"tab\" href=\"#tab-pane-1\">Description</a>\n");
      out.write("                        <a class=\"nav-item nav-link\" data-toggle=\"tab\" href=\"#tab-pane-2\">Information</a>\n");
      out.write("                        <a class=\"nav-item nav-link\" data-toggle=\"tab\" href=\"#tab-pane-3\">Reviews (0)</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"tab-content\">\n");
      out.write("                        <div class=\"tab-pane fade show active\" id=\"tab-pane-1\">\n");
      out.write("                            <h4 class=\"mb-3\">Product Description</h4>\n");
      out.write("                            <p>Eos no lorem eirmod diam diam, eos elitr et gubergren diam sea. Consetetur vero aliquyam invidunt duo dolores et duo sit. Vero diam ea vero et dolore rebum, dolor rebum eirmod consetetur invidunt sed sed et, lorem duo et eos elitr, sadipscing kasd ipsum rebum diam. Dolore diam stet rebum sed tempor kasd eirmod. Takimata kasd ipsum accusam sadipscing, eos dolores sit no ut diam consetetur duo justo est, sit sanctus diam tempor aliquyam eirmod nonumy rebum dolor accusam, ipsum kasd eos consetetur at sit rebum, diam kasd invidunt tempor lorem, ipsum lorem elitr sanctus eirmod takimata dolor ea invidunt.</p>\n");
      out.write("                            <p>Dolore magna est eirmod sanctus dolor, amet diam et eirmod et ipsum. Amet dolore tempor consetetur sed lorem dolor sit lorem tempor. Gubergren amet amet labore sadipscing clita clita diam clita. Sea amet et sed ipsum lorem elitr et, amet et labore voluptua sit rebum. Ea erat sed et diam takimata sed justo. Magna takimata justo et amet magna et.</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"tab-pane fade\" id=\"tab-pane-2\">\n");
      out.write("                            <h4 class=\"mb-3\">Additional Information</h4>\n");
      out.write("                            <p>Eos no lorem eirmod diam diam, eos elitr et gubergren diam sea. Consetetur vero aliquyam invidunt duo dolores et duo sit. Vero diam ea vero et dolore rebum, dolor rebum eirmod consetetur invidunt sed sed et, lorem duo et eos elitr, sadipscing kasd ipsum rebum diam. Dolore diam stet rebum sed tempor kasd eirmod. Takimata kasd ipsum accusam sadipscing, eos dolores sit no ut diam consetetur duo justo est, sit sanctus diam tempor aliquyam eirmod nonumy rebum dolor accusam, ipsum kasd eos consetetur at sit rebum, diam kasd invidunt tempor lorem, ipsum lorem elitr sanctus eirmod takimata dolor ea invidunt.</p>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <ul class=\"list-group list-group-flush\">\n");
      out.write("                                        <li class=\"list-group-item px-0\">\n");
      out.write("                                            Sit erat duo lorem duo ea consetetur, et eirmod takimata.\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"list-group-item px-0\">\n");
      out.write("                                            Amet kasd gubergren sit sanctus et lorem eos sadipscing at.\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"list-group-item px-0\">\n");
      out.write("                                            Duo amet accusam eirmod nonumy stet et et stet eirmod.\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"list-group-item px-0\">\n");
      out.write("                                            Takimata ea clita labore amet ipsum erat justo voluptua. Nonumy.\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul> \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <ul class=\"list-group list-group-flush\">\n");
      out.write("                                        <li class=\"list-group-item px-0\">\n");
      out.write("                                            Sit erat duo lorem duo ea consetetur, et eirmod takimata.\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"list-group-item px-0\">\n");
      out.write("                                            Amet kasd gubergren sit sanctus et lorem eos sadipscing at.\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"list-group-item px-0\">\n");
      out.write("                                            Duo amet accusam eirmod nonumy stet et et stet eirmod.\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"list-group-item px-0\">\n");
      out.write("                                            Takimata ea clita labore amet ipsum erat justo voluptua. Nonumy.\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul> \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"tab-pane fade\" id=\"tab-pane-3\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <h4 class=\"mb-4\">1 review for \"Colorful Stylish Shirt\"</h4>\n");
      out.write("                                    <div class=\"media mb-4\">\n");
      out.write("                                        <img src=\"img/user.jpg\" alt=\"Image\" class=\"img-fluid mr-3 mt-1\" style=\"width: 45px;\">\n");
      out.write("                                        <div class=\"media-body\">\n");
      out.write("                                            <h6>John Doe<small> - <i>01 Jan 2045</i></small></h6>\n");
      out.write("                                            <div class=\"text-primary mb-2\">\n");
      out.write("                                                <i class=\"fas fa-star\"></i>\n");
      out.write("                                                <i class=\"fas fa-star\"></i>\n");
      out.write("                                                <i class=\"fas fa-star\"></i>\n");
      out.write("                                                <i class=\"fas fa-star-half-alt\"></i>\n");
      out.write("                                                <i class=\"far fa-star\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                            <p>Diam amet duo labore stet elitr ea clita ipsum, tempor labore accusam ipsum et no at. Kasd diam tempor rebum magna dolores sed sed eirmod ipsum.</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <h4 class=\"mb-4\">Leave a review</h4>\n");
      out.write("                                    <small>Your email address will not be published. Required fields are marked *</small>\n");
      out.write("                                    <div class=\"d-flex my-3\">\n");
      out.write("                                        <p class=\"mb-0 mr-2\">Your Rating * :</p>\n");
      out.write("                                        <div class=\"text-primary\">\n");
      out.write("                                            <i class=\"far fa-star\"></i>\n");
      out.write("                                            <i class=\"far fa-star\"></i>\n");
      out.write("                                            <i class=\"far fa-star\"></i>\n");
      out.write("                                            <i class=\"far fa-star\"></i>\n");
      out.write("                                            <i class=\"far fa-star\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <form>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"message\">Your Review *</label>\n");
      out.write("                                            <textarea id=\"message\" cols=\"30\" rows=\"5\" class=\"form-control\"></textarea>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"name\">Your Name *</label>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"name\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"email\">Your Email *</label>\n");
      out.write("                                            <input type=\"email\" class=\"form-control\" id=\"email\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group mb-0\">\n");
      out.write("                                            <input type=\"submit\" value=\"Leave Your Review\" class=\"btn btn-primary px-3\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Shop Detail End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Products Start -->\n");
      out.write("        <div class=\"container-fluid py-5\">\n");
      out.write("            <div class=\"text-center mb-4\">\n");
      out.write("                <h2 class=\"section-title px-5\"><span class=\"px-2\">You May Also Like</span></h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row px-xl-5\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <div class=\"owl-carousel related-carousel\">\n");
      out.write("                        <div class=\"card product-item border-0\">\n");
      out.write("                            <div class=\"card-header product-img position-relative overflow-hidden bg-transparent border p-0\">\n");
      out.write("                                <img class=\"img-fluid w-100\" src=\"img/product-1.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body border-left border-right text-center p-0 pt-4 pb-3\">\n");
      out.write("                                <h6 class=\"text-truncate mb-3\">Colorful Stylish Shirt</h6>\n");
      out.write("                                <div class=\"d-flex justify-content-center\">\n");
      out.write("                                    <h6>$123.00</h6><h6 class=\"text-muted ml-2\"><del>$123.00</del></h6>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-footer d-flex justify-content-between bg-light border\">\n");
      out.write("                                <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i class=\"fas fa-eye text-primary mr-1\"></i>View Detail</a>\n");
      out.write("                                <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i class=\"fas fa-shopping-cart text-primary mr-1\"></i>Add To Cart</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card product-item border-0\">\n");
      out.write("                            <div class=\"card-header product-img position-relative overflow-hidden bg-transparent border p-0\">\n");
      out.write("                                <img class=\"img-fluid w-100\" src=\"img/product-2.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body border-left border-right text-center p-0 pt-4 pb-3\">\n");
      out.write("                                <h6 class=\"text-truncate mb-3\">Colorful Stylish Shirt</h6>\n");
      out.write("                                <div class=\"d-flex justify-content-center\">\n");
      out.write("                                    <h6>$123.00</h6><h6 class=\"text-muted ml-2\"><del>$123.00</del></h6>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-footer d-flex justify-content-between bg-light border\">\n");
      out.write("                                <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i class=\"fas fa-eye text-primary mr-1\"></i>View Detail</a>\n");
      out.write("                                <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i class=\"fas fa-shopping-cart text-primary mr-1\"></i>Add To Cart</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card product-item border-0\">\n");
      out.write("                            <div class=\"card-header product-img position-relative overflow-hidden bg-transparent border p-0\">\n");
      out.write("                                <img class=\"img-fluid w-100\" src=\"img/product-3.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body border-left border-right text-center p-0 pt-4 pb-3\">\n");
      out.write("                                <h6 class=\"text-truncate mb-3\">Colorful Stylish Shirt</h6>\n");
      out.write("                                <div class=\"d-flex justify-content-center\">\n");
      out.write("                                    <h6>$123.00</h6><h6 class=\"text-muted ml-2\"><del>$123.00</del></h6>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-footer d-flex justify-content-between bg-light border\">\n");
      out.write("                                <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i class=\"fas fa-eye text-primary mr-1\"></i>View Detail</a>\n");
      out.write("                                <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i class=\"fas fa-shopping-cart text-primary mr-1\"></i>Add To Cart</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card product-item border-0\">\n");
      out.write("                            <div class=\"card-header product-img position-relative overflow-hidden bg-transparent border p-0\">\n");
      out.write("                                <img class=\"img-fluid w-100\" src=\"img/product-4.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body border-left border-right text-center p-0 pt-4 pb-3\">\n");
      out.write("                                <h6 class=\"text-truncate mb-3\">Colorful Stylish Shirt</h6>\n");
      out.write("                                <div class=\"d-flex justify-content-center\">\n");
      out.write("                                    <h6>$123.00</h6><h6 class=\"text-muted ml-2\"><del>$123.00</del></h6>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-footer d-flex justify-content-between bg-light border\">\n");
      out.write("                                <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i class=\"fas fa-eye text-primary mr-1\"></i>View Detail</a>\n");
      out.write("                                <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i class=\"fas fa-shopping-cart text-primary mr-1\"></i>Add To Cart</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card product-item border-0\">\n");
      out.write("                            <div class=\"card-header product-img position-relative overflow-hidden bg-transparent border p-0\">\n");
      out.write("                                <img class=\"img-fluid w-100\" src=\"img/product-5.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body border-left border-right text-center p-0 pt-4 pb-3\">\n");
      out.write("                                <h6 class=\"text-truncate mb-3\">Colorful Stylish Shirt</h6>\n");
      out.write("                                <div class=\"d-flex justify-content-center\">\n");
      out.write("                                    <h6>$123.00</h6><h6 class=\"text-muted ml-2\"><del>$123.00</del></h6>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-footer d-flex justify-content-between bg-light border\">\n");
      out.write("                                <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i class=\"fas fa-eye text-primary mr-1\"></i>View Detail</a>\n");
      out.write("                                <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i class=\"fas fa-shopping-cart text-primary mr-1\"></i>Add To Cart</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Products End -->\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listSize}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"custom-control custom-radio custom-control-inline\">\n");
          out.write("                                    <input type=\"radio\" class=\"custom-control-input\" id=\"size-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"size\">\n");
          out.write("                                    <label class=\"custom-control-label\" for=\"size-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</label>\n");
          out.write("                                </div>\n");
          out.write("                            ");
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
