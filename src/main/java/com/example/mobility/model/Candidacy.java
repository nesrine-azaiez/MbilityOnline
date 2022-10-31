
package com.example.mobility.model;



import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table( name = "Candidacy")
public class Candidacy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idCandidacy;
    @Temporal(TemporalType.DATE)
    private Date dateOfCandidacy;

    private String status ;
    private String type ;
    private String annee ;
    private String programme ;

    private String nom ;
    private String prenom ;
    private String genre ;
    private String dateN ;
    private String nationality ;

    private String etablissementOrigine ;
    private String filiere ;
    private String niveau ;

    private String paiement ;
    private String cv;

    @ManyToOne
    @JsonIgnore
    private User usersW;



//madi


}
