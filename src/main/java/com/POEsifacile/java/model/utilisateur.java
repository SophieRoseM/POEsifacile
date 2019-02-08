package com.POEsifacile.java.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "utilisateur")


public class utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String pseudo;
    private String password;

@OneToMany(mappedBy = "utilisateur", fetch = FetchType.EAGER)
private List<historique> historiques;


    public utilisateur(long l, String format){}

    public utilisateur(){}

    public utilisateur(String pseudo, String password) {
        this.pseudo = pseudo;
        this.password = password;

    }

    public List<historique> getHistoriques() {
        return historiques;
    }

    public void setHistoriques(List<historique> historiques) {
        this.historiques = historiques;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "utilisateur{" +
                "id=" + id +
                ", pseudo='" + pseudo + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        utilisateur that = (utilisateur) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(pseudo, that.pseudo) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pseudo, password);
    }


}
