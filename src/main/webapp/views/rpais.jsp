<!DOCTYPE html5>
<html>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table style="width:100%">
  
<c:forEach items="${usuarios}" var="a">
 <tr>
 <td>${a.nome}</td>
 <td>${a.cidade}</td>
 <td>${a.estado}</td>
 <td>${a.pais}</td>
 <td>${a.birth_date}</td>
 <td>${a.civil}</td>
 <td>${a.sexo}</td>
 <td>${a.profissao}</td>
  </tr>
</c:forEach>
  
</table>


</body>
</html>