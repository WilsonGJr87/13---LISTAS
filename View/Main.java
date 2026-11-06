package View;

import Controller.*;
import Model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AlunoController ac = new AlunoController();
        ac.setAluno(new Aluno(10, " ALe", "ADS", 1));
        ac.setAluno(new Aluno(10, " São Paulo", "DSM", 6));
        ac.setAluno(new Aluno(10, " Jundiai", "MKT", 3));
        ac.setAluno(new Aluno(10, " Mark", "DSM", 2));

        System.out.println("============ Get (2) ============");
        System.out.println(ac.getAluno(2));
        System.out.println("========================");
        System.out.println(ac.mostrarAlunos());

        System.out.println("============ Get Index (2) ============");
        System.out.println(ac.pegarIndice(ac.getAluno(2)));

        System.out.println("============ Remover (2) ============");
        ac.removerAluno(2);
        System.out.println(ac.mostrarAlunos());

        System.out.println("============ Virar Semestre ============");
        ac.virarSemestre();
        System.out.println(ac.mostrarAlunos());

        System.out.println("============ Limpar ============");
        ac.limparLista();
        System.out.println(ac.mostrarAlunos());
        
    }
}