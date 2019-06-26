<#assign ctx=request.contextPath />
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

</head>
<body>

    <form>
        <div style="height: 300px;width: 150px;">
            请选择数据库：
                <select name="mid">
                    <option>---请选择---</option>
                </select><br>
            端口号：<input type="text" name="port" value="3306"><br>
            IP地址：
                <input type="text" name="ip"><br>
            用户名：<input type="text" name="muserName" value="root"><br>
            密码：<input type="password" name="mpwd" value="root"><br>
            <input type="button" value="提交" onclick="conn()">
        </div>
        <div class="div1" style="height: 300px;width: 150px;">

        </div>
    </form>

<script src="${ctx}/static/jquery-1.8.2.min.js"></script>
<script>
    $(function () {
        $.post(
            "selectMysql",
            function (data) {
                console.log(data);
                for(var i in data){
                    $("[name=mid]").append('<option value="'+data[i].mid+'">'+data[i].mname+'</option>')
                }
            },"json"
        )
    })
    /*function conn() {
        $.post(
            "selectData",
            function (data) {
                console.log(data);
                for(var i in data){
                    $(".div1").append('');
                }
            },"json"
        )
    }*/
</script>
</body>
</html>