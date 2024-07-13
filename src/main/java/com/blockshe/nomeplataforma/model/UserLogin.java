package com.blockshe.nomeplataforma.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLogin {

    private Long idUser;

    private String email;

    private String senha;

    private String nome;

    private String token;

    private Date dataNascimento;
}
