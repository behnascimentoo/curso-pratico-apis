package org.example.beans;

public class PersonagemBean {
    private String name;
    private String status;
    private String species;
    private String gender;

    public PersonagemBean() {
    }

    // Getters e Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    //to string
    @Override
    public String toString() {
        return "PersonagemBean{" +
                "nome='" + name + '\'' +
                ", status='" + status + '\'' +
                ", especie='" + species + '\'' +
                ", genero='" + gender + '\'' +
                '}';
    }
}
