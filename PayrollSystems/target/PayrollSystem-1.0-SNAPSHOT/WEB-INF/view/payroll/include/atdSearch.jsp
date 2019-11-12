  <div class="my-dive-search">
             <form:form modelAttribute="command" action="${searchEmpUrl}" method="get">
                     <div class="row">
                         <div class="col-md-12">
                           <div class="label">Selected Month</div>
                           <input type="month" name="date" value="${currentMonthAndYear}" class="form-control">
                         </div>
                     </div>
                     <br>
                     <div class="row">
                        <div class="col-md-5">
                             <div class="label">Selected Shift</div>
                             <select name="shiftid" class="form-control shift-changed">
                                  <core:forEach var="shifts" items="${allShifts}">
                                      <option value="${shifts.shiftId}" <core:if test="${shifts.shiftId eq shiftRow.shiftId}">selected="selected"</core:if> >${shifts.shiftName}</option>
                                  </core:forEach>
                           </select>
                        </div>

                        <div class="col-md-7">
                             <div class="label">Select Employee</div>
                           <select name="id" class="form-control listOfEmployee">
                               <option value="0"> Select Employee</option>
                                  <core:forEach var="empRow" items="${allEmployee}">
                                      <option value="${empRow.empId}" <core:if test="${employeeRow.empId eq empRow.empId}">selected="selected"</core:if> >${empRow.empName}</option>
                                  </core:forEach>
                           </select>
                        </div>
                     </div>     
                     <br>
                     <div class="row">
                        <div class="col-md-4">       
                           <input type="submit" value="Search" class="btn btn-primary">
                        </div>  
                     </div>
             </form:form>
      
    </div>