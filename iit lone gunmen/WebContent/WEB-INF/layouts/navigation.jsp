<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<ul>
	<li><a href="<c:url value="/app/home/index" />">Home</a></li>
	<li><a href="<c:url value="/app/home/about" />">About</a></li>
	<li>
		<%
			if (true) {
		%> <a href="<c:url value="/app/login/go" />">Log In</a> <%
 	}
 %>
	</li>
</ul>
