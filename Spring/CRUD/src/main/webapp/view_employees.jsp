 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Salary</th><th>Job</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="e" items="${mylist}">   
   <tr>  
   <td>${e.id}</td>  
   <td>${e.name}</td>  
   <td>${e.salary}</td>  
   <td>${e.job}</td>  
   <td><a href="edit_employee/${e.id}">Edit</a></td>  
   <td><a href="delete_employee/${e.id}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="employee_form">Add New Employee</a>  