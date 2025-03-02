package br.com.apiproduto.entity;

import jakarta.persistence.*;
import  lombok.Data;
import java.math.BigDecimal;

@Entity
@Data //Getters, Setters, toStrings, etc
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private BigDecimal valor;

    @Column
    private String descricao;
}
