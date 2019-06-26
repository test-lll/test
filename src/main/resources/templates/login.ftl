<#assign ctx=request.contextPath />
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

</head>
<body>
<center>
    <form>
        <table border="1px" style="width: 100px;height: 50px">
            <tr >
                <td>用户名</td>
                <td><input type="text" name="uname"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="pwd"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="button" value="登录" onclick="login()"></td>
            </tr>
        </table>
    </form>
</center>



<script src="${ctx}/static/jquery-1.8.2.min.js"></script>
<script>
    function login() {
        $.post(
            "login",
            $("form").serialize(),
            function (data) {
                if(data){
                    alert("登录成功");
                    location = "list";
                }else{
                    alert("登录失败");
                }
            },"json"
        )
    }
</script>
</body>
</html>