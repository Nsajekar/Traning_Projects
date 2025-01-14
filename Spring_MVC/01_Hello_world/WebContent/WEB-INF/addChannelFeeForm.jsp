<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript" src="${pageContext.request.contextPath}addChannelFeeValidation.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/jquery-ui.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/jquery-ui.min.js"></script>

<script type="text/javascript">	
 
$(document.body).on('click', ".holidayDate",
		function() {

			var currYear = new Date().getFullYear();
			$(this).datepicker({
				changeMonth : true,
				changeYear : true,
				minDate : new Date(1900, 0, 1),
				dateFormat : 'yy-mm-dd'
			}).datepicker("show");
		});
</script>


<div class="wrapper">

	<div class="container">
		<form:form action="addChannelFee" method="post" commandName="feeBean"
			name="addFeeForm" id="addFeeForm" modelAttribute="feeBean">
			<div class="breadcrumb">System Configuration > Fee Profile Management > Add Fee Profile</div>
			<div class="heading">
				<i class="fa fa-plus-circle"></i> Add Channel Fee Plan
			</div>
			<div class="form">

				<div class="messages" style="display: ${display};" id="errorMsg">
					<c:if test="${not empty exception}">
						<div class="errors" style="display: ${display};">
							<c:out value="${exception}"></c:out>
						</div>
					</c:if>
					<c:if test="${not empty success}">
						<div class="success" style="display: ${display};">
							<c:out value="${success}"></c:out>
						</div>
					</c:if>
					<c:if test="${not empty error}">
						<div class="warnings" style="display: ${display};">
							<c:out value="${error}"></c:out>
						</div>
					</c:if>
				</div>
				

				<div class="form-group">
					<label class="title">Fee Profile Code <b>*</b></label>
					<form:input path="profileCode" id="profileCode"
						cssClass="form-control" maxlength="30" />
					<span class="error" id="profileCodeError"><form:errors
							path="profileCode"></form:errors> </span>
				</div>

				<div class="form-group">
					<label class="title">Fee Profile Description <b>*</b></label>
					<form:input path="profileDesc" id="profileDesc"
						cssClass="form-control" maxlength="30" />
					<span class="error" id="profileDescError"><form:errors
							path="profileDesc"></form:errors> </span>
				</div>

				<div class="form-group">
					<label class="title">From Date <b>*</b></label>
					<form:input type="text" path="fromDate" readonly="true"
						class="form-control holidayDate" id="fromDate" name="fromDate" />
					<span class="error" id="fromDateError"><form:errors
							path="fromDate"></form:errors> </span>
				</div>

				<div class="form-group">
					<label class="title">To Date <b>*</b></label>
					<form:input type="text" path="toDate" readonly="true"
						class="form-control holidayDate" id="toDate" name="toDate" />
					<span class="error" id="toDateError"><form:errors path="toDate"></form:errors></span>


				</div>
				

				<div class="clear"></div>
				
				<span id="show" style="color: red;"></span>

				<div id="parentFeeSlab">
				
				<input type="hidden" name="slab" id="slab">
				
				<input type="hidden" name="commission" id="commission">
				
				
								
				</div> <!-- END of parentFeeSlab -->
				<div class="clear"></div>
				
				<div class="btns">
					<button type="button" class="btn btn-default"
						id="addMoreFeePlanBtn">
						<i class="fa fa-plus-circle"></i> Add Fee Plan
					</button>
					<button type="button" class="btn btn-default" id="addFeePlanBtn">
						<i class="fa fa-chevron-circle-right"></i> Submit
					</button>
					<button type="reset" class="btn btn-default" id="resetBtn">
						<i class="fa fa-refresh"></i> Clear
					</button>
					<div class="clear"></div>
				</div>
			</div>
		</form:form>

	</div>

</div>

<select style="display:none;" id="hidPlatformMaster">
	<option value="0">---Select---</option>
	<c:forEach items="${platformList}" var="itr">
		<option value="${itr.lkpkey}">${itr.lkpvalue}</option>
	</c:forEach>
</select>

<select id="hidCommissionTypeMaster" style="display: none;">
	<option value="0">---Select---</option>
	<option value="3">Both</option>
	<option value="2">Fixed</option>
	<option value="1">Percentage</option>
	<%-- <form:option value="C">Confirm by Bank</form:option>	 --%>
</select>

<script>

	
	
	
	
</script>