package br.com.saltoleto.h2r2dbc.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("usuario")
@Data
public class User {

    @Id
    private Long id;
    private String name;
    private String email;

    @Column("isactive")
    private boolean isActive;

}
