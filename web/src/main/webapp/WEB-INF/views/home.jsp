<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring-multimodule-project</title>
</head>
<body>
    <h2>Hello ${user.firstName}!</h2>
    <h3>Complete user data:</h3>
    <ul>
        <li>ID: ${user.id}</li>
        <li>Username: ${user.username}</li>
        <li>First name: ${user.firstName}</li>
        <li>Last name: ${user.lastName}</li>
        <li>Address: ${user.address}</li>
    </ul>
</body>
</html>