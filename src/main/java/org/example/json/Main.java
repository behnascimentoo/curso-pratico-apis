package org.example.json;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.PrintWriter;
import java.sql.Timestamp;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Brenda", 23);
        aluno.setNascimento(Timestamp.valueOf("2002-06-28 00:00:00"));

        System.out.println("feito na mao: " + aluno.toJsonNaMao());
        String jsonToJava = ConversonJSON.javaToJson(aluno);
        System.out.println("automatico: " + jsonToJava);

        String javaToJason = ConversonJSON.javaToJson(aluno);
        System.out.println(javaToJason);
    }


}
