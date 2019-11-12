<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@include file="include/head.jsp" %>

<body class="theme-orange">
<s:url value="addEmployee" var="addEmployeeForm" />
<s:url value="/upload" var="uploadURL" />
<%-- Page Loader --%>
<div class="page-loader-wrapper">
    <div class="loader">
        <div class="m-t-30"><img src="https://thememakker.com/templates/lucid/hr/html/assets/images/logo-icon.svg" width="48" height="48" alt="Lucid"></div>
        <p>Please wait...</p>        
    </div>
</div>
<%-- Overlay For Sidebars --%>

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
                        <h2><a href="javascript:void(0);" class="btn btn-xs btn-link btn-toggle-fullwidth"><i class="fa fa-arrow-left"></i></a> Employee List</h2>
                        <ul class="breadcrumb">
                            <li class="breadcrumb-item"><a href="index-2.html"><i class="icon-home"></i></a></li>                            
                            <li class="breadcrumb-item">Employee</li>
                            <li class="breadcrumb-item active">Employee List</li>
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
                            <h2>Employee List</h2>
                            <ul class="header-dropdown">
                                <core:if test="${param.act eq 'success' && param.error eq 'success'}">
                                    <li><a href="javascript:void(0);" class="btn btn-success" style="margin: 0 330px 0px 0px; padding: 10px 20px 10px 20px;font-size: 20px;">Task Completed Successfully!</a></li>
                                </core:if>
                                <core:if test="${param.act eq 'success' && param.error ne 'success'}">
                                    <li><a href="javascript:void(0);" class="btn btn-danger" style="margin: 0 300px 0px 0px; padding: 5px 10px 5px 10px;font-size: 16px;">Date formate dd/MM/YY (01/01/18) in .xls file</a></li>
                                </core:if>
                                <core:if  test="${param.act eq 'wrong'}">
                                     <li><a href="javascript:void(0);" class="btn btn-danger" style="margin: 0 330px 0px 0px; padding: 10px 20px 10px 20px;font-size: 20px;">Some thing went wrong! Please try again.</a></li>
                                </core:if>
                               
                               
                                <li><a href="javascript:void(0);" class="btn btn-info" data-toggle="modal" data-target="#importEmp">Import Employee</a></li>
                                <li><a href="javascript:void(0);" class="btn btn-info" data-toggle="modal" data-target="#addcontact">Add New</a></li>
                            </ul>
                        </div>
                        <div class="body">
                            <div class="table-responsive">
                                <table class="table table-hover js-basic-example dataTable table-custom table-striped m-b-0 c_list">
                                    <thead class="thead-dark">
                                        <tr>
                                            <th>
                                                <label class="fancy-checkbox">
                                                    <input class="select-all" type="checkbox" name="checkbox">
                                                    <span></span>
                                                </label>
                                            </th>
                                            <th>Name</th>
                                            <th>Phone</th>
                                            <th>Join Date</th>
                                            <th>Role</th>
                                            <th>Action</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <core:forEach var="c" items="${allEmployee}">
                                       <tr>
                                            <td class="width45">
                                            <label class="fancy-checkbox">
                                                    <input class="checkbox-tick" type="checkbox" name="checkbox">
                                                    <span></span>
                                                </label>
                                            <s:url value="${employeeImgPath}${c.empImage}" var="img" />
                                                <img src="${img}" class="rounded-circle avatar" alt="">
                                                <button class="change-image-btn">Change</button>
                                            </td>
                                            <td>
                                                <h6 class="mb-0">${c.empName}</h6>
                                                <span>${c.empEmail}</span>
                                            </td>
                                            <td><span>+ ${c.empPhone}</span></td>
                                            <td>${c.empJoindate}</td>
                                            <td>${c.empRole}</td>
                                            <td>
                                                <a href="${updateEmployeeUrl}?id=${c.empId}" class="btn btn-sm btn-outline-secondary" title="Edit"><i class="fa fa-edit"></i></a>
                                                <a href="${deleteEmployeeUrl}?id=${c.empId}" class="btn btn-sm btn-outline-danger js-sweetalert" title="Delete"  onclick="return confirm('Are you sure?');"><i class="fa fa-trash"></i></a>
                                            </td>
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

