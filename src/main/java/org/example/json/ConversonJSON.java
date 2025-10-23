package org.example.json;

import com.google.gson.Gson;

public class ConversonJSON {
    // Manipulando json

    //Json -> Java
    public static Aluno jsonToJava(String json){
        Gson gson = new Gson();
        Aluno aluno = gson.fromJson(json, Aluno.class);
        return aluno;
    }

    //Java -> Json
    public static String javaToJson(Aluno aluno) {
        Gson gson = new Gson();
        String estudante = gson.toJson(aluno);
        return estudante;
    }
}
