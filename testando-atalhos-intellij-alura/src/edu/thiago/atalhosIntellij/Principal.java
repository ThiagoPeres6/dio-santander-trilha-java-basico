package edu.thiago.atalhosIntellij;

import edu.thiago.atalhosIntellij.model.Funcionario;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {

        Funcionario thiago = new Funcionario("Thiago", 1, LocalDate.of(1993, 10, 13));

        System.out.println(thiago);

    }

}
