package com.social.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.context.annotation.Scope;

import javax.persistence.*;
import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@ToString

public class Publication {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long id_benevol;
    private String ville ;
    private String titre;
    private  String type;
    private String img;
    private  String description;
    private  String etat ;
    private int evaluation ;
    private long id_association;
    private Date date;



}
