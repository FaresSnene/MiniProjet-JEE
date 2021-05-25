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
        <th>Nom</th>
        <th>Prenom</th>
        <th>CIN</th>
        <th>Date de Naissance</th>
        <th>Email</th>
        <th>Telephone</th>
        <th>Banque List</th>
        <th>Compte List</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${clients}" var="c">
        <tr>
            <td>${c.id}</td>
            <td>${c.nom}</td>
            <td>${c.prenom}</td>
            <td>${c.cin}</td>
            <td>${c.dateNaissance}</td>
            <td>${c.email}</td>
            <td>${c.telephone}</td>
            <td>${c.banqueList}</td>
            <td>${c.compteList}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>