package com.blockshe.nomeplataforma.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="user")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data //Cria getters and setters
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AutoIncrement
    private Long idUser;

    @NotNull(message = "O email é obrigatório.")
    @Email
    private String email;

    @NotNull
    @Size(min = 4, max = 50)
    private String senha;

    @NotNull
    @Size(min = 3, max = 100)
    private String nome;

    @NotNull
    private Date dataNascimento;

    @NotNull
    private Perfil perfil;


}
