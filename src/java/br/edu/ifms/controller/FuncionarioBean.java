/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.controller;

import br.edu.ifms.mapeamento.FuncionarioMapeamento;
import br.edu.ifms.model.FuncionarioModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danielly
 */
public class FuncionarioBean implements Serializable {
    private FuncionarioMapeamento fmape;
    private FuncionarioModel fmodel;
    private String msg;

    public FuncionarioBean(){
        this.fmape = new FuncionarioMapeamento();
        this.fmodel = new FuncionarioModel();
        this.listaDeFuncionarios = new ArrayList<>();
    }
    public void salvar(){
        try{
            fmodel.inserir(fmape);
            this.fmape = new FuncionarioMapeamento();
            this.msg = "Salvo com Sucesso!";
        }catch(Exception e){
            this.msg ="Erro"+e.getMessage();
        }
    }
    public void buscarTodos(){
        this.listaDeFuncionarios = fmodel.buscarTodos();
    }
    public FuncionarioMapeamento getFmape() {
        return fmape;
    }

    public void setFmape(FuncionarioMapeamento fmape) {
        this.fmape = fmape;
    }

    public FuncionarioModel getFmodel() {
        return fmodel;
    }

    public void setFmodel(FuncionarioModel fmodel) {
        this.fmodel = fmodel;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<FuncionarioMapeamento> getListaDeFuncionarios() {
        return listaDeFuncionarios;
    }

    public void setListaDeFuncionarios(List<FuncionarioMapeamento> listaDeFuncionarios) {
        this.listaDeFuncionarios = listaDeFuncionarios;
    }
    private List<FuncionarioMapeamento> listaDeFuncionarios;   
}
