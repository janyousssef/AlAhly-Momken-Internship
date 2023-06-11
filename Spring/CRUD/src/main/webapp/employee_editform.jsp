<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Edit Employee</h1>  
       <form:form method="POST"  action="/SpringMVC/edit_employee">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="id"  /></td>  
         </tr>   
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"  /></td>  
         </tr>    
         <tr>    
          <td>Salary :</td>    
          <td><form:input  path="salary" /></td>  
         </tr>   
         <tr>    
          <td>Job :</td>    
          <td><form:input path="Job" /></td>  
         </tr>   
           
         <tr>    
          <td> </td>    
          <td><input type="submit" /></td>    
         </tr>    
        </table>    
       </form:form>