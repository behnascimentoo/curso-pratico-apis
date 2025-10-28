package org.example.beans;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.Arrays;
import java.util.List;

public class PopulandoPersonagens {
    public static List<PersonagemBean> ArrayPersonagens(String json){
        Gson gson = new Gson();
        JsonObject obj = JsonParser.parseString(json).getAsJsonObject();
        JsonArray results = obj.getAsJsonArray("results");
        // Converte esse array pro array de PersonagemBean
        PersonagemBean[] personagens = gson.fromJson(results, PersonagemBean[].class);
        return Arrays.asList(personagens);
    }


}
