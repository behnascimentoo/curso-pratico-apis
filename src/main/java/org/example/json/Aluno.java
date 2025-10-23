package org.example.json;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.sql.Timestamp;

public class Aluno{
    public String nome;
    private int idade;
    private Timestamp nascimento;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Fazendo um json na mão
    public String toJsonNaMao(){
        String json = "{" +
                "\"nome\":\"" + nome + "\", " +
                "\"idade\":\"" + this.idade + "\", " +
                "\"nascimento\":\"" + this.nascimento + "\"" + "}";
        return json;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNascimento(Timestamp nascimento) {
        this.nascimento = nascimento;
    }
}
