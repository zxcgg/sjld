/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-09-02 15:41:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class table_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/css/bootstrap-table.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/css/bootstrap-editable.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/js/jquery-2.1.0.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/js/bootstrap-table.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/js/bootstrap-editable.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/js/bootstrap-table-editable.min.js\"></script>\r\n");
      out.write("    <script src=\"//cdn.bootcss.com/bootstrap-table/1.11.1/locale/bootstrap-table-zh-CN.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/js/table.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"panel-body\" style=\"padding-bottom:0px;\">\r\n");
      out.write("    <div class=\"panel panel-default\">\r\n");
      out.write("        <div class=\"panel-heading\">查询条件</div>\r\n");
      out.write("        <div class=\"panel-body\">\r\n");
      out.write("            <form id=\"formSearch\" class=\"form-horizontal\">\r\n");
      out.write("                <div class=\"form-group\" style=\"margin-top:15px\">\r\n");
      out.write("                    <label class=\"control-label col-sm-1\" for=\"txt_search_code\">code</label>\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"txt_search_code\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <label class=\"control-label col-sm-1\" for=\"txt_search_name\">名字</label>\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"txt_search_name\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-4\" style=\"text-align:left;\">\r\n");
      out.write("                        <button type=\"button\" style=\"margin-left:50px\" id=\"btn_query\" class=\"btn btn-primary\">查询\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("<div class=\"text-center\">\r\n");
      out.write("    <div id=\"toolbar\" class=\"btn-group\">\r\n");
      out.write("        <button id=\"btn_add\" type=\"button\" class=\"btn btn-default\" onclick=\"add()\"> 新增</button>\r\n");
      out.write("        <button id=\"btn_delete\" type=\"button\" class=\"btn btn-danger\" onclick=\"deleAll()\"> 删除</button>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"height: 70%\">\r\n");
      out.write("    <table id=\"table\"></table>\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("    <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                    <h4 class=\"modal-title\" id=\"myModalLabel\">添加</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                code:<input type=\"text\" id=\"code1\"><br><br>\r\n");
      out.write("                名字:<input type=\"text\" id=\"name1\">\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("                    <button type=\"button\" id=\"addbtn\" class=\"btn btn-primary\">确定</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"modal fade text-center\" id=\"sucess\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\"\r\n");
      out.write("         aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog  \">\r\n");
      out.write("            <div class=\"modal-content text-center\" style=\"margin:0 auto;   width: 140px\">\r\n");
      out.write("                <h4 class=\"modal-title\">成功</h4>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"modal fade text-center\" id=\"fail\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\"\r\n");
      out.write("         aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog  \">\r\n");
      out.write("            <div class=\"modal-content text-center\" style=\"margin:0 auto;   width: 140px\">\r\n");
      out.write("                <h4 class=\"modal-title\">失败</h4>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"modal fade\" id=\"deleall\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content text-center\" style=\"margin:0 auto;   width: 140px\">\r\n");
      out.write("            <h4 class=\"modal-title\">继续删除？</h4>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("                <button type=\"button\" id=\"deallbtn\" onclick=\"deleall1()\" class=\"btn btn-primary text-center\">确定\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"modal fade\" id=\"delet\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content text-center\" style=\"margin:0 auto;   width: 140px\">\r\n");
      out.write("            <h4 class=\"modal-title\">继续删除？</h4>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("                <button type=\"button\" id=\"debtn\" class=\"btn btn-primary text-center\">确定</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"modal fade\" id=\"modalls\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content text-center\" style=\"margin:0 auto;   width: 140px\">\r\n");
      out.write("            <h4 class=\"modal-title\">请选择数据</h4>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"modal fade\" id=\"update\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                <h4 class=\"modal-title\">修改</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <form>\r\n");
      out.write("                <div class=\"form-group \" style=\"display: none\">\r\n");
      out.write("                    <label>id</label>\r\n");
      out.write("                    <input type=\"text\" id=\"uid\" class=\"form-control\" placeholder=\"code\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label>code</label>\r\n");
      out.write("                    <input type=\"text\" id=\"ucode\" class=\"form-control\" placeholder=\"code\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label>name</label>\r\n");
      out.write("                    <input type=\"text\" id=\"uname\" class=\"form-control\" placeholder=\"name\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("                <button type=\"button\" id=\"upbtn\" onclick=\"update()\" class=\"btn btn-primary\">确定</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    var id = null\r\n");
      out.write("    var index = null\r\n");
      out.write("    var ids = new Array();\r\n");
      out.write("    ids = [];\r\n");
      out.write("\r\n");
      out.write("    function edit(id) {\r\n");
      out.write("        ids = id.split(',');\r\n");
      out.write("        $(\"#update\").modal(\"show\")\r\n");
      out.write("        $(\"#uid\").val(ids[0])\r\n");
      out.write("        $(\"#uname\").val(ids[2])\r\n");
      out.write("        $(\"#ucode\").val(ids[1])\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function update() {\r\n");
      out.write("        $(\"#update\").modal(\"hide\")\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url: \"/t/update\",\r\n");
      out.write("            method: \"get\",\r\n");
      out.write("            data: \"id=\" + ids[0] + \"&name=\" + $(\"#uname\").val() + \"&code=\" + $(\"#ucode\").val(),\r\n");
      out.write("            success: function (data) {\r\n");
      out.write("                stat(data)\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function add() {\r\n");
      out.write("        $(\"#myModal\").modal(\"show\")\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function del(id, index) {\r\n");
      out.write("        this.id = id;\r\n");
      out.write("        this.index = index;\r\n");
      out.write("        $(\"#delet\").modal(\"show\")\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    $(\"#debtn\").click(function () {\r\n");
      out.write("        $(\"#delet\").modal(\"hide\")\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url: \"/t/delet\",\r\n");
      out.write("            data: \"id=\" + id,\r\n");
      out.write("            method: \"get\",\r\n");
      out.write("            success: function (data) {\r\n");
      out.write("                stat(data)\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    function deleAll() {\r\n");
      out.write("        if (getIdSelections().length == \"0\") {\r\n");
      out.write("            $(\"#modalls\").modal(\"show\");\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        $(\"#deleall\").modal(\"show\");\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function deleall1() {\r\n");
      out.write("        $(\"#deleall\").modal(\"hide\")\r\n");
      out.write("        var ids = [];\r\n");
      out.write("        for (var i = 0; i < getIdSelections().length; i++) {\r\n");
      out.write("            ids.push(getIdSelections()[i])\r\n");
      out.write("        }\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url: \"/t/deleall\",\r\n");
      out.write("            method: \"post\",\r\n");
      out.write("            data: {\r\n");
      out.write("                \"ids\": ids\r\n");
      out.write("            },\r\n");
      out.write("            success: function (data) {\r\n");
      out.write("                stat(data)\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function stat(data) {\r\n");
      out.write("        if (data == \"success\") {\r\n");
      out.write("            $(\"#sucess\").modal(\"show\");\r\n");
      out.write("            $(\"#table\").bootstrapTable(('refresh'));\r\n");
      out.write("        } else {\r\n");
      out.write("            $(\"#table\").bootstrapTable(('refresh'));\r\n");
      out.write("            $(\"#fail\").modal(\"show\");\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function getIdSelections() {//获取id值\r\n");
      out.write("        return $.map($(\"#table\").bootstrapTable('getSelections'), function (row) {\r\n");
      out.write("            return row.id;\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
