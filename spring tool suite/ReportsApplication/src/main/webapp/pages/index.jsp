<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h3 class="pb-3 pt-3 text-center">Report Application</h3>
    <form:form action="search" modelAttribute="search" method="POST" class="row g-3">
        <div class="col-md-4">
            <label for="planName" class="form-label">Plan Name:</label>
            <form:select path="planName" class="form-select">
                <form:option value="">--Select--</form:option>
                <form:options items="${names}" />
            </form:select>
        </div>
        <div class="col-md-4">
            <label for="planStatus" class="form-label">Plan Status:</label>
            <form:select path="planStatus" class="form-select">
                <form:option value="">--Select--</form:option>
                <form:options items="${status}" />
            </form:select>
        </div>
        <div class="col-md-4">
            <label for="gender" class="form-label">Gender:</label>
            <form:select path="gender" class="form-select">
                <form:option value="">--Select--</form:option>
                <form:option value="Male">Male</form:option>
                <form:option value="Female">Female</form:option>
            </form:select>
        </div>
        <div class="col-md-4">
            <label for="startDate" class="form-label">Start Date:</label>
            <form:input type="date" path="startDate" class="form-control" />
        </div>
        <div class="col-md-4">
            <label for="endDate" class="form-label">End Date:</label>
            <form:input type="date" path="endDate" class="form-control" />
        </div>
        <div class="col-12">
            <td><a href="/" class="btn btn-secondary">Reset</a></td>
            <button type="submit" class="btn btn-primary">Search</button>
        </div>
    </form:form>
    <hr />
    <table class="table table-striped">
        <thead>
            <tr>
                <th>SR. NO.</th>
                <th>Holder Name</th>
                <th>Gender</th>
                <th>Plan Name</th>
                <th>Plan Status</th>
                <th>Start Date</th>
                <th>End Date</th>
                <th>Benefit Amount</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${plans}" var="plan" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${plan.citizenName}</td>
                    <td>${plan.gender}</td>
                    <td>${plan.planName}</td>
                    <td>${plan.planStatus}</td>
                    <td>${plan.planStartDate}</td>
                    <td>${plan.planEndDate}</td>
                    <td>${plan.benefitAmt}</td>
                </tr>
            </c:forEach>
            <c:if test="${empty plans}">
                <tr>
                    <td colspan="8" class="text-center">No Records Found !!!</td>
                </tr>
            </c:if>
        </tbody>
    </table>
    <hr />
    <div>
        Export: <a href="excel">Excel</a> 
    </div>
    <div>
        Export: <a href="pdf">Pdf</a> 
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
