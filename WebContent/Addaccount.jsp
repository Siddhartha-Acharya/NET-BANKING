<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">
<head>

     <title>XYZ Bank</title>

     <meta charset="UTF-8">
     <meta http-equiv="X-UA-Compatible" content="IE=Edge">
     <meta name="description" content="">
     <meta name="keywords" content="">
     <meta name="author" content="">
     <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

     <link rel="stylesheet" href="css1/bootstrap.min.css">
     <link rel="stylesheet" href="css1/font-awesome.min.css">
     <link rel="stylesheet" href="css1/aos.css">

     <!-- MAIN CSS -->
     <link rel="stylesheet" href="css1/tooplate-gymso-style.css">
<!--
Tooplate 2119 Gymso Fitness
https://www.tooplate.com/view/2119-gymso-fitness
-->
</head>
<body data-spy="scroll" data-target="#navbarNav" data-offset="50">

    <!-- MENU BAR -->
    <nav class="navbar navbar-expand-lg fixed-top">
        <div class="container">

            <a class="navbar-brand" href="index.html">XYZ Bank</a>

            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false"
                aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarNav">
                 <ul class="navbar-nav ml-lg-auto">
                    <li class="nav-item">
                        <a href="#home" class="nav-link smoothScroll">Home</a>
                    </li>

                    <li class="nav-item">
                        <a href="#about" class="nav-link smoothScroll">About Us</a>
                    </li>

                    <li class="nav-item">
                        <a href="/NETBANKING/UCustomerFetch" class="nav-link smoothScroll">Customer Info</a>
                    </li>

                    <li class="nav-item">
                        <a href="/NETBANKING/AccountFetch" class="nav-link smoothScroll">Account Info</a>
                    </li>

                    <li class="nav-item">
                        <a href="/Fundtransfer.jsp" class="nav-link smoothScroll">Fund Transfer</a>
                    </li>
                    <li class="nav-item">
                        <a href="/NETBANKING/FD.jsp" class="nav-link smoothScroll">FD</a>
                    </li>
                    <li class="nav-item">
                        <a href="/NETBANKING/RD.jsp" class="nav-link smoothScroll">RD</a>
                    </li>
                </ul>
                <ul class="social-icon ml-lg-3">
                    <li><a href="https://fb.com/tooplate" class="fa fa-facebook"></a></li>
                    <li><a href="#" class="fa fa-twitter"></a></li>
                    <li><a href="#" class="fa fa-instagram"></a></li>
                </ul>
            </div>

        </div>
    </nav>

 
     <!-- CONTACT -->
     <section class="contact section" id="contact">
          <div class="container">
               <div class="row">

                    <div class="ml-auto col-lg-5 col-md-6 col-12">
                        <h2 class="mb-4 pb-2" data-aos="fade-up" data-aos-delay="200">Customer</h2>

                        <form action="/NETBANKING/Addaccount" name="Addaccount" method="post">
                     
                         
                      <input type="text" class="form-control" name="accno" placeholder="Account No">
                      <select name="acctype">
                       <option>select</option>
                       <option>student</option>
                       <option>general</option>
                       </select>
                      <input type="date" class="form-control" name="dateofopen" placeholder="First Date">
                      <input type="text" class="form-control" name="balance" placeholder="Balance">
                      
                      
                        

                            <button type="submit" class="form-control" id="submit-button" name="submit">Add Account</button>
                        </form>
                    </div>

                    
               </div>
          </div>
     </section>


 

     <!-- SCRIPTS -->
     <script src="js1/jquery.min.js"></script>
     <script src="js1/bootstrap.min.js"></script>
     <script src="js1/aos.js"></script>
     <script src="js1/smoothscroll.js"></script>
     <script src="js1/custom.js"></script>

</body>
</html>