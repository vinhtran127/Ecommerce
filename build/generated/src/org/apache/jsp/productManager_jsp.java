package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productManager_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round\">-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">-->\n");
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
      out.write("            body {\n");
      out.write("                font-family: \"Helvetica Neue\",Helvetica,Arial,sans-serif;\n");
      out.write("                font-size: 14px;\n");
      out.write("                line-height: 1.428571429;\n");
      out.write("                color: #333;\n");
      out.write("                background-color: #fff;\n");
      out.write("            }\n");
      out.write("            .table-title {\n");
      out.write("                padding-bottom: 15px;\n");
      out.write("                background: #D19C97;\n");
      out.write("                color: #fff;\n");
      out.write("                padding: 16px 30px;\n");
      out.write("                margin: -20px -25px 10px;\n");
      out.write("                border-radius: 3px 3px 0 0;\n");
      out.write("            }\n");
      out.write("            .table-wrapper {\n");
      out.write("                background: #fff;\n");
      out.write("                padding: 20px 25px;\n");
      out.write("                margin: 30px 0;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                box-shadow: 0 1px 1px rgb(0, 0, 0, / 5%);\n");
      out.write("            }\n");
      out.write("            .table>thead>tr>th {\n");
      out.write("                vertical-align: bottom;\n");
      out.write("                border-bottom: 2px solid #ddd;\n");
      out.write("            }\n");
      out.write("            .rowss {\n");
      out.write("                display:block !important;\n");
      out.write("                margin-right: -15px;\n");
      out.write("                margin-left: -15px;\n");
      out.write("            }\n");
      out.write("            .rowss:after {\n");
      out.write("                display: table;\n");
      out.write("                content: \" \";\n");
      out.write("            }\n");
      out.write("            .rowss:after {\n");
      out.write("                clear: both;\n");
      out.write("            }\n");
      out.write("            .rowss:before {\n");
      out.write("                display: table;\n");
      out.write("                content: \" \";\n");
      out.write("            }\n");
      out.write("            @media (min-width: 768px){\n");
      out.write("                .col-sm-6 {\n");
      out.write("                    width: 50%;\n");
      out.write("                    float: left;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn-success {\n");
      out.write("                color: #fff;\n");
      out.write("                background-color: gray !important;\n");
      out.write("            }\n");
      out.write("            .table-title {\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("            .table>thead>tr>th, .table>tbody>tr>th, .table>tfoot>tr>th, .table>thead>tr>td, .table>tbody>tr>td, .table>tfoot>tr>td {\n");
      out.write("                padding: 8px;\n");
      out.write("                line-height: 1.428571429;\n");
      out.write("            }\n");
      out.write("            .table-title h2 {\n");
      out.write("                margin: 5px 0 0;\n");
      out.write("                font-size: 24px;\n");
      out.write("            }\n");
      out.write("            h2 {\n");
      out.write("                display: block;\n");
      out.write("                font-size: 1.5em;\n");
      out.write("                margin-block-start: 0.83em;\n");
      out.write("                margin-block-end: 0.83em;\n");
      out.write("                margin-inline-start: 0px;\n");
      out.write("                margin-inline-end: 0px;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            h2{\n");
      out.write("                line-height: 1.1;\n");
      out.write("                color: #fff;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .btn {\n");
      out.write("                display: inline-block !important;\n");
      out.write("                padding: 6px 12px ;\n");
      out.write("                margin-bottom: 0 !important;\n");
      out.write("                font-weight: normal !important;\n");
      out.write("                line-height: 1.428571429 !important;\n");
      out.write("                text-align: center !important;\n");
      out.write("                white-space: nowrap !important;\n");
      out.write("                vertical-align: middle !important;\n");
      out.write("                cursor: pointer !important;\n");
      out.write("                background-image: none;\n");
      out.write("                user-select: none;\n");
      out.write("            }\n");
      out.write("            .table-title .btn {\n");
      out.write("                color: #fff;\n");
      out.write("                float: right;\n");
      out.write("                font-size: 13px;\n");
      out.write("                border: none;\n");
      out.write("                min-width: 50px;\n");
      out.write("                border-radius: 2px;\n");
      out.write("                border: none;\n");
      out.write("                outline: none !important;\n");
      out.write("                margin-left: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .material-icons {\n");
      out.write("                font-family: 'Material Icons';\n");
      out.write("                font-weight: normal;\n");
      out.write("                font-style: normal;\n");
      out.write("                font-size: 24px;\n");
      out.write("                line-height: 1;\n");
      out.write("                letter-spacing: normal;\n");
      out.write("                text-transform: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                white-space: nowrap;\n");
      out.write("                word-wrap: normal;\n");
      out.write("                direction: ltr;\n");
      out.write("                -webkit-font-feature-settings: 'liga';\n");
      out.write("                -webkit-font-smoothing: antialiased;\n");
      out.write("            }\n");
      out.write("            .table-title .btn i {\n");
      out.write("                float: left;\n");
      out.write("                font-size: 21px;\n");
      out.write("                margin-right: 5px;\n");
      out.write("            }\n");
      out.write("            th {\n");
      out.write("                font-size: 14px !important;\n");
      out.write("                text-align: left !important;\n");
      out.write("                display: table-cell;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            table {\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                border-spacing: 0;\n");
      out.write("            }\n");
      out.write("            .table>thead>tr>th {\n");
      out.write("                vertical-align: bottom;\n");
      out.write("                border-bottom: 2px solid #ddd;\n");
      out.write("            }\n");
      out.write("            table.table tr th:last-child {\n");
      out.write("                width: 100px;\n");
      out.write("            }\n");
      out.write("            .hint-text {\n");
      out.write("                float: left;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                font-size: 13px;\n");
      out.write("            }\n");
      out.write("            .table {\n");
      out.write("                width: 100%;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("            .table-striped>tbody>tr:nth-child(odd)>td {\n");
      out.write("                background-color: #f9f9f9;\n");
      out.write("            }\n");
      out.write("            .table>tbody>tr>td{\n");
      out.write("                padding: 8px;\n");
      out.write("                line-height: 1.428571429;\n");
      out.write("                vertical-align: top;\n");
      out.write("                border-top: 1px solid #ddd;\n");
      out.write("            }\n");
      out.write("            a {\n");
      out.write("                transition: 300ms;\n");
      out.write("                background: transparent;\n");
      out.write("                color: #428bca;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            .pagination li a {\n");
      out.write("                border: none;\n");
      out.write("                font-size: 13px;\n");
      out.write("                min-width: 30px;\n");
      out.write("                min-height: 30px;\n");
      out.write("                color: #999;\n");
      out.write("                margin: 0 2px;\n");
      out.write("                line-height: 30px;\n");
      out.write("                border-radius: 2px !important;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 0 6px;\n");
      out.write("            }\n");
      out.write("            .pagination li a{\n");
      out.write("                background-color: #f0f0e9;\n");
      out.write("                border: 0;\n");
      out.write("                float: left;\n");
      out.write("                line-height: 1.42857;\n");
      out.write("                margin-left: -1px;\n");
      out.write("                padding: 6px 12px;\n");
      out.write("                position: relative;\n");
      out.write("                text-decoration: none;\n");
      out.write("                margin-right: 5px;\n");
      out.write("                color: #000;\n");
      out.write("            }\n");
      out.write("            .pagination {\n");
      out.write("                float: right;\n");
      out.write("                margin: 0 0 5px;\n");
      out.write("            }\n");
      out.write("            pagination {\n");
      out.write("                display: inline-block;\n");
      out.write("                padding-left: 0;\n");
      out.write("                margin: 20px 0;\n");
      out.write("                border-radius: 4px;\n");
      out.write("            }\n");
      out.write("            .pagination {\n");
      out.write("                display: inline-block;\n");
      out.write("                margin-bottom: 25px;\n");
      out.write("                margin-top: 0;\n");
      out.write("                padding-left: 15px;\n");
      out.write("            }\n");
      out.write("            ul {\n");
      out.write("                display: block;\n");
      out.write("                list-style-type: disc;\n");
      out.write("                margin-block-start: 1em;\n");
      out.write("                margin-block-end: 1em;\n");
      out.write("                margin-inline-start: 0px;\n");
      out.write("                margin-inline-end: 0px;\n");
      out.write("                padding-inline-start: 40px;\n");
      out.write("            }\n");
      out.write("            .pagination li.active a, .pagination li.active a.page-link {\n");
      out.write("                background: #03A9F4;\n");
      out.write("            }\n");
      out.write("            .clearfix:before {\n");
      out.write("                display: table;\n");
      out.write("                content: \" \";\n");
      out.write("            }\n");
      out.write("            .clearfix:before, .clearfix:after {\n");
      out.write("                display: table !important;\n");
      out.write("                content: \" \" ;\n");
      out.write("                clear: both !important;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"table-wrapper\">\n");
      out.write("                    <div class=\"table-title\">\n");
      out.write("                        <div class=\"rowss\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <h2>Manage <b>Product</b></h2>\n");
      out.write("                            </div>\n");
      out.write("                            <a href=\"#addEmployeeModal\"  class=\"btn btn-success\" data-toggle=\"modal\"><i class=\"material-icons\">&#xE147;</i> <span>Add product</span></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <table class=\"table table-striped table-hover\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Available</th>\n");
      out.write("                                <th>Product</th>\n");
      out.write("                                <th>Quantity</th>\n");
      out.write("                                <th>Image</th>\n");
      out.write("                                <th>Price</th>\n");
      out.write("                                <th>Sale</th>\n");
      out.write("                                <th>Edit/Delete</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                    <div class=\"clearfix\">\n");
      out.write("                        <div class=\"hint-text\">Show out <b>6</b> in <b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${allProduct}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b> products</div>\n");
      out.write("                        <nav aria-label=\"Page navigation\">\n");
      out.write("                            <ul class=\"pagination justify-content-center mb-3\">\n");
      out.write("                                <li class=\"pagfootere-item disabled\">\n");
      out.write("                                    <a class=\"page-link\" href=\"productManager?index=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page!=1?(page-1):(page)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" aria-label=\"Previous\">\n");
      out.write("                                        <span aria-hidden=\"true\">&laquo;</span>\n");
      out.write("                                        <span class=\"sr-only\">Previous</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                <li class=\"page-item\">\n");
      out.write("                                    <a class=\"page-link\" href=\"productManager?index=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page!=endPage?(page+1):(page)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" aria-label=\"Next\">\n");
      out.write("                                        <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("                                        <span class=\"sr-only\">Next</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </table>\n");
      out.write("                <div class=\"clearfix\">\n");
      out.write("                    <div class=\"hint-text\">Show out <b>6</b> in <b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${allProduct}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b> products</div>\n");
      out.write("                    <nav aria-label=\"Page navigation\">\n");
      out.write("                        <ul class=\"pagination justify-content-center mb-3\">\n");
      out.write("                            <li class=\"pagfootere-item disabled\">\n");
      out.write("                                <a class=\"page-link\" href=\"productManager?index=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page!=1?(page-1):(page)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" aria-label=\"Previous\">\n");
      out.write("                                    <span aria-hidden=\"true\">&laquo;</span>\n");
      out.write("                                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            <li class=\"page-item\">\n");
      out.write("                                <a class=\"page-link\" href=\"productManager?index=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page!=endPage?(page+1):(page)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" aria-label=\"Next\">\n");
      out.write("                                    <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("                                    <span class=\"sr-only\">Next</span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <a href=\"home\"><button type=\"button\" class=\"btn btn-primary\">Back to home</button></a>\n");
      out.write("        </div>\n");
      out.write("        <!--        <div id=\"addEmployeeModal\" class=\"modal fade\">\n");
      out.write("                    <div class=\"modal-dialog\">\n");
      out.write("                        <div class=\"modal-content\">\n");
      out.write("                            <form action=\"addproduct\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                                <div class=\"modal-header\">\t\t\t\t\t\t\n");
      out.write("                                    <h4 class=\"modal-title\">Add more product</h4>\n");
      out.write("                                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"modal-body\">\t\t\t\t\t\n");
      out.write("        \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Product name</label>\n");
      out.write("                                        <input name=\"name\" type=\"text\" class=\"form-control\" required placeholder=\"Product name\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Description</label>\n");
      out.write("                                        <textarea name=\"description\" type=\"text\" class=\"form-control\" placeholder=\"description\"></textarea>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Price</label>\n");
      out.write("                                        <input name=\"price\" class=\"form-control\" required placeholder=\"Ex: 100000\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Image</label>\n");
      out.write("                                        <input type=\"file\" name=\"imgFile\" class=\"form-control\" required></input>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Quantity</label>\n");
      out.write("                                        <textarea name=\"quantity\" class=\"form-control\" required placeholder=\"10.000vnd/100 gram\"></textarea>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Size</label>\n");
      out.write("                                        <textarea name=\"quantity\" class=\"form-control\" required placeholder=\"10.000vnd/100 gram\"></textarea>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Loại sản phẩm</label>\n");
      out.write("                                        <select name=\"category\" class=\"form-select\" aria-label=\"Default select example\">\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </select>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div class=\"modal-footer\">\n");
      out.write("<input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Huỷ\">\n");
      out.write("<input type=\"submit\" class=\"btn btn-success\" value=\"Thêm\">\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>-->\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <tr>\n");
          out.write("                                ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>\n");
          out.write("                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                </td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("₫</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.sale}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%</td>\n");
          out.write("                                <td>\n");
          out.write("                                    <a href=\"loadproduct?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"  class=\"edit\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Edit\">&#xE254;</i></a>\n");
          out.write("                                    <a href=\"deleteproduct?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"delete\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Delete\">&#xE872;</i></a>\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
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

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.available == true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <td>On shop</td>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.available == false}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <td style=\"color:red\">Stop</td>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
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
          out.write("                                    <li class=\"page-item active\"><a class=\"page-link ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page == i ?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" btn btn-default\" href=\"productManager?index=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                                    ");
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

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setBegin(1);
    _jspx_th_c_forEach_2.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${endPage}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_2.setVar("i");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <li class=\"page-item active\"><a class=\"page-link ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page == i ?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" btn btn-default\" href=\"productManager?index=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("o");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.idCategory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }
}
