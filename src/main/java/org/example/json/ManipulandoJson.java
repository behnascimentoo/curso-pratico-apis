package org.example.json;

import java.sql.Timestamp;

public class ManipulandoJson {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Brenda");
        aluno.setIdade(22);
        aluno.setNascimento(Timestamp.valueOf("2002-06-28 00:00:00"));

        System.out.println(aluno.toJson());
    }


}
