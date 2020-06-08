package com.social.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Benevol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id_ben;
    @Column(unique = true)
    private  String login;
    private  String mdp;
    private  String adresse;
    private  String nom;
    private  int tel;
    private  int deconnecte ;
    private  int notification;
    private int Points;
    private int nb_pub;
    private String img;


    //public Benevol(){};

   /* public Benevol(int id_ben, String login, String mdp,  String adresse,  String nom,  int tel) {
        this.id_ben = id_ben;
        this.login = login;
        this.mdp = mdp;
        this.adresse = adresse;
        this.nom = nom;
        this.tel = tel;

    }*/

    public String getMdp() {
        return mdp;
    }

    public String getLogin() {
        return login;
    }

    public int getId_ben() {
        return id_ben;
    }


    public String getAdresse() {
        return adresse;
    }

    public String getNom() {
        return nom;
    }

    public int getTel() {
        return tel;
    }

    public void setId_ben(int id_ben) {
        this.id_ben = id_ben;
    }

    public int getNotification() {
        return notification;
    }

    public void setNotification(int notification) {
        this.notification = notification;
    }

    public int getDeconnecte() {
        return deconnecte;
    }

    public void setDeconnecte(int deconnecte) {
        this.deconnecte = deconnecte;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTel(int tel) {
        tel = tel;
    }

    @Override
    public String toString() {
        return "Benevol{" +
                "id_ben=" + id_ben +
                ", login='" + login + '\'' +
                ", mdp='" + mdp + '\'' +
                ", adresse='" + adresse + '\'' +
                ", nom='" + nom + '\'' +
                ", tel=" + tel +
                ", deconnecte=" + deconnecte +
                ", notification=" + notification +
                '}';
    }
}
