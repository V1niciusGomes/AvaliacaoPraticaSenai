package com.senai.biblioteca.servlet;

import com.senai.biblioteca.model.Usuario;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class UsuarioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        Usuario u = new Usuario();
        u.setNome(req.getParameter("nome"));
        u.setEmail(req.getParameter("email"));
        u.setSenha(req.getParameter("senha"));

        if (!u.emailValido()) {
            resp.getWriter().write("Email invalido");
            return;
        }

        resp.getWriter().write("Usuario cadastrado com sucesso");
    }
}
