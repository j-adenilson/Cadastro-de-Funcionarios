package com.cadastro.Funcionarios;
import com.cadastro.Departamentos.DepartamentosModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String nome;
   private String email;
   private int idade;

   @ManyToOne //um funcionario tem um unico departamento
   @JoinColumn(name = "departamentos_id") //Foreing Key ou chave estrangeira
   private DepartamentosModel departamentos;

}
