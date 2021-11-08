
package br.com.crudAluno.model;


public class Aluno {
    private int codigo; 
    private String nome;
    private String sobrenome;
    private String cpf;
    
    public Aluno(){
        
    }
    
    public Aluno(int codigo, String nome, String sobrenome, String cpf){
       setCodigo(codigo);
       setNome(nome);
       setSobrenome(sobrenome);
       setCpf(cpf);
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public void setCodigo (int codigo){
        this.codigo = codigo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getSobrenome(){
        return this.sobrenome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    
}
