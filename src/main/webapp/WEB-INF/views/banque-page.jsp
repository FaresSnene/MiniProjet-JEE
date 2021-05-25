<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
    <title>All Banques</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
          integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>

<body>

<table class="table table-striped">
    <thead>
    <tr>
        <th>ID</th>
        <th>Code</th>
        <th>Adresse</th>
        <th>Nb Agences</th>
        <th>Client List</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${banques}" var="c">
        <tr>
            <td>${c.id}</td>
            <td>${c.code}</td>
            <td>${c.adresse}</td>
            <td>${c.nb_agences}</td>
            <td>${c.clientList}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>