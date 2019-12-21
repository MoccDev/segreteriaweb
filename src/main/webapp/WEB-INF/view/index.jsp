<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="it" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Portale login</title>
    <style media="screen">
    </style>
    <link href="static/css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="static/css/custom.css" type="text/css" rel="stylesheet">
  </head>
  <body>
    <div class="container-fluid container-fluid-custom">

      <div class="jumbotron jumbotron-custom">
        <h1>Segreteria universitaria</h1>
      </div>
      <div class="container container-custom">
      <c:url var="url" value="/login"/>
          <form:form action="${url}" method="post" modelAttribute="login" class="form-horizontal">
            <div class="form-group row">
              <label class="control-label col-sm-1 label-custom" for="exampleInputEmail1">Email address</label>
              <div class="col-sm-6">
                <div class="form-group">
                  <form:input path="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" required="required"/>
                  <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                </div>
              </div>
            </div>
            <div class="form-group row">
              <label class="control-label col-sm-1 label-custom" for="exampleInputPassword1">Password</label>
              <div class="col-sm-6">
                <form:input path="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" required="required"/>
                <small id="error" class="form-text text-muted" style="color:red!important;">${login.error}</small>
              </div>
            </div>
            <div class="form-group row">
              <form:button type="submit" class="btn btn-primary">Submit</form:button>
            </div>
          </form:form>
      </div>

      <footer class="footer-custom">
        <div class="container">
          <div class="row">

            <div class="col-sm-4 link-custom-left">
              <ul style="list-style-type: none;">
                <li><strong>LINK</strong></li>
                <li><a href="#">About us</a></li>
                <li><a href="#">Contact us</a></li>
              </ul>
            </div>

            <div class="col-sm-4 link-custom-left copiright-custom">
              &copy; Copiright 2019: Salvatore Moccia
            </div>

            <div class="col-sm-4 link-custom-right">
              <a href="#">
                <img src="static/image/facebook.png">
              </a>
              <a href="#">
                <img src="static/image/linkedin.png">
              </a>
              <a href="#">
                <img src="static/image/google-plus.png">
              </a>
            </div>
          </div>
        </div>
      </footer>
    </div>

  </body>
</html>
