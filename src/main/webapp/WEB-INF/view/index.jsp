<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<%@include file="common.jsp" %>
<body>

<div class="table-responsive">
    <h1>请导入工资表</h1>
    <form class="form-horizontal" id="form_table" action="/import" enctype="multipart/form-data" method="post">
        <br/>
        <button type="submit" class="btn btn-primary">导入</button>
        <input class="form-input" type="file" name="filename"></input>
    </form>

</div>
</body>
</html>