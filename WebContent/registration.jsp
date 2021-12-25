<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Registration</title>
<link href='http://fonts.googleapis.com/css?family=Ubuntu+Condensed' rel='stylesheet' type='text/css'/>
<link href="css/styles.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="wrapper">
  <div class="logo-menu-container">
    <div class="logo">Welcome</div>
    <div class="menu">
      <ul>
       
      </ul>
    </div>
  </div>
  <div class="searchform-container">
    <div class="searchform-content">Welcome to our banking site!!</div>
    <div class="search">
      <div class="search-input">
        <input type="text" name="search" class="search-input-textfield" />
      </div>
      <div class="search-icon"><a href="#"><img src="images/search-icon.png" alt="search" /></a></div>
    </div>
  </div>
  <div class="clear"></div>
  <div class="page">
    <div class="main-banner"><img src="images/banner.jpg" alt="banner" /></div>
    <div class="clear"></div>
    <div class="left-column">
      <div class="dark-panel">
        <div class="dark-panel-top"></div>
        <form action="/NETBANKING/RegistrationController" method="post" name="RegistrationController">
        <div class="dark-panel-center">
          <ul>
            <li>
              <h1>Registration</h1>
            </li>
            <li>
              <p>Don't have any account please registration here</p>
            </li>
            <li class="username">
              <input name="cid" type="text" class="login-input" placeholder="CID" />
            </li>
            <li class="password">
              <input name="password" type="password" class="login-input" placeholder="Password" />
            </li>
            <button class="button" backgroundcolor="red">Submit</button>
          </ul>
        </div>
        </form>
        </div>
        
</body>
</html>
