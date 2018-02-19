<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>

</head>
<body>
<h1> Enter the User Information</h1>
        <form method="POST" action="/java/saveuser" modelAttribute="user">
       UserName<input type="text"  name="checkbox"> 
        Email<input type="text"  name="checkbox">
        ContactNumber<input type="text"  name="checkbox">
              <input type="submit" value="Submit">
        </form>
    </body>
</html>
</body>
</html>
