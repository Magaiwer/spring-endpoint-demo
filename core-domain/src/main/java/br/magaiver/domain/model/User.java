package br.magaiver.domain.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Magaiver Santos
 */
@Entity
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String email;


}
