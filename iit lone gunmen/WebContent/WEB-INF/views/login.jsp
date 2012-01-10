<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form modelAttribute="user" action="login" method="post">
	<form:errors path="*" cssClass="errors" />
	<fieldset>
		<div class="label">Username:   </div>
			
		<div class="input">
			<form:input path="username" />
		</div>
		
		<div class="label">Password:   </div>
			
		<div class="input">
			<form:password path="password" />
		</div>
	</fieldset>
	<div id="buttonGroup">
		<input type="submit" value="Log In" />
	</div>
</form:form>