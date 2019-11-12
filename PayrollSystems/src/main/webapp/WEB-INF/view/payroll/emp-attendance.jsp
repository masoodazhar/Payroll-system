
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
    <%@include file="include/atdSearch.jsp" %>
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
<%@include file="include/topIconLink.jsp" %>
            <div class="row clearfix">
                <div class="col-lg-12">
                    <div class="card">
                        <div class="header">
                            <h2>Attendance Of The Month : ${currentYear}</h2>
                            <ul class="Identify">
                                <li>OFF <div class="valOff"></div></li>
                                <li>Half <div class="valHaf"></div></li>
                                <li>Absent <div class="valAbsent"></div></li>
                                <li>Present <div class="valPresent"></div></li>
                                <li>No Checkout <div class="valNotCheckout"></div></li>
                            </ul>
                            <ul class="header-dropdown">
                                <core:if test="${param.act eq 'success'}">
                                    <li><a href="javascript:void(0);" class="btn btn-success" style="margin: 0 90px 0px 0px; padding: 10px 20px 10px 20px;font-size: 20px;">Task Completed Successfully!</a></li>
                                </core:if>
                                <core:if test="${param.act eq 'wrong'}">
                                    <li><a href="javascript:void(0);" class="btn btn-danger" style="margin: 0 90px 0px 0px; padding: 10px 20px 10px 20px;font-size: 20px;">Some thing went wrong! Please try again</a></li>
                                </core:if>
                               
                                    <li>
                                   
                                    </li>
                                <li><a href="javascript:void(0);" class="btn btn-info" data-toggle="modal" data-target="#file_Upload">Upload Attendance</a></li>
                            
                                <li><a href="javascript:void(0);" class="btn btn-info" data-toggle="modal" data-target="#Leave_Request">Add Manually</a></li>
                            
                            </ul>
                          
                        </div>
                        <div class="body">
                            <div class="table-responsive">
                                <table class="table table-hover PrintTable body">
                                    <thead>
                                        <tr>
                                            <th class="emp-btn">Employee</th>
                                            <core:forEach var="holi" begin="1" end="${numberOfDays}" items="${holidaysStatus}" varStatus="days">
                                            <th class="${holi.value}">${days.count}</th>
                                            </core:forEach>
                                                
                                        </tr>
                                    </thead>
                                    <tbody>
                                        
                                        <%--      ALL EMPLOYEES ARE SHOWING IN THIS AREA --%>
                                        
                                    <core:forEach var="allemp" items="${keyAndValue}">
                                        <tr>
                                            <td>${allemp.key}</td>
                                            <core:forEach var="allempAtt" items="${allemp.value}" varStatus="count">
                                                <core:choose>
                                                    <core:when test="${allempAtt.holiDays=='off'}">
                                                        <td><span class="valOff">O</span></td>
                                                    </core:when>
                                                    <core:otherwise>
                                                            <core:choose>
                                                              <core:when test="${allempAtt.atdCheckin eq '' || allempAtt.atdCheckin eq 'ci' }">
                                                                <td><span class="valAbsent">A</span></td>
                                                              </core:when>
                                                              <core:when test="${allempAtt.atdCheckout eq '' || allempAtt.atdCheckout eq 'co' }">
                                                                <td><span class="valNotCheckout">N</span></td>
                                                              </core:when>
                                                              <core:otherwise>
                                                                  
                                                                  <core:set var="checkinHoures" value="${fn:substringBefore(allempAtt.atdCheckin , ':')}" />
                                                                  <core:set var="checkinMinutes" value="${fn:substringAfter(allempAtt.atdCheckin , ':')}" />
                                                                 
                                                                  <core:set var="checkOutHoures"  value="${fn:substringBefore(allempAtt.atdCheckout , ':')}" />
                                                                  <core:set var="checkOutMinutes" value="${fn:substringAfter(allempAtt.atdCheckout , ':')}" />
                                                                  
                                                                  <core:forEach begin="${checkinHoures}" end="${checkOutHoures}" varStatus="hourseCont">
                                                                      <core:set var="totalHourse" value="${hourseCont.count}" />
                                                                  </core:forEach>
                                                                  <core:forEach begin="${checkinMinutes}" end="${checkOutMinutes}" varStatus="minuteCont">
                                                                      <core:set var="totalMinutes" value="${minuteCont.count}" />
                                                                  </core:forEach>
                                                                  <core:choose>
                                                                      <core:when test="${totalHourse >= allempAtt.shiftHoursd }">
                                                                          <td><span class="valPresent">P</span></td>
                                                                      </core:when>
                                                                      <core:otherwise>
                                                                          <td><span class="valHaf">H</span></td>
                                                                      </core:otherwise>
                                                                  </core:choose>
                                                                  
                                                                  
                                                                  
                                                                  <%--<td>${totalHourse}:${totalMinutes}</td>  --%> 
                                                                           
                                                                       
                                                              </core:otherwise>

                                                            </core:choose>
                                                        
                                                    </core:otherwise>
                                                </core:choose>
                                            </core:forEach>
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
<div class="modal animated lightSpeedIn" id="Leave_Request" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h6 class="title" id="defaultModalLabel">Add Employee Attendance</h6>
            </div>
            <form:form action="${addAtdUrl}" modelAttribute="command">
            <div class="modal-body">
                <div class="row clearfix">
                    <div class="col-md-12">
                        <div class="form-group">
                            <div class="label">Account Number</div>
                            <input  disabled="true" class="form-control accountNumber" placeholder="Employee A/C Number" >
                            <form:input type="hidden" path="Attendance.atdAcnumber" disabled="" class="form-control accountNumber" placeholder="Employee A/C Number" />
                        </div>
                    </div>
                    <div class="col-md-6">
                             <div class="label">Selected Shift</div>
                             <select name="shiftid" required="true" class="form-control shift-changed2">
                                 <option value="">Select Shift</option>
                                  <core:forEach var="shifts" items="${allShifts}">
                                      <option value="${shifts.shiftId}" <core:if test="${shifts.shiftId eq shiftRow.shiftId}">selected="selected"</core:if> >${shifts.shiftName}</option>
                                  </core:forEach>
                           </select>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <div class="label">Select Employee</div>
                            <form:select required="true" class="form-control mb-3 show-tick selectedEmp listOfEmployee2" path="Attendance.atdName">
                                <form:option value="">Select Emolyee Name</form:option>
                                <core:forEach var="allEmp" items="${allEmployee}">
                                <form:option value="${allEmp.empId}">${allEmp.empName}</form:option>
                                </core:forEach>
                            </form:select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <div class="label">Select Department</div>
                            <form:select required="true" class="form-control mb-3 show-tick" path="Attendance.atdDepartment">
                                <form:option value="">Select Department</form:option>
                                <core:forEach var="allDep" items="${allDepartment}">
                                <form:option value="${allDep.depName}">${allDep.depName}</form:option>
                                </core:forEach>
                            </form:select>
                        </div>
                    </div>
                    <div class="col-6">
                        <div class="form-group">
                            <div class="label">Select Date</div>
                            <form:input required="true" path="Attendance.atdDate" type="date" class="form-control atdDate" placeholder="Select Date"/>
                            <p class="date-message"></p>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <div class="label">Time In</div>
                            <form:input required="true" path="Attendance.atdCheckin" type="time" class="form-control time-in" placeholder="Select Time"/>
                         
                            <form:input type="hidden" value="1" path="Attendance.atdStatus"/>
                        </div>
                    </div>                    
                    <div class="col-md-6">
                        <div class="form-group">
                            <div class="label">Time Out</div>
                            <form:input path="Attendance.atdCheckout" type="time" class="form-control time-out" placeholder="Select Time"/>
                            <p class="time-out-message"></p>
                            <form:input type="hidden" value="1" path="Attendance.atdStatus"/>
                        </div>
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
<!-- file_Upload -->
<div class="modal animated lightSpeedIn" id="file_Upload" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h6 class="title" id="defaultModalLabel">Upload Attendance File</h6>
            </div>
            <form:form action="${uploadxlsUrl}" modelAttribute="command" method="post" enctype="multipart/form-data">
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
<!-- Javascript -->
<%@include file="include/footerScript.jsp" %>

