<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	------Choose Your Preferences Below----- 
</h1>
    <form action="${pageContext.request.contextPath}/Offers" method="get" > 
  <input type="checkbox" name="Opt1" value="hotel" > Hotels<br>
  <p></p>
   <input type="checkbox" name="Opt2" value="vacation"> Vacation Plans<br>
  <input type="submit" value="Submit">
  </form>
  

</body>
</html>
