
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
                        <h2 class="mb-4 pb-2" data-aos="fade-up" data-aos-delay="200">Add Customer</h2>

                       <form action="/NETBANKING/Adcustomer" name="Adcustomer" method="post">
                        <input type="text" class="form-control" name="cid" placeholder="Customer Id">
                        
                <input type="text" class="form-control" name="plotno" placeholder="plot no">

                <input type="text" class="form-control" name="cname" placeholder="customer name">

                <input type="email" class="form-control" name="cemail" placeholder="customer@gmail.com">

                <input type="password" class="form-control" name="password" placeholder="password">
                
                 <input type="text" class="form-control" name="cphoneno" placeholder="customer phone no">
                 
                   <input type="date" class="form-control" name="dob" placeholder="dob">
                   
                  <select name="gender" class="from-control">
                  <option>Male</option>
                  <option>Female</option>
                  <option>others</option>
                  </select>
                 
                  <input type="text" class="form-control" name="adharno" placeholder="adhar no" pattern="[0-9]{16}" required>
                 
                   <input type="text" class="form-control" name="panno" placeholder="pan no">
                 
                      <input type="text" class="form-control" name="streetname" placeholder="streetname">
                 
                       <input type="text" class="form-control" name="pincode" placeholder="pincode" pattern="[0-9]{6}" required>

                            <button type="submit" class="form-control" id="submit-button" name="submit">Add Customer</button>
                        </form>
                    </div>

                    <div class="mx-auto mt-4 mt-lg-0 mt-md-0 col-lg-5 col-md-6 col-12">
                        <h2 class="mb-4" data-aos="fade-up" data-aos-delay="600">Where you can <span>find us</span></h2>

                        <p data-aos="fade-up" data-aos-delay="800"><i class="fa fa-map-marker mr-1"></i> 120-240 Rio de Janeiro - State of Rio de Janeiro, Brazil</p>
<!-- How to change your own map point
	1. Go to Google Maps
	2. Click on your location point
	3. Click "Share" and choose "Embed map" tab
	4. Copy only URL and paste it within the src="" field below
-->
                        <div class="google-map" data-aos="fade-up" data-aos-delay="900">
                           <iframe src="https://maps.google.com/maps?q=Av.+L�cio+Costa,+Rio+de+Janeiro+-+RJ,+Brazil&t=&z=13&ie=UTF8&iwloc=&output=embed" width="1920" height="250" frameborder="0" style="border:0;" allowfullscreen=""></iframe>
                        </div>
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

