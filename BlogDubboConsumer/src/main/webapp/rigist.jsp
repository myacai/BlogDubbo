<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0">

<title>注册</title>
<meta name="keywords" content="">
<meta name="description" content="">
<link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.ico"> 
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/font-awesome.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/animate.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/style.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/login.css"
	rel="stylesheet">

<script>
        if (window.top !== window.self) {
            window.top.location = window.location;
        }
    </script>

</head>

<body class="signin">
	<div class="signinpanel">
		<div class="row">

			<div class="col-sm-5">
				<form id="login" action="${pageContext.request.contextPath}/checkLogin" method="post">
					<h3 class="no-margins">注册</h3>
					<p class="m-t-md">注册后登录访问后台管理网站</p>
					<input type="text" id="username" name="username" class="form-control uname"
						placeholder="用户名" />
					<input type="password" name="password" id="password"
						class="form-control pword m-b" placeholder="密码" />
					<input type="text" name="email" id="email"
						   class="form-control pword m-b" placeholder="邮箱" />

						 <span class="msg" style="color:#6722228a;margin-left:20px;"
						href="javascript:void(0);">${message }</span>
					<button type="submit"  class="btn btn-success btn-block">注册</button>
				</form>
			</div>
		</div>

	</div>
	<div class="gohome" style="display:none"></div>
	<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/content.js"></script>
	<script type="text/javascript">
$(document).ready(function() {
	$(".gohome").css("display","none");
});


var login=function(){
	var username=$("#username").val().replace(/</g,'&lt;').replace(/>/g,'&gt;').replace(/"/g, "&quot;").replace(/'/g, "&#039;");
	var password=$("#password").val().replace(/</g,'&lt;').replace(/>/g,'&gt;').replace(/"/g, "&quot;").replace(/'/g, "&#039;");
	$("#username").val(username);
	$("#password").val(password);
	$("#login").submit();
}
</script>
</body>

</html>
