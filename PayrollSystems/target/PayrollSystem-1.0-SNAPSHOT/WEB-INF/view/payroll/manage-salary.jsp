<%@include file="include/head.jsp" %>
<body class="theme-orange">

<!-- Page Loader -->
<div class="page-loader-wrapper">
    <div class="loader">
        <div class="m-t-30"><img src="https://thememakker.com/templates/lucid/hr/html/assets/images/logo-icon.svg" width="48" height="48" alt="Lucid"></div>
        <p>Please wait...</p>        
    </div>
</div>
<!-- Overlay For Sidebars -->

<div id="wrapper">

    <nav class="navbar navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-btn">
                <button type="button" class="btn-toggle-offcanvas"><i class="lnr lnr-menu fa fa-bars"></i></button>
            </div>

            <div class="navbar-brand">
                <a href="index-2.html"><img src="https://thememakker.com/templates/lucid/hr/html/assets/images/logo.svg" alt="Lucid Logo" class="img-responsive logo"></a>                
            </div>
            
            <div class="navbar-right">
                <form id="navbar-search" class="navbar-form search-form">
                    <input value="" class="form-control" placeholder="Search here..." type="text">
                    <button type="button" class="btn btn-default"><i class="icon-magnifier"></i></button>
                </form>                

                <div id="navbar-menu">
                    <ul class="nav navbar-nav">
                        <li>
                            <a href="app-events.html" class="icon-menu d-none d-sm-block d-md-none d-lg-block"><i class="icon-calendar"></i></a>
                        </li>
                        <li>
                            <a href="app-chat.html" class="icon-menu d-none d-sm-block"><i class="icon-bubbles"></i></a>
                        </li>
                        <li>
                            <a href="app-inbox.html" class="icon-menu d-none d-sm-block"><i class="icon-envelope"></i><span class="notification-dot"></span></a>
                        </li>
                        <li class="dropdown">
                            <a href="javascript:void(0);" class="dropdown-toggle icon-menu" data-toggle="dropdown">
                                <i class="icon-bell"></i>
                                <span class="notification-dot"></span>
                            </a>
                            <ul class="dropdown-menu notifications animated shake">
                                <li class="header"><strong>You have 4 new Notifications</strong></li>
                                <li>
                                    <a href="javascript:void(0);">
                                        <div class="media">
                                            <div class="media-left">
                                                <i class="icon-info text-warning"></i>
                                            </div>
                                            <div class="media-body">
                                                <p class="text">Campaign <strong>Holiday Sale</strong> is nearly reach budget limit.</p>
                                                <span class="timestamp">10:00 AM Today</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>                               
                                <li>
                                    <a href="javascript:void(0);">
                                        <div class="media">
                                            <div class="media-left">
                                                <i class="icon-like text-success"></i>
                                            </div>
                                            <div class="media-body">
                                                <p class="text">Your New Campaign <strong>Holiday Sale</strong> is approved.</p>
                                                <span class="timestamp">11:30 AM Today</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                    <li>
                                    <a href="javascript:void(0);">
                                        <div class="media">
                                            <div class="media-left">
                                                <i class="icon-pie-chart text-info"></i>
                                            </div>
                                            <div class="media-body">
                                                <p class="text">Website visits from Twitter is 27% higher than last week.</p>
                                                <span class="timestamp">04:00 PM Today</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">
                                        <div class="media">
                                            <div class="media-left">
                                                <i class="icon-info text-danger"></i>
                                            </div>
                                            <div class="media-body">
                                                <p class="text">Error on website analytics configurations</p>
                                                <span class="timestamp">Yesterday</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li class="footer"><a href="javascript:void(0);" class="more">See all notifications</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="javascript:void(0);" class="dropdown-toggle icon-menu" data-toggle="dropdown"><i class="icon-equalizer"></i></a>
                            <ul class="dropdown-menu user-menu menu-icon animated bounceIn">
                                <li class="menu-heading">ACCOUNT SETTINGS</li>
                                <li><a href="javascript:void(0);"><i class="icon-note"></i> <span>Basic</span></a></li>
                                <li><a href="javascript:void(0);"><i class="icon-equalizer"></i> <span>Preferences</span></a></li>
                                <li><a href="javascript:void(0);"><i class="icon-lock"></i> <span>Privacy</span></a></li>
                                <li><a href="javascript:void(0);"><i class="icon-bell"></i> <span>Notifications</span></a></li>
                                <li class="menu-heading">BILLING</li>
                                <li><a href="javascript:void(0);"><i class="icon-credit-card"></i> <span>Payments</span></a></li>
                                <li><a href="javascript:void(0);"><i class="icon-printer"></i> <span>Invoices</span></a></li>                                
                                <li><a href="javascript:void(0);"><i class="icon-refresh"></i> <span>Renewals</span></a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="page-login.html" class="icon-menu"><i class="icon-login"></i></a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </nav>
     <%@include file="include/navbarTopArea.jsp" %>         
    <%@include file="include/navbar.jsp" %>

    <div id="main-content">
        <div class="container-fluid">
            <div class="block-header">
                <div class="row">
                    <div class="col-lg-6 col-md-8 col-sm-12">
                        <h2><a href="javascript:void(0);" class="btn btn-xs btn-link btn-toggle-fullwidth"><i class="fa fa-arrow-left"></i></a> Manage Emplyee Monthly Salary</h2>
                        <ul class="breadcrumb">
                            <li class="breadcrumb-item"><a href="index-2.html"><i class="icon-home"></i></a></li>                            
                            <li class="breadcrumb-item">Payment</li>
                            <li class="breadcrumb-item active">Payment Setting</li>
                        </ul>
                    </div>            
                    <div class="col-lg-6 col-md-4 col-sm-12 text-right">
                        <div class="bh_chart hidden-xs">
                            <div class="float-left m-r-15">
                                <small>Visitors</small>
                                <h6 class="mb-0 mt-1"><i class="icon-user"></i> 1,784</h6>
                            </div>
                            <span class="bh_visitors float-right">2,5,1,8,3,6,7,5</span>
                        </div>
                        <div class="bh_chart hidden-sm">
                            <div class="float-left m-r-15">
                                <small>Visits</small>
                                <h6 class="mb-0 mt-1"><i class="icon-globe"></i> 325</h6>
                            </div>
                            <span class="bh_visits float-right">10,8,9,3,5,8,5</span>
                        </div>
                        <div class="bh_chart hidden-sm">
                            <div class="float-left m-r-15">
                                <small>Chats</small>
                                <h6 class="mb-0 mt-1"><i class="icon-bubbles"></i> 13</h6>
                            </div>
                            <span class="bh_chats float-right">1,8,5,6,2,4,3,2</span>
                        </div>
                    </div>
                </div>
            </div>
