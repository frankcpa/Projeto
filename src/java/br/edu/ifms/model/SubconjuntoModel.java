/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.model;
import br.edu.ifms.mapeamento.SubconjuntoMapeamento;
import br.edu.ifms.util.Conexao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danielly
 */
public class SubconjuntoModel extends Conexao{
     public void inserir(SubconjuntoMapeamento subconjuntoMapeamento){
        super.inicializa();
        super.getSess().save(subconjuntoMapeamento);
        super.executar();
    }
    public List<SubconjuntoMapeamento> buscarTodos(){
       List<SubconjuntoMapeamento> listaDeSubconjuntos = new ArrayList<>();
       super.inicializa();
       listaDeSubconjuntos = super.getSess().createQuery("from SubconjuntoMapeamento").list();
       super.executar();
       return listaDeSubconjuntos;
    }
}
