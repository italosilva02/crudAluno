/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crudAluno.model;

/**
 *
 * @author italo
 */
public final class adress {
    
    private String logradouro;
    private String complemento;
    private String bairro; 
    private String numero;
    private String cep;
    private String uf;
    private String pontoReferencia;
    private String hello;
    
    public adress(){
        
    }
    
    public adress(String logradouro, String complemento, String bairro, String numero, String cep, String uf, String pontoReferencia){
        
        setLogradouro(logradouro);
        setComplemento(complemento);
        setBairro(bairro);
        setNumero(numero);
        setCep(cep);
        setUf(uf);
        setPontoReferencia(pontoReferencia);
    }
    
    public String getLogradouro(){
        return this.logradouro;
    }
    
    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }
    
    public String getComplemento(){
        return this.complemento;
    }
    
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
    
    public String getBairro(){
        return this.bairro;
    }
    
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public String getCep(){
        return this.cep;
    }
    
    public void setCep(String cep){
        this.cep = cep;
    }
    
    public String getUf(){
        return this.uf;
    }

    public void setUf(String uf){
        this.uf = uf;
    }
    
    public String getPontoReferencia(){
        return this.pontoReferencia;
    }
    
    public void setPontoReferencia(String pontoReferencia){
        this.pontoReferencia = pontoReferencia;
    }
    
    
}
