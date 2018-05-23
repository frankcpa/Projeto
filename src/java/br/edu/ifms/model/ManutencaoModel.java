/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.model;
import br.edu.ifms.mapeamento.ManutencaoMapeamento;
import br.edu.ifms.util.Conexao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danielly
 */
public class ManutencaoModel extends Conexao{
     public void inserir(ManutencaoMapeamento manutencaoMapeamento){
        super.inicializa();
        super.getSess().save(manutencaoMapeamento);
        super.executar();
    }
    public List<ManutencaoMapeamento> buscarTodos(){
       List<ManutencaoMapeamento> listaDeManutencoes = new ArrayList<>();
       super.inicializa();
       listaDeManutencoes = super.getSess().createQuery("from ManutencaoMapeamento").list();
       super.executar();
       return listaDeManutencoes;
    }
}
