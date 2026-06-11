package com.senai.biblioteca.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Emprestimo {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Livro livro;

    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;
    private LocalDate dataDevolucaoReal;

    public void calcular() {
        this.dataDevolucaoPrevista = dataEmprestimo.plusDays(10);
    }

    public double multa() {
        if (dataDevolucaoReal != null && dataDevolucaoReal.isAfter(dataDevolucaoPrevista)) {
            return 10.0;
        }
        return 0.0;
    }
}
