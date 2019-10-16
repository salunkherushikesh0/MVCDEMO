<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.slksoft.entity.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC - Demo</title>
<link rel="stylesheet" type="text/css"
	href="assets/css/bootstrap.min.css">
</head>
<body>
	<div class="alert alert-dark">
		<div class="container">
			<h1>MVC - Demo</h1>
			<p class="lead">Developed by Rushi</p>
		</div>
	</div>
	<div class="container">
		<p>
			<%
				User user = (User) session.getAttribute("user");
				if (user != null) {
			%>
			<a href="./">Home</a>|
			<a href="./logout">Logout</a>
			<%
				} else {
			%>
			<a href="./">Home</a> | <a href="./login">Login</a> | <a
				href="./register">Register</a>
			<%
				}
			%>
		</p>
		<div style="min-height: 400px;">