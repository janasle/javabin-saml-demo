<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
<title>Nettbank</title>
</head>
<body>
    <sec:authorize ifAnyGranted="ROLE_USER">
        <sec:authentication var="user" property="principal" />
        <h1>Forsikring</h1>
        <h2>Mine Sider</h2>
            Your are logged in as user ${user}
    </sec:authorize>
    <sec:authorize ifNotGranted="ROLE_USER">
        You are not authorized to view this page.
    </sec:authorize>
</body>
</html>
