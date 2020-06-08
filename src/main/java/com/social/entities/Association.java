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
public class    Association {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private int id_asso ;
    @Column(unique = true)
    private  String login;
    private  String mdp;
    private  String Adresse;
    private  String nom;
    private  String Description;
    private  String email;
    private  int Tel;
    private  int Fax;


}
