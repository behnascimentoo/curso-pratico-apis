package org.example.beans;

import java.util.List;

import static org.example.beans.Request.requestAPI;

public class Main {
    public static void main(String[] args) {
        List<PersonagemBean> personagens = null;
        try {
            personagens = PopulandoPersonagens.ArrayPersonagens(requestAPI());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        for (PersonagemBean p : personagens) {
            System.out.println(p);
        }
    }
}
