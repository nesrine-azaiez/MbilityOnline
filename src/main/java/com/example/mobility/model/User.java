package com.example.mobility.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString


public class User implements Serializable {
    private static final long serialVersionUID = 65981149772133526L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long id;

    private String firstName;
    private String lastName;
}

