var Mymodule = null;
$(function () {

        Mymodule = {
            initTable: function () {
                $("#table").bootstrapTable({
                    url: "t/table",
                    method: "get",
                    toolbar: '#toolbar',                //工具按钮用哪个容器
                    striped: true,                      //是否显示行间隔色
                    cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
                    search: true,
                    editable: true,
                    searchOnEnterKey: true,
                    strictSearch: true,
                    pagination: true,                   //是否显示分页（*）
                    sortable: false,                     //是否启用排序         //排序方式
                    sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
                    toolbarAlign: "right",
                    clickToSelect: true,
                    pageNumber: 1,                       //初始化加载第一页，默认第一页
                    pageSize: 10,                       //每页的记录行数（*）
                    pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
                    strictSearch: true,
                    queryParamsType: 'undefined',
                    queryParams: function queryParams(params) {//设置查询参数
                        var param = {
                            page: params.pageNumber,
                            rows: params.pageSize
                        };
                        return param;
                    },
                    // queryParams: oTableInit.queryParams,//传递参数（*）
                    showColumns: true,                  //是否显示所有的列
                    showRefresh: true,                  //是否显示刷新按钮
                    checkboxHeader:false ,
                    minimumCountColumns: 2,             //最少允许的列数
                    clickToSelect: true,                //是否启用点击选中行
                    showToggle:true,                    //是否显示详细视图和列表视图的切换按钮
                    cardView: false,                    //是否显示详细视图
                    detailView: false,                   //是否显示父子表
                    columns: [{
                        checkbox: true
                    }, {
                        field: 'id',
                        title: 'ID',
                        align: 'center',
                    }, {
                        field: 'code',
                        align: 'center',
                        title: 'code',
                        editable: {
                            type: 'text',
                            title: '用户名',
                            validate: function (v) {
                                if (!v) return '用户名不能为空';
                            }
                        }
                    }, {
                        field: 'name',
                        title: '名字',
                        align: 'center',
                        editable: {
                            type: 'text',
                            title: '用户名',
                            validate: function (v) {
                                if (!v) return '用户名不能为空';
                            }
                        }
                    }, {
                        title: '操作',
                        align: 'center',
                        formatter: function (value, row, index) {
                            var e = '<a href="#"  mce_href="#"  id="e' + index + '" class="btn btn-primary"  onclick="edit(\'' + row.id + "," + row.code + "," + row.name + '\')">修改</a> ';
                            var d = '<a href="#" mce_href="#" class="btn btn-danger" onclick="del(\'' + row.id + '\')">删除</a> ';
                            return e + d;
                        }
                    }],
                    onEditableSave: function (field, row, oldValue) {
                        var ids = [];
                        ids.push(row.id)
                        ids.push(row.code)
                        ids.push(row.name)
                        $.ajax({
                            type: "get",
                            url: "/t/update",
                            data: "id=" + row.id + "&code=" + row.code + "&name=" + row.name,
                            success: function (data) {
                                stat(data)
                            }
                            ,
                        });
                    },
                })
            }
        }
        Mymodule.initTable();


        $("#addbtn").click(function () {//添加
            $.ajax({
                url: "/t/insert",
                method: "get",
                data: "name=" + $("#name1").val() + "&code=" + $("#code1").val(),
                success: function (data) {
                    $("#myModal").modal("hide");
                    if (data == "success") {
                        $("#sucess").modal("show");
                        $("#table").bootstrapTable(('refresh'));
                        $("#name1").val("")
                        $("#code1").val("")
                    } else {
                        $("#fail").modal("show");
                    }
                }
            })

        })
        $("#table").bootstrapTable("hideColumn", "id");
        $("#btn_query").click(function () {

        })
    }
)
