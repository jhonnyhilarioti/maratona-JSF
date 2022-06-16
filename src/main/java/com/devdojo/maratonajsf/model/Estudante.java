package com.devdojo.maratonajsf.model;

import com.devdojo.maratonajsf.model.enuns.Turno;

import java.util.*;

import static java.util.Arrays.asList;

public class Estudante {
    private String nome = "Jhonny";
    private String sobrenome = "Hilário";
    private double nota1 = 20;
    private double nota2;
    private double nota3 = 10;
    private Turno turno = Turno.MATUTINO;
    private String[] nomesArray = {"Jhonny", "Hilário"};
    private List<String> nomesList = asList("Kamilla", "Ramos");
    private Set<String> nomesSet = new HashSet<>(asList("Leandro", "Hilário"));
    private Map<String, String> nomesMap = new HashMap<>();

    {
        nomesMap.put("Goku", "O mais forte");
        nomesMap.put("One Pice", "O mais longo");
        nomesMap.put("Naruto", "O com mais lenga lenga");

        /**
         * O for abaixo sereve para iterar sobre o MAP
         */
        for (Map.Entry<String, String> entry : nomesMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
}
