<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">

<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="shortcut icon" href="/Images/favicon.ico" type="image/x-icon">
<link
	href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap4.min.css"
	rel="stylesheet" />
<link
	href="https://cdn.datatables.net/fixedheader/3.1.5/css/fixedHeader.bootstrap4.min.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" />
<link
	href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap4.min.css"
	rel="stylesheet" />
<link rel="stylesheet" href="css/style.css" />

</head>
<body>


	<div class="wrap">



		<div class="header col-md-12">




			<div id="siteactions" class="col-md-12">
				<a title="Home"
					class="font-adjust border-0 btn btn-link py-0 py-sm-1 bg-green"
					href="javascript:__doPostBack('ctl00$ucfrm_HeaderDept$LinkButton_Home','')"><i
					class="fas fa-home"></i></a> <a title="Change page contrast"
					id="makeorig" href="#"
					class="bg-white d-none d-sm-block text-black">A</a> <a
					title="Change page contrast" id="makeblack" href="#"
					class="bg-dark d-none d-sm-block text-white">A</a> <a
					title="Increase font size" class="d-none d-sm-block" id="fontup"
					href="#">+A</a> <a title="Reset font size"
					class="d-none d-sm-block" id="fontreset" href="#">A</a> <a
					title="Decrease font size" class="d-none d-sm-block" id="fontdown"
					href="#">-A</a> </a>

			</div>

		</div>
		<div class="col-md-12 row p-2 ">
			<div class="col-md-8 userinfo">
				<strong>Welcome: </strong>${loggedInUser.loginId}  &nbsp;&nbsp; |  &nbsp;&nbsp; <strong>Last Login time:</strong>
				
				<fmt:formatDate type="both" dateStyle="medium" timeStyle="medium"
					value="${loggedInUser.lastLogin}"></fmt:formatDate>
			</div>
			<div style="text-align: right;" class="col-md-4 breadcrumb1">
				<a href="dashboard">Dashboard</a> | <a href="#">Setting</a> | <a
					href="logout">Logout</a>
			</div>


		</div>
		<hr>






	</div>
	<div class="preloader" style="display:none"></div>
</body>
</html>