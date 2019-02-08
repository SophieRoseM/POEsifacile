package com.POEsifacile.java.model;


import java.util.Arrays;
import java.util.List;

public class IdentifiantScore {
    private String pseudo;
    private List<Integer> scores = Arrays.asList(0, 0, 0, 0, 0);

    public IdentifiantScore(String pseudo, List<Integer> scores) {
        this.pseudo = pseudo;
        this.scores = scores;
    }

    public IdentifiantScore() { }

    public List<Integer> getScores() {
        return scores;
    }

    public void setScores(List<Integer> scores) {
        this.scores = scores;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

}



