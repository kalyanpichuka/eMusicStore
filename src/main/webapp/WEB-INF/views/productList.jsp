<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Product List</title>
</head>
<body>
<table>
	 <thead>
	 	<tr>
		 	<th>Product Name</th>
		 	<th>Category</th>
		 	<th>Condition</th>
		 	<th>Price</th>
		</tr> 	
	 </thead>
	 <tr>
	 	<td>${product.productName}</td>
	 	<td>${product.productCategory}</td>
	 	<td>${product.productCondition}</td>
	 	<td>${product.productPrice}</td>
	 </tr>
</table>
</body>
</html>