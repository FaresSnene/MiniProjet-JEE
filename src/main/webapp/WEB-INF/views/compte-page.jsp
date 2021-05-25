<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
    <title>All Clients</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
          integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>

<body>

<table class="table table-striped">
    <thead>
    <tr>
        <th>ID</th>
        <th>Num Compte</th>
        <th>Date de Creation</th>
        <th>Type de Compte</th>
        <th>Solde</th>
        <th>Client</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${comptes}" var="c">
        <tr>
            <td>${c.id}</td>
            <td>${c.numCompte}</td>
            <td>${c.dateCreation}</td>
            <td>${c.typeCompte}</td>
            <td>${c.solde}</td>
            <td>${c.client}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>