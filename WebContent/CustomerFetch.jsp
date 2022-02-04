
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


   

     <!-- SCHEDULE -->
     <section class="schedule section" id="schedule">
               <div class="container">
                    <div class="row">

                            <div class="col-lg-12 col-12 text-center">
                                <h6 data-aos="fade-up">our weekly GYM schedules</h6>

                                <h2 class="text-white" data-aos="fade-up" data-aos-delay="200">Workout Timetable</h2>
                             </div>

                             <div class="col-lg-12 py-5 col-md-12 col-12">
                                 <table class="table table-bordered table-responsive schedule-table" data-aos="fade-up" data-aos-delay="300">
                                 <%@page import="com.controller.UCustomerFetch"%>
                                 <%@page import="com.dao.UCustomerFetchDao" %>
                                 <%@page import="java.util.ArrayList"%>
                                 <%@page import="com.model.UCustomerFetchpojo"%>
                                 <% ArrayList<UCustomerFetchpojo> list=(ArrayList<UCustomerFetchpojo>) session.getAttribute("ucustomer"); %>
                         

                                     <thead>                                      
                                         <th><strong>plot no</strong></th>
                                         <th><strong>Customer name</strong></th>
                                         <th><strong>street name</strong></th>
                                         <th><strong>Customer phone no</strong></th>
                                         <th><strong>pin code</strong></th>
                                         <th><strong>Customer Email</strong></th>
                                     </thead>

                                     <tbody>
                                        <% for(int i=0;i<list.size();i++){ %>
                                        <tr>                                      
                                        <td><strong><%=list.get(i).getPlotno() %></strong></td>
                                        <td><strong><%=list.get(i).getCname() %></strong></td>
                                        <td><strong><%=list.get(i).getStreetname() %></strong></td>
                                        <td><strong><%=list.get(i).getCphoneno() %></strong></td>
                                        <td><strong><%=list.get(i).getPincode() %></strong></td>
                                         <td><strong><%=list.get(i).getCemail() %></strong></td>
                                        </tr>
                                       
                                     </tbody>
                                 </table>
                                     
                             </div>
                            

                    </div>
               </div>
               
     </section>
     
     <section class="feature" id="feature">
        <div class="container">
            <div class="row">

                <div class="d-flex flex-column justify-content-center ml-lg-auto mr-lg-5 col-lg-5 col-md-6 col-12">
                     </div>

                <div class="mr-lg-auto mt-3 col-lg-4 col-md-6 col-12">
                     <div class="about-working-hours">
                          <div>
                              <button><a href="/NETBANKING/Caddcustomer.jsp">Add Customer</a></button>
                             <button><a href="/NETBANKING/Updatecustomer.jsp?cemail=<%=list.get(i).getCemail() %>">Update  Customer</a></button>
                             <button><a href="/NETBANKING/Deletecustomer.jsp">Delete Customer</a></button>
                               <%} %>
                               
                               </div>
                          </div>
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