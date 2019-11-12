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
                        <h2><a href="javascript:void(0);" class="btn btn-xs btn-link btn-toggle-fullwidth"><i class="fa fa-arrow-left"></i></a> Attendance List</h2>
                        <ul class="breadcrumb">
                            <li class="breadcrumb-item"><a href="index-2.html"><i class="icon-home"></i></a></li>                            
                            <li class="breadcrumb-item">Employee</li>
                            <li class="breadcrumb-item active">Attendance List</li>
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

            <div class="row clearfix">
                <div class="col-lg-12">
                    <div class="card">
                        <div class="body">
                            <div class="table-responsive">
                                <form:form action="${EditEmployeeRecordURL}" modelAttribute="command" method="POST" enctype="multipart/form-data"> 
                               <div class="modal-body">
                <div class="row clearfix">
                   <div class="col-md-6">
                        <div class="form-group">                                    
                            <form:input required="true" path="Employee.empName" class="form-control" value="${employeeRow.empName}"  placeholder="Employee Name" />
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">                                    
                            <form:input required="true" path="Employee.empEmail" class="form-control" value="${employeeRow.empEmail}"  placeholder="Email ID"  />
                        </div>
                    </div>
                    <div class="col-6">
                        <div class="form-group">                                    
                            <form:input required="true" path="Employee.empPhone" class="form-control"  value="${employeeRow.empPhone}"  placeholder="Phone Number" />
                        </div>
                    </div>    
                    
                   
                    <div class="col-md-6">
                        <div class="form-group">                                    
                            <form:input required="true" type="date" path="Employee.empJoindate"  value="${employeeRow.empJoindate}"  class="form-control" placeholder="Join Date" />
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">  
                             <form:input required="true" path="Employee.empRole"  value="${employeeRow.empRole}" class="form-control" placeholder="Role" />
                           
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">  
                             <form:input required="true" path="Employee.empJobtype" value="${employeeRow.empJobtype}"  class="form-control" placeholder="Employee Job Type" />
                           
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group"> 
                            <form:select required="true" path="Employee.empDepartment" class="form-control" >
                                 <core:forEach var="allDepart" items="${allDepartment}">
                                     <option <core:if test="${employeeRow.empDepartment eq allDepart.depId}">selected="selected"</core:if> value="${allDepart.depId}">${allDepart.depName}</option>
                                 </core:forEach>
                             </form:select>
                           
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">  
                             <form:input required="true" path="Employee.empJobtitle" value="${employeeRow.empJobtitle}"  class="form-control" placeholder="Employee Job Title" />
                           
                        </div>
                    </div>
                   
                    <div class="col-md-6">
                        <div class="form-group">  
                             <form:select required="true" path="Employee.empShift" class="form-control">
                                 <core:forEach var="allSh" items="${allShift}">
                                     <option <core:if test="${allSh.shiftId eq employeeRow.empShift}">selected="selected"</core:if> value="${allSh.shiftId}">${allSh.shiftName}</option>
                                 </core:forEach>
                             </form:select>    
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">                                   
                            <form:input required="true" type="date" value="${employeeRow.empDateofbirth}"  path="Employee.empDateofbirth" class="form-control" placeholder="Date of Birth" />
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="form-group"> 
                              <form:select required="true" path="Employee.empGender" class="form-control" >
                                 <option  <core:if test="${employeeRow.empGender eq '0'}">selected="selected"</core:if> value="0">Select Gender</option>
                                 <option  <core:if test="${employeeRow.empGender eq 'Male'}">selected="selected"</core:if> value="Male">Male</option>
                                 <option  <core:if test="${employeeRow.empGender eq 'Female'}">selected="selected"</core:if> value="Female">Female</option>
                             </form:select>
                           </div>
                    </div>
                    <div class="col-md-4">
                        <div class="form-group">  
                             <form:input type="number" path="Employee.empCnic" class="form-control" value="${employeeRow.empCnic}" placeholder="CNIC" />
                           <form:input type="hidden" path="Employee.empStatus" class="form-control" value="1" placeholder="Status" />
                           
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="form-group">  
                             
                            <form:input type="hidden" readonly="true" path="Employee.empSelf" value="${employeeRow.empSelf}"  class="form-control" placeholder="Employee Self Service" />
                             <form:input type="hidden" path="Employee.empId" class="form-control" value="${employeeRow.empId}" placeholder="Status" />
                         </div>
                    </div>
                    <div class="col-md-12">
                        <div class="form-group">  
                             <input type="submit" class="btn btn-primary" value="Save Changes" /> 
                           
                        </div>
                    </div>
                 
                </div>
            </div> </form:form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
</div>

<!-- Javascript -->
<%@include file="include/footerScript.jsp" %>
</body>

<!-- Mirrored from thememakker.com/templates/lucid/hr/html/light/emp-attendance.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 20 Oct 2018 05:27:16 GMT -->
</html>
