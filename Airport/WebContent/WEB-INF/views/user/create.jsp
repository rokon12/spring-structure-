<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<h2>Create User</h2>
<br />
<br />


<form:form modelAttribute="user" action="create" method="post">
	<fieldset>
		<form:errors path="*" cssClass="errors" />
	</fieldset>

	<fieldset>
		<legend>Login</legend>
		<table>
			<tr>
				<th>User Name:</th>
				<td><form:input path="userName" /></td>
			</tr>
			<tr>
				<th>Password:</th>
				<td><form:password path="password" />
			</tr>

			<tr>
				<th>Confirm Password:</th>
				<td><form:password path="confirmPassword" />
			</tr>
			<tr>
				<th>Full Name:</th>
				<td><form:input path="fullName" /></td>

			</tr>

			<tr>
				<th>Telephone :</th>
				<td><form:input path="phoneNumber" /></td>

			</tr>
			<tr>
				<td colspan="1"><input type="submit" value="Log In" /></td>
			</tr>
		</table>
	</fieldset>
</form:form>