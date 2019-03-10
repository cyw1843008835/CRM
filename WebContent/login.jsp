<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客户关系管理系统登录</title>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<style type=text/css>
body {
	text-align: center;
	padding-bottom: 0px;
	background-color: #ddeef2;
	margin: 0px;
	padding-left: 0px;
	padding-right: 0px;
	padding-top: 0px
}

a:link {
	color: #000000;
	text-decoration: none
}

a:visited {
	color: #000000;
	text-decoration: none
}

a:hover {
	color: #ff0000;
	text-decoration: underline
}

a:active {
	text-decoration: none
}

.input {
	border-bottom: #ccc 1px solid;
	border-left: #ccc 1px solid;
	line-height: 20px;
	width: 182px;
	height: 20px;
	border-top: #ccc 1px solid;
	border-right: #ccc 1px solid
}

.input1 {
	border-bottom: #ccc 1px solid;
	border-left: #ccc 1px solid;
	line-height: 20px;
	width: 120px;
	height: 20px;
	border-top: #ccc 1px solid;
	border-right: #ccc 1px solid;
}

table {
	margin: auto;
	width: 100%;
	height: 100%"; border =0;
	cellspacing: 0 cellpadding=0;
}

#btnlogin {
	border-right-width: 0px;
	border-top-width: 0px;
	border-bottom-width: 0px;
	border-left-width: 0px;
}

#btnreset {
	border-right-width: 0px;
	border-top-width: 0px;
	border-bottom-width: 0px;
	border-left-width: 0px;
}
#bk{
background-color: #278296;
}
#bk2{

margin: 0px auto; width: 936px;
}
</style>
<script type="text/javascript">
	function login() {
		
		var username = $("#userName").val();
		var password = $("#password").val();
		var rolename = $("#roleName").val();
		if (username == null || username == "") {
			alert("用户名不能为空！");
			return;
		}
		if (password == null || password == "") {
			alert("密码不能为空！");
			return;
		}
		if (rolename == null || rolename == "") {
			alert("请选择用户类型！");
			return;
		}
		$("#adminlogin").submit();

	}
</script>

</head>
<body>
	<form id="adminlogin" method="post" name="adminlogin" action="${pagecontext.request.contextpath}/CRM/user/login.do">
		
		<table>
			<tbody>
				<tr>
					<td height=150>&nbsp;</td>
				</tr>
				<tr style="height: 254px">
					<td>
						<div style="margin: 0px auto; width: 936px">
							<img style="display: block"
								src="${pageContext.request.contextPath}/images/body_03.jpg">
						</div>
						<div id="bk" >
							<div id="bk2" >
								<div
									style="background: url(${pageContext.request.contextPath}/images/body_05.jpg) no-repeat; height: 155px">
									<div
										style="text-align: left; width: 265px; float: right; height: 125px; _height: 95px">
										<table border=0 cellspacing=0 cellpadding=0 width="100%">
											<tbody>
												<tr>
													<td style="height: 45px"><input type="text"
														class=input value="${user.userName }" name="userName"
														id="userName"></td>
												</tr>
												<tr>
													<td><input type="password" class=input
														value="${user.password }" name="password" id="password" /></td>
												</tr>
												<tr>
													<td><select id="roleName" name="roleName"
														class="input" style="margin-top: 15px; height: 24px">
															<option value="">请选择用户类型...</option>
															<option value="系统管理员"
																${'系统管理员'==user.roleName?'selected':'' }>系统管理员</option>
															<option value="销售主管"
																${'销售主管'==user.roleName?'selected':'' }>销售主管</option>
															<option value="客户经理"
																${'客户经理'==user.roleName?'selected':'' }>客户经理</option>
															<option value="高管" ${'高管'==user.roleName?'selected':'' }>高管</option>
													</select></td>
												</tr>
											</tbody>
										</table>
									</div>
									<div style="height: 1px; clear: both"></div>
									<div style="width: 380px; float: right; clear: both">
										<table border=0 cellspacing=0 cellpadding=0 width=300>
											<tbody>

												<tr>
													<td width=100 align=right><input id="btnlogin"
														src="${pageContext.request.contextPath}/images/btn1.jpg"
														type="image" name="btnlogin" 
														onclick="javascript:login();return false;"/></td>
													<td width=100 align="center"><input id=btnreset
														src="${pageContext.request.contextPath}/images/btn2.jpg"
														type=image name=btnreset
														onclick="javascript:reset();return false;" />
													</td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
							</div>
						</div>
						<div style="margin: 0px auto; width: 936px">
							<img src="${pageContext.request.contextPath}/images/body_06.jpg">
						</div>
					</td>
				</tr>
				<tr style="height: 30%">
					<td>&nbsp;</td>
				</tr>

			</tbody>
		</table>
	</form>
</body>
<script type="text/javascript">
	if ('${errorMsg}' != '') {
		alert('${errorMsg}');
	}
</script>
</html>