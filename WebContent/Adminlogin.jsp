
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Login in</title>
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
        
        <div class="dark-panel-center">
        <form action="/NETBANKING/Adminlogin" method="post" name="Adminlogin">
          <ul>
            <li>
              <h1>Login in</h1>
            </li>
            
            <li class="username">
              <input name="username" type="text" class="login-input" placeholder="Username" />
            </li>
            <li class="password">
              <input name="password" type="password" class="login-input" placeholder="Password"/>
            </li>
            <button class="button">Submit</button>
         </form>
           </ul>
        </div>
</body>
</html>
