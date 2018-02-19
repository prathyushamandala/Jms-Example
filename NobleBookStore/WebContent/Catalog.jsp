<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>
table, th, td {
    border: 1px solid black;
}
</style>
</head>
<body>
<form name="catalog" method="post" action="CatalogDetailsSrv">



<table style="width:100%">
  <tr>
    <th>BookName</th>
    <th>Author</th> 
    <th>Price</th>
  </tr>
  <tr>
    <td><input type="checkbox" name="a1" value="Head First Java"><br>Head First Java, 2nd Edition</td>
    <td> KathySierra,BertBates	</td>
    <td>$100</td>
    
  </tr>
  <tr>
    <td><input type="checkbox" name="a1" value="A Beginner's Guide"><br>A Beginner's Guide, Sixth Edition</td>
    <td>Herbert Schildt</td>
    <td>$200</td>
  </tr>
  <tr>
    <td><input type="checkbox" name="a1" value="Thinking in Java"><br>Thinking in Java, 3rd Edition</td>
    <td>Prentice Hall</td>
    <td>$300</td>
    
  </tr>
  </table>
        <button id="add to cart">
          AddToCart
        </button>
        

</form>
</body>
</html>