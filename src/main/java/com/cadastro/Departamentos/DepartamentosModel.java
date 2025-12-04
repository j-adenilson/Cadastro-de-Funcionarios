package com.cadastro.Departamentos;

import com.cadastro.Funcionarios.FuncionarioModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_departamentos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class DepartamentosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeDoDepartamento;

    @OneToMany(mappedBy = "departamentos") //um departamento pode ter muitos funcionarios
    private List<FuncionarioModel> funcionarios;


}
