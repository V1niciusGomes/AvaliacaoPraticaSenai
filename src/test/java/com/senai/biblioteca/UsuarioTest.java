
package com.senai.biblioteca;

import static org.junit.Assert.*;
import org.junit.Test;
import com.senai.biblioteca.model.Usuario;

public class UsuarioTest {
    @Test
    public void testaEmail(){
        Usuario u = new Usuario();
        u.setEmail("teste@email.com");
        assertTrue(u.emailValido());
    }
}
