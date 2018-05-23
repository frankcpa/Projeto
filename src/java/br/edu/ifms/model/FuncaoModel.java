/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.model;

import br.edu.ifms.mapeamento.FuncaoMapeamento;
import br.edu.ifms.util.Conexao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danielly
 */
public class FuncaoModel extends Conexao{
     public void inserir(FuncaoMapeamento funcaoMapeamento){
        super.inicializa();
        super.getSess().save(funcaoMapeamento);
        super.executar();
    }
    public List<FuncaoMapeamento> buscarTodos(){
       List<FuncaoMapeamento> listaDeFuncoes = new ArrayList<>();
       super.inicializa();
       listaDeFuncoes = super.getSess().createQuery("from FuncaoMapeamento").list();
       super.executar();
       return listaDeFuncoes;
    }
}
