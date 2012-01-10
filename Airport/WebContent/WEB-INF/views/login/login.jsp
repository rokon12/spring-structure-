<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<h2>Log in</h2>
<br />
<br />


<form:form modelAttribute="loginCommand" action="login" method="post">
	<fieldset>
		<legend>Login</legend>
		<table>
			<tr>
				<th>User Name:</th>
				<td><form:input path="userName" /></td>
				<td><form:errors path="userName" cssClass="errors" /></td>
			</tr>
			<tr>
				<th>Password:</th>
				<td><form:password path="password" />
				<td><form:errors path="password" cssClass="errors" /></td>
			</tr>
			
			<tr>
				<td colspan="1"><input type="submit" value="Log In" /></td>
			</tr>
		</table>
	</fieldset>
</form:form>