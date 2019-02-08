package com.POEsifacile.java.model;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table (name = "historique")

public class historique {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_sauvegarde;
    private Integer salle;
    private Integer score;


@ManyToOne
@JoinColumn(name = "id_joueur")
private utilisateur utilisateur;

    public historique(){}

    public historique(Integer salle, Integer score, com.POEsifacile.java.model.utilisateur utilisateur) {
        this.salle = salle;
        this.score = score;
        this.utilisateur = utilisateur;
    }

    public Integer getId_sauvegarde() {
        return id_sauvegarde;
    }

    public void setId_sauvegarde(Integer id_sauvegarde) {
        this.id_sauvegarde = id_sauvegarde;
    }

    public Integer getSalle() {
        return salle;
    }

    public void setSalle(Integer salle) {
        this.salle = salle;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        historique that = (historique) o;
        return Objects.equals(id_sauvegarde, that.id_sauvegarde) &&
                Objects.equals(salle, that.salle) &&
                Objects.equals(score, that.score) &&
                Objects.equals(utilisateur, that.utilisateur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id_sauvegarde, salle, score, utilisateur);
    }

    @Override
    public String toString() {
        return "historique{" +
                "id_sauvegarde=" + id_sauvegarde +
                ", salle='" + salle + '\'' +
                ", score=" + score +
                ", utilisateur=" + utilisateur +
                '}';
    }
}
