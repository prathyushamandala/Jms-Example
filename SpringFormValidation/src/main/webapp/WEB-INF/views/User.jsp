<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ page session="false" %>
<html>
<head>

</head>
<body>
<h1> Enter the User Information</h1>
        <form:form method="POST" action="/java/saveuser" modelAttribute="user">
       Hotel:<form:checkbox value ="hotel" path = "username" />
       Vacation:<form:checkbox value ="vacations" path = "Email" />
        ContactNumber<input type="text"  name="checkbox">
              <input type="submit" value="Submit">
        </form:form>
    </body>
</html>
</body>
</html>
