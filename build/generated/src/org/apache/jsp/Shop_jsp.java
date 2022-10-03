package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shop_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
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
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Libraries Stylesheet -->\n");
      out.write("        <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Customized Bootstrap Stylesheet -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            .page-link {\n");
      out.write("                position: relative !important; \n");
      out.write("                display: block !important;\n");
      out.write("                padding: 0.5rem 0.75rem !important;\n");
      out.write("                margin-left: -1px !important;\n");
      out.write("                line-height: 1.25 !important;\n");
      out.write("                color: #D19C97 !important;\n");
      out.write("                background-color: #fff !important;\n");
      out.write("                border: 1px solid #dee2e6 !important;\n");
      out.write("            } \n");
      out.write("            .page-item .active{\n");
      out.write("                background-color: #D19C97 !important;\n");
      out.write("                border-color: #D19C97 !important;\n");
      out.write("                color: black !important;\n");
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
      out.write("                    <h1 class=\"font-weight-semi-bold text-uppercase mb-3\">Our Shop</h1>\n");
      out.write("                    <div class=\"d-inline-flex\">\n");
      out.write("                        <p class=\"m-0\"><a href=\"home\">Home</a></p>\n");
      out.write("                        <p class=\"m-0 px-2\">-</p>\n");
      out.write("                        <p class=\"m-0\">Shop</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Page Header End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Shop Start -->\n");
      out.write("            <div class=\"container-fluid pt-5\">\n");
      out.write("                <div class=\"row px-xl-5\">\n");
      out.write("                    <!-- Shop Product Start -->\n");
      out.write("                    <div class=\"col-lg-12 col-md-12\">\n");
      out.write("                        <div class=\"row pb-3\">\n");
      out.write("                            <div class=\"col-12 pb-1\">\n");
      out.write("                                <div class=\"d-flex align-items-center justify-content-between mb-4\">\n");
      out.write("                                    <form action=\"search\" method=\"post\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <input name=\"txt\" type=\"text\" class=\"form-control\" placeholder=\"Search by name\">\n");
      out.write("                                            <div class=\"input-group-append\">\n");
      out.write("                                                <button class=\"input-group-text bg-transparent text-primary\">\n");
      out.write("                                                    <i class=\"fa fa-search\"></i>\n");
      out.write("                                                </button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                    <div class=\"dropdown ml-4\">\n");
      out.write("                                        <button class=\"btn border dropdown-toggle\" type=\"button\" id=\"triggerId\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                            Sort by\n");
      out.write("                                        </button>\n");
      out.write("                                        <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"triggerId\">\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"sort?cateID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.cateID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&txt=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${txtSearch}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&option=1&index=1\">Latest</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"sort?cateID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.cateID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&txt=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${txtSearch}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&option=2&index=1\">Popularity</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"sort?cateID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.cateID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&txt=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${txtSearch}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&option=3&index=1\">Price</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <div class=\"col-12 pb-1\">\n");
      out.write("                            <nav aria-label=\"Page navigation\">\n");
      out.write("                                <ul class=\"pagination justify-content-center mb-3\">\n");
      out.write("                                    <li class=\"pagfootere-item disabled\">\n");
      out.write("                                        <a class=\"page-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.serv}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("?cateID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.cateID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&txt=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${txtSearch}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&option=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${option}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&index=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page!=1?(page-1):(page)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" aria-label=\"Previous\">\n");
      out.write("                                            <span aria-hidden=\"true\">&laquo;</span>\n");
      out.write("                                            <span class=\"sr-only\">Previous</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    <li class=\"page-item\">\n");
      out.write("                                        <a class=\"page-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.serv}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("?cateID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.cateID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&txt=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${txtSearch}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&option=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${option}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&index=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page!=endPage?(page+1):(page)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" aria-label=\"Next\">\n");
      out.write("                                            <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("                                            <span class=\"sr-only\">Next</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </nav>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Shop Product End -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Shop End -->\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.listP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <div class=\"col-lg-4 col-md-6 col-sm-12 pb-1\">\n");
          out.write("                                <div class=\"card product-item border-0 mb-4\">\n");
          out.write("                                    <div class=\"card-header product-img position-relative overflow-hidden bg-transparent border p-0\">\n");
          out.write("                                        <img class=\"img-fluid w-100\" src=\"img/product-1.jpg\" alt=\"\">\n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"card-body border-left border-right text-center p-0 pt-4 pb-3\">\n");
          out.write("                                        <h6 class=\"text-truncate mb-3\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h6>\n");
          out.write("                                        <div class=\"d-flex justify-content-center\">\n");
          out.write("                                            <h6>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price*(100-o.sale)/100}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h6>\n");
          out.write("                                            <h6 class=\"text-muted ml-2\" style=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.sale ==0?\"display:none;\":\"display:inline-block;\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" ><del>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</del></h6>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"card-footer d-flex justify-content-between bg-light border\">\n");
          out.write("                                        <a href=\"detail?productID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-sm text-dark p-0\">\n");
          out.write("                                            <i class=\"fas fa-eye text-primary mr-1\"></i>View\n");
          out.write("                                            Detail</a>\n");
          out.write("                                        <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i\n");
          out.write("                                                class=\"fas fa-shopping-cart text-primary mr-1\"></i>Add To Cart</a>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setBegin(1);
    _jspx_th_c_forEach_1.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${endPage}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_1.setVar("i");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <li class=\"page-item active\"><a class=\"page-link ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page == i ?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" btn btn-default\" href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.serv}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("?cateID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.cateID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&txt=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${txtSearch}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&option=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${option}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&index=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
