<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Biblioteca Digital</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="style.css">
</head>
<body>
<nav class="navbar navbar-dark bg-dark">
  <div class="container-fluid">
    <span class="navbar-brand">Biblioteca Digital</span>
  </div>
</nav>

<div class="container mt-4">
    <div class="row">
        <div class="col-md-4">
            <div class="card p-3">
                <h4>Usuários</h4>
                <a class="btn btn-primary" href="usuario.jsp">Gerenciar</a>
            </div>
        </div>

        <div class="col-md-4">
            <div class="card p-3">
                <h4>Livros</h4>
                <a class="btn btn-success" href="livro.jsp">Gerenciar</a>
            </div>
        </div>

        <div class="col-md-4">
            <div class="card p-3">
                <h4>Empréstimos</h4>
                <a class="btn btn-warning" href="emprestimo.jsp">Gerenciar</a>
            </div>
        </div>
    </div>
</div>

</body>
</html>
