/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.mapeamento;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author Danielly
 */
@Entity
@Table (name ="funcao")
public class FuncaoMapeamento implements Serializable{
    @Id
    @GeneratedValue
    private long id; 
    private String descricao;
    @OneToMany(mappedBy="funcao", fetch = FetchType.LAZY)
    @Cascade(CascadeType.ALL)
    private Collection funcionarios;

    public Collection getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Collection funcionarios) {
        this.funcionarios = funcionarios;
    }

    public FuncaoMapeamento(long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public FuncaoMapeamento() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