<%@include file="include/topIconLink.jsp" %>
            <div class="row clearfix">
                <div class="col-lg-12">
                    <div class="card">
                        <div class="header">
                            
                            <form action="${manageSalarySearchURL}" method="get">
                                     <div class="row">
                                         <div class="col-md-3">
                                            <div class="label">Selected Month</div>
                                            <input type="month" name="date" value="${currentMonthAndYear}" class="form-control">
                                         </div>
                                         <div class="col-md-3">
                                             <div class="label">Selected Shift</div>
                                             <select name="shiftid" class="form-control shift-changed3">
                                                  <core:forEach var="shifts" items="${allShifts}">
                                                      <option value="${shifts.shiftId}" <core:if test="${shifts.shiftId eq shiftId}">selected="selected"</core:if> >${shifts.shiftName}</option>
                                                  </core:forEach>
                                             </select>
                                         </div>
                                         <div class="col-md-3">
                                          <div class="label">Select Employee</div>
                                            <select name="id" class="form-control listOfEmployee3">
                                                <option value="0"> Select Employee</option>
                                                   <core:forEach var="empRow" items="${allEmployee}">
                                                       <option value="${empRow.empId}" <core:if test="${empId eq empRow.empId}">selected="selected"</core:if> >${empRow.empName}</option>
                                                   </core:forEach>
                                            </select>
                                         </div>
                                         <div class="col-md-3">
                                             <div class="label">&nbsp;</div>
                                             <input type="submit" value="Search" class="btn btn-primary" />
                                         </div>
                                     </div>
                                        
                            </form>   
                        </div>
                        <div class="body">
                            <div class="table-responsive">
                                <table class="table table-hover js-basic-example dataTable table-custom m-b-0 c_list">
                                    <thead class="thead-dark">
                                        <tr>
                                            <th>Employee Name</th>
                                            <th>Date</th>
                                            <th>Shift</th>
                                            <th>Attendance</th>
                                            <th>Total Salary</th>
                                            <th>Status</th>
                                            <th>Action</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <core:forEach var="keyAndVal" items="${keyAndValue}">
                                            <core:set var="attendance" value="0" />
                                            <core:set var="salary" value="0" />
                                            
                                            <core:set var="empId" value="0" />
                                            <core:set var="month" value="0" />
                                            <core:set var="year" value="0" />
                                            
                                           
                                                     
                                            <core:forEach var="values" items="${keyAndVal.value}" varStatus="status">
                                                 <core:set var="ShiftName" value="${values.shiftName}" />
                                                 <core:if test="${values.atdCheckin ne 'ci' && values.atdCheckin ne '' && values.atdCheckout ne 'co' && values.atdCheckout ne '' && values.atdDate ne ''}">
                                                     <core:set var="attendance" value="${attendance+3.3333333333333}" />
                                                     <core:set var="salary" value="${values.salStartingSalary}" />
                                                     <core:set var="empId" value="${values.atdAcnumber}" />
                                                     <core:set var="month" value="${values.atdMonthNumber}" />
                                                     <core:set var="year" value="${values.atdYear}" />
                                                     <core:set var="shiftId" value="${values.shiftId}" />
                                                 </core:if>
                                            </core:forEach>
                                           
                                            <tr>
                                                <td>${keyAndVal.key}</td>
                                                <td>${currentDate}</td>
                                                <td>${ShiftName}</td>
                                                <td>${attendance}</td>
                                                <td>${salary}</td>
                                                <td>Paid</td>
                                                <td><a href="${salaryPaymentURL}?id=${empId}&date=${currentDate}&shiftid=${shiftId}" class="fa fa-eye"> View</a>  | <a href="" class="fa fa-money"> Pay</a>  </td>
                                            </tr>
                                        </core:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Default Size -->

<!-- Javascript -->
<%@include file="include/footerScript.jsp" %>

<script>
    $(document).ready(function(){
     
       $('.shift-changed3').change(function(){
           var shiftId = $(this).val();
           $.ajax({
              url:"getEmployeeByShift",
              method:"POST",
              data:{shiftid:shiftId},
              success:function(employees){
              var empObj = $.parseJSON(employees);
              empArra = [];
              $.each(empObj,function(key,value){
              empArra.push("<option value='"+key+"'>"+value+"</option>");
              });
              var fullKeyAndValues = '<option value="0">Select Employee</option>'+empArra.toString().replace(",","");
              $('.listOfEmployee3').html(fullKeyAndValues);
              }
           });
       });
        
   
      
    });
</script>
</body>

<!-- Mirrored from thememakker.com/templates/lucid/hr/html/light/emp-leave.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 20 Oct 2018 05:27:16 GMT -->
</html>
