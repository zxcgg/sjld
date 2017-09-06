<%--
  Created by IntelliJ IDEA.
  User: zxc
  Date: 2017/8/12
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/bootstrap-table.min.css">
    <link rel="stylesheet" href="/css/bootstrap-editable.css">
    <script type="text/javascript" src="/js/jquery-2.1.0.js"></script>
    <script type="text/javascript" src="/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap-table.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap-editable.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap-table-editable.min.js"></script>
    <script src="//cdn.bootcss.com/bootstrap-table/1.11.1/locale/bootstrap-table-zh-CN.min.js"></script>
    <script type="text/javascript" src="/js/table.js"></script>
</head>
<body>
<div class="panel-body" style="padding-bottom:0px;">
    <div class="panel panel-default">
        <div class="panel-heading">查询条件</div>
        <div class="panel-body">
            <form id="formSearch" class="form-horizontal">
                <div class="form-group" style="margin-top:15px">
                    <label class="control-label col-sm-1" for="txt_search_code">code</label>
                    <div class="col-sm-3">
                        <input type="text" class="form-control" id="txt_search_code">
                    </div>
                    <label class="control-label col-sm-1" for="txt_search_name">名字</label>
                    <div class="col-sm-3">
                        <input type="text" class="form-control" id="txt_search_name">
                    </div>
                    <div class="col-sm-4" style="text-align:left;">
                        <button type="button" style="margin-left:50px" id="btn_query" class="btn btn-primary">查询
                        </button>
                    </div>
                </div>
            </form>
        </div>
    </div>
<div class="text-center">
    <div id="toolbar" class="btn-group">
        <button id="btn_add" type="button" class="btn btn-default" onclick="add()"> 新增</button>
        <button id="btn_delete" type="button" class="btn btn-danger" onclick="deleAll()"> 删除</button>
    </div>
</div>
<div style="height: 70%">
    <table id="table"></table>
</div>
<div>
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title" id="myModalLabel">添加</h4>
                </div>
                code:<input type="text" id="code1"><br><br>
                名字:<input type="text" id="name1">
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                    <button type="button" id="addbtn" class="btn btn-primary">确定</button>
                </div>
            </div>
        </div>
    </div>

    <div class="modal fade text-center" id="sucess" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
         aria-hidden="true">
        <div class="modal-dialog  ">
            <div class="modal-content text-center" style="margin:0 auto;   width: 140px">
                <h4 class="modal-title">成功</h4>
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
    <div class="modal fade text-center" id="fail" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
         aria-hidden="true">
        <div class="modal-dialog  ">
            <div class="modal-content text-center" style="margin:0 auto;   width: 140px">
                <h4 class="modal-title">失败</h4>
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>

</div>
<div class="modal fade" id="deleall" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content text-center" style="margin:0 auto;   width: 140px">
            <h4 class="modal-title">继续删除？</h4>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" id="deallbtn" onclick="deleall1()" class="btn btn-primary text-center">确定
                </button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="delet" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content text-center" style="margin:0 auto;   width: 140px">
            <h4 class="modal-title">继续删除？</h4>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" id="debtn" class="btn btn-primary text-center">确定</button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="modalls" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content text-center" style="margin:0 auto;   width: 140px">
            <h4 class="modal-title">请选择数据</h4>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>

            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="update" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title">修改</h4>
            </div>
            <form>
                <div class="form-group " style="display: none">
                    <label>id</label>
                    <input type="text" id="uid" class="form-control" placeholder="code">
                </div>
                <div class="form-group">
                    <label>code</label>
                    <input type="text" id="ucode" class="form-control" placeholder="code">
                </div>
                <div class="form-group">
                    <label>name</label>
                    <input type="text" id="uname" class="form-control" placeholder="name">
                </div>
            </form>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" id="upbtn" onclick="update()" class="btn btn-primary">确定</button>
            </div>
        </div>
    </div>
</div>
</div>
</body>
</html>


<script>
    var id = null
    var index = null
    var ids = new Array();
    ids = [];

    function edit(id) {
        ids = id.split(',');
        $("#update").modal("show")
        $("#uid").val(ids[0])
        $("#uname").val(ids[2])
        $("#ucode").val(ids[1])
    }

    function update() {
        $("#update").modal("hide")
        $.ajax({
            url: "/t/update",
            method: "get",
            data: "id=" + ids[0] + "&name=" + $("#uname").val() + "&code=" + $("#ucode").val(),
            success: function (data) {
                stat(data)
            }
        })

    }

    function add() {
        $("#myModal").modal("show")
    }

    function del(id, index) {
        this.id = id;
        this.index = index;
        $("#delet").modal("show")
    }

    $("#debtn").click(function () {
        $("#delet").modal("hide")
        $.ajax({
            url: "/t/delet",
            data: "id=" + id,
            method: "get",
            success: function (data) {
                stat(data)
            }
        })
    })


    function deleAll() {
        if (getIdSelections().length == "0") {
            $("#modalls").modal("show");
            return false;
        }
        $("#deleall").modal("show");
    }

    function deleall1() {
        $("#deleall").modal("hide")
        var ids = [];
        for (var i = 0; i < getIdSelections().length; i++) {
            ids.push(getIdSelections()[i])
        }
        $.ajax({
            url: "/t/deleall",
            method: "post",
            data: {
                "ids": ids
            },
            success: function (data) {
                stat(data)
            }
        })
    }

    function stat(data) {
        if (data == "success") {
            $("#sucess").modal("show");
            $("#table").bootstrapTable(('refresh'));
        } else {
            $("#table").bootstrapTable(('refresh'));
            $("#fail").modal("show");
        }
    }

    function getIdSelections() {//获取id值
        return $.map($("#table").bootstrapTable('getSelections'), function (row) {
            return row.id;
        });
    }

</script>
