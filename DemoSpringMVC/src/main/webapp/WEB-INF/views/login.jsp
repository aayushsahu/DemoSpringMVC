<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<TITLE>You Know It Right</TITLE>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style type="text/css">
	body{
	
		overflow: hidden;
		background-repeat: no-repeat;
		background-size: cover;
		
	}
	#doctor{
		position: relative;
		left : 100px;
		top: 100px;
		width: 200px;
		height: 200px;
	}
	#form{
		position: absolute;
		width:200px;
		height: 50px;
		right: 300px;
		top: 325px;
		transition-delay: 0.5ms;
	}
	#field{
		padding: 30px; 
		width: 200px;
		height: 200px;
	}
</style>
<BODY background = "${pageContext.request.contextPath}/resources/img/sides.svg" style="height: 100vh">
	<div>
		<img  id="doctor" src="${pageContext.request.contextPath}/resources/img/doctor.svg"/>
	</div>
	<div id="form">
		<form method="post" action="">
			<input type="text" class="form-control form-control-lg text-white" name="user" placeholder="E-mail Address" />
			<br>
			<input type="password" class="form-control form-control-lg text-white" name="password" placeholder="Password" />
			<br>
			<input type="submit" name="submit" value="Submit!" class="form-control form-control-lg text-black btn">
		</form>
	</div>
</BODY>
</HTML>