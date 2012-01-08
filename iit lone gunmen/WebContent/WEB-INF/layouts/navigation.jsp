<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<ul>
	<li><a href="<c:url value="/app/home/index" />">Home</a></li>
	<li><a href="<c:url value="/app/home/about" />">About</a></li>
	<li>
		<%
			if (false) {
		%> <a href="<c:url value="#" />">Log In</a> <%
 	}
 %>
	</li>
</ul>
