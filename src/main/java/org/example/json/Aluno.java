package org.example.json;

import java.sql.Timestamp;

public class Aluno{
    private String nome;
    private int idade;
    private Timestamp nascimento;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNascimento(Timestamp nascimento) {
        this.nascimento = nascimento;
    }

    public String toJson(){
        String json = "{nome:'"+this.nome+"', idade:'"+this.idade+"', nascimento:'"+this.nascimento+"' ";
        return json;
    }
}