<%-- Default Size --%>
<div class="modal animated zoomIn" id="addcontact" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        
           <form:form action="${addEmployeeForm}" modelAttribute="command" method="POST" enctype="multipart/form-data">
        <div class="modal-content">
              
            <div class="modal-header">
                <h6 class="title" id="defaultModalLabel">Add Employee Detail</h6>
            </div>
           
            <div class="modal-body">
                <div class="row clearfix">
                    <div class="col-md-6">
                        <div class="form-group">   
                            <div class="label">Employee Name</div>
                            <form:input required="true" path="Employee.empName" class="form-control" placeholder="Employee Name" />
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <div class="label">Email ID</div>
                            <form:input required="true" path="Employee.empEmail" class="form-control" placeholder="Email ID"  />
                        </div>
                    </div>
                    <div class="col-6">
                        <div class="form-group">   
                             <div class="label">Phone Number</div>
                            <form:input required="true" path="Employee.empPhone" class="form-control" placeholder="Phone Number" />
                        </div>
                    </div>    
                    
                   
                    <div class="col-md-6">
                        <div class="form-group">
                            <div class="label">Join Date</div>
                            <form:input required="true" type="date" path="Employee.empJoindate" class="form-control" placeholder="Join Date" />
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="form-group">
                            <div class="label">CNIC</div>
                            <form:input required="true" type="number" path="Employee.empCnic" class="form-control" placeholder="Join Date" />
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <div class="label">Role</div>
                             <form:input required="true" path="Employee.empRole" class="form-control" placeholder="Role" />
                           
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">  
                             <div class="label">Job Type</div>
                             <form:input required="true" path="Employee.empJobtype" class="form-control" placeholder="Job Type" />
                           
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group"> 
                             <div class="label">Department</div>
                             <form:select required="true" path="Employee.empDepartment" class="form-control" >
                                 <option value="">Select Department</option>
                                 <core:forEach var="allDepart" items="${allDepartment}">
                                     <form:option value="${allDepart.depId}">${allDepart.depName}</form:option>
                                 </core:forEach>
                             </form:select>
                             
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">  
                             <div class="label">Job Title</div>
                             <form:input required="true" path="Employee.empJobtitle" class="form-control" placeholder="Employee Job Title" />
                           
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">  
                             <div class="label">Picture</div>
                             <form:input required="true" type="file" path="empImage" class="form-control" placeholder="image" />
                             <form:input type="hidden" path="Employee.empStatus" class="form-control" value="1" placeholder="Status" />
                           
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group"> 
                             <div class="label">Shift & Time</div>
                             <form:select path="Employee.empShift" class="form-control">
                                 <option>Select Shift & Time</option>
                                 <core:forEach var="allSh" items="${allShift}">
                                     <form:option value="${allSh.shiftId}">${allSh.shiftName}</form:option>
                                 </core:forEach>
                             </form:select>
                            
                           
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="form-group">  
                             <div class="label">Date of Birth</div>
                            <form:input type="date" path="Employee.empDateofbirth" class="form-control" placeholder="Date of Birth" />
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="form-group">  
                             <div class="label">Gender</div>
                             <form:select required="true" path="Employee.empGender" class="form-control" >
                                 <option value="">Select Gender</option>
                                 <option value="Male">Male</option>
                                 <option value="Female">Female</option>
                             </form:select>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="form-group">
                             <div class="label">Self Service</div>
                             <form:input value="0" readonly="true" path="Employee.empSelf" class="form-control" placeholder="Self Service" />
                           
                        </div>
                    </div>
                </div>
            </div>
            
            <div class="modal-footer">
                <input type="submit" class="btn btn-primary" value="Add" /> 
                <button type="button" class="btn btn-secondary" data-dismiss="modal">CLOSE</button>
            </div>
           
        </div>
                </form:form>
    </div>
</div>
<%--IMPORT EMPLOYEE--%>
<div class="modal animated zoomIn" id="importEmp" tabindex="-1" role="dialog">
     <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h6 class="title" id="defaultModalLabel">Upload Attendance File</h6>
            </div>
            <form:form action="${importEmployeesUrl}" modelAttribute="command" method="post" enctype="multipart/form-data">
            <div class="modal-body">
                <div class="row clearfix">
                    <div class="col-md-12">
                        <input name="empImage"  type="file" class="form-control" />
                    </div>             
                </div>
            </div>
            <div class="modal-footer">
                <input type="submit" class="btn btn-primary" value="Add Attendance">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">CLOSE</button>
            </div>
            </form:form>
        </div>
    </div>
</div>
            
            
<%-- Javascript --%>
<%@include file="include/footerScript.jsp" %>

<%-- Mirrored from thememakker.com/templates/lucid/hr/html/light/emp-all.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 20 Oct 2018 05:27:16 GMT --%>
</html>
