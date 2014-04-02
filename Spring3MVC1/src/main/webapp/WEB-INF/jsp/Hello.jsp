<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"> </script>
<script>
$(document).ready(function () {
	$(".defaultClassWrapperDiv").mouseenter(function () {
		$(this).addClass('selectDivHeader');
		$(this).removeClass('unselectDivHeader');
		
		});
	$(".defaultClassWrapperDiv").mouseleave(function () {
		$(this).addClass('unselectDivHeader');
		$(this).removeClass('selectDivHeader');
		
		});
	
});

</script>
<style type="text/css">

.defaultClassButtonDiv
{
float: right;
}

input[type=button]
{
padding:5px 15px; background:#637BAD; font-family: "Tahoma"; font-weight: bold;
color: white; border:0 none; cursor:pointer;
-webkit-border-radius: 5px; border-radius: 5px;
}
.defaultClassWrapperDiv
{
font-family: Tahoma;
font-size: 1em;
font-weight: bold;
height: 60px;
padding: 10px;
}
.selectDivHeader
{
background-color: #ECEFF6;

}
.unselectDivHeader
{
background-color: #FFFFFF;
}
</style>
<title>Hello World</title>
</head>
<body>

EJB Example with a Remote Stateless SessionBean:

 <h1>Message : ${message}</h1>	
		
<c:forEach var="listVar" items="${success}">
    <div class="defaultClassWrapperDiv">
    	<c:out value="${listVar.categoryMasterNames}"/>
    	<div class="defaultClassButtonDiv"> 
			<input type="button" value="Add To Order" />
		</div>
    </div>
    </br>
   
</c:forEach>
${size}

</body>
</html>