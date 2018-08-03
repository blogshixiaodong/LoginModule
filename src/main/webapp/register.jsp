<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <title>用户注册页面</title>
    <link rel="stylesheet" href="vendors/bootstrap/css/bootstrap.css" />
    <link rel="stylesheet" href="vendors/bootstrap-table/css/bootstrap-table.min.css" />
    <link rel="stylesheet" href="module/css/common.css" />
    <link rel="stylesheet" href="module/css/index.css" />

    <link rel="stylesheet" href="module/css/common.css" />
    <link rel="stylesheet" href="module/css/index.css" />

</head>
<body>
<div class="container">
    <!-- 导航栏部分 -->

    <div class="row">
        <div class="panel panel-primary">
            <div class="panel-heading">
                用户注册
            </div>
            <div class="panel-body">
                <form style='margin:0px' class='form-horizontal' id='register' action="user/register" method="POST" >
                    <div class='form-group row'>
                        <label  class='col-xs-2 control-label'>账号*</label>
                        <div class='col-xs-10'>
                            <input type='text' class='form-control ' name='accountId' id='accountId'>
                        </div>
                    </div>
                    <div class='form-group row'>
                        <label  class='col-xs-2 control-label'>密码*</label>
                        <div class='col-xs-10'>
                            <input type='password' class='form-control ' name='password' id='password'>
                        </div>
                    </div>
                    <div class='form-group row'>
                        <label  class='col-xs-2 control-label'>密码重复*</label>
                        <div class='col-xs-10'>
                            <input type='password' class='form-control ' name='password1' id='password1'>
                        </div>
                    </div>
                    <div class='form-group row'>
                        <label  class='col-xs-2 control-label'>姓名</label>
                        <div class='col-xs-10'>
                            <input class='form-control ' name='username' id='username'>
                        </div>
                    </div>
                    <div class='form-group row'>
                        <label  class='col-xs-2 control-label'>性别*</label>
                        <div class='col-xs-10'>
                            <input type='radio' name='gender'  value="男">男
                            <input type='radio' name='gender' value="女">女
                        </div>
                    </div>
                    <div class='form-group row'>
                        <label  class='col-xs-2 control-label'>住址*</label>
                        <div class='col-xs-10'>
                            <input type='text' class='form-control ' name='address' id='address'>
                        </div>
                    </div>
                    <div class='form-group'>
                        <div class='col-xs-10 col-xs-offset-2'>
                            <input id="submit"   class="submit btn btn-default" type="submit" value="注册" onclick="return validate()">
                            <input  class="reset btn btn-default" type="reset" value="重置">
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</div>

<script type="text/javascript" src="vendors/jquery/jquery.min.js"></script>
<script type="text/javascript" src="vendors/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="vendors/bootstrap-table/js/bootstrap-table.min.js"></script>
<script type="text/javascript" src="vendors/bootstrap-table/js/bootstrap-table-zh-CN.min.js"></script>
<script type="text/javascript" src="module/js/common/common.js"></script>
<script>
    function validate(){
        var gender = $('input[name="gender"]').val();
        var accountId = $("#accountId").val();
        var password = $("#password").val();
        var password1 = $("#password1").val();
        var username = $("#username").val();
        var address = $("#address").val();
        if(gender == "" || accountId == "" || password== "" || password1 == "" || username == "" || address == ""){
            alert("请将信息填写完整");
            return false;
        }
        if(password != password1){
            alert("两次尼玛不匹配");
            return false;
        }
        return true;
    }


</script>
</body>
</html>
