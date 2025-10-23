package org.example.graphql;

import com.google.gson.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        // JSON da requisição GraphQL
        String query = """
                {
                "query": "{ characters(page: 1) { results { name species status gender} } }"
        }
        """;

        // Criar cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        // Criar requisição POST
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://rickandmortyapi.com/graphql"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(query))
                .build();

        // Enviar e receber resposta
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        // Transformar a resposta em objeto JSON
        JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();

        // Acessar o array de resultados
        JsonArray results = jsonResponse
                .getAsJsonObject("data")
                .getAsJsonObject("characters")
                .getAsJsonArray("results");

        System.out.println("Pesonagens com status alive");
        // Percorrer e filtrar
        for (JsonElement element : results) {
            JsonObject character = element.getAsJsonObject();
            String status = character.get("status").getAsString();

            if(status.equalsIgnoreCase("Alive")){
                System.out.println("Nome: " + character.get("name").getAsString());
                System.out.println("Espécie: " + character.get("species").getAsString());
                System.out.println("Status: " + status);

            }
        }
    }
}
