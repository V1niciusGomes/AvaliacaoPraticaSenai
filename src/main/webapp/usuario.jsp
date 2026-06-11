<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Usuários</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-4">
    <h2>Cadastro de Usuário</h2>

    <form action="usuario" method="post" class="card p-3">
        <input class="form-control mb-2" name="nome" placeholder="Nome" required>
        <input class="form-control mb-2" name="email" placeholder="Email" required>
        <input class="form-control mb-2" name="senha" type="password" placeholder="Senha" required>
        <button class="btn btn-primary">Cadastrar</button>
    </form>
</div>
</body>
</html>
