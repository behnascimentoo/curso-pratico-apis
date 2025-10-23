package org.example;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    // Consumindo uma api
    public static void main(String[] args) throws Exception{
        HttpClient client = HttpClient.newHttpClient(); // cria o cliente HTTP
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://rickandmortyapi.com/api/character"))
                .build(); // cria a requisição GET

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        //System.out.println(response.body()); // imprime o JSON recebido


        // PEGANDO O JSON DA API
        String json = response.body();
        JsonObject obj = JsonParser.parseString(json).getAsJsonObject();

        // Pegando o array "results"
        JsonArray results = obj.getAsJsonArray("results");

        // Pega o primeiro personagem do array (pra n precisar fazer um for)
        JsonObject primeiroPersonagem = results.get(10).getAsJsonObject();

        System.out.println("Nome: " + primeiroPersonagem.get("name").getAsString());
        System.out.println("Especie: " + primeiroPersonagem.get("species").getAsString());
        System.out.println("Status: " + primeiroPersonagem.get("status").getAsString());

    }
}