<script>
    $(document).ready(function(){
       
     
       $('.shift-changed').change(function(){
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
              $('.listOfEmployee').html(fullKeyAndValues);
              }
           });
       });
       $('.shift-changed2').change(function(){
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
              $('.listOfEmployee2').html(fullKeyAndValues);
              }
           });
       });
        
        
       $('.selectedEmp').change(function(){
           $('.accountNumber').val($(this).val()); 
        });
        
        $('.atdDate').change(function(){
            selectedDate = $(this).val().replace('-','');
            
            var d = new Date();
            var cDate = d.getFullYear()+''+(d.getMonth()+1)+''+d.getDate();
            selectedDate = selectedDate.replace('-','');
            if(selectedDate>=cDate){
                //alert("equal and greater then today!");
                $('.date-message').text("you can't select future Date!").css("color","red");
                $(this).val("");
                $('.time-out').val("");
                $('.time-in').val("");                
                $('.time-out').attr("readOnly","true");
                //$('.time-in').attr("readOnly","true");
                
            }else{
                //alert("less then today!");
                $('.date-message').text("");
                $('.time-out').removeAttr("readOnly");
                $('.time-in').removeAttr("readOnly");
                
            }

        });
      $('.time-out').change(function(){
         timeIn =  $('.time-in').val();
          if(timeIn===$(this).val()){
              $(this).val("");
              $('.time-out-message').text("Time Out Can't be same!").css("color","red");
          }else{
              $('.time-out-message').text("");
          }
      });
    });
</script>
</body>

</html>
                             