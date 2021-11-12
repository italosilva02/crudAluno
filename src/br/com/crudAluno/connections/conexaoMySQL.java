
package br.com.crudAluno.connections;

import java.sql.Connection;

/**
 *
 * @author italo
 */
public class conexaoMySQL {
    
    private Connection c = null;
    
    private String servidor = "";
    private String nomeDoBanco = "";
    private String usuario = "";
    private String senha = "";
    
    public conexaoMySQL (){
        
    }
    
     public conexaoMySQL (String servidor, String nomeDoBanco, String usuario, String senha){
        setServidor(servidor);
        setNomeDoBanco(nomeDoBanco);
        setUsuario(usuario);
        setSenha(senha);
    }
    
    public String getServidor(){
        return this.servidor;
    }
    
    
    public void setServidor(String servidor){
        this.servidor = servidor;
    }
    
    public String getNomeDoBanco(){
        return this.nomeDoBanco;
    }
    
    public void setNomeDoBanco(String nomeDoBanco){
        this.nomeDoBanco = nomeDoBanco;
    }
    
    public String getUsuario(){
        return this.usuario;
    }
    
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
    public String getSenha(){
        return this.senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public Connection getC(){
        return this.c;
    }
    
    public void setC(Connection c){
        this.c = c;
    }
    
    public Connection conectar(){
        try{
            
        } catch(Exception e) {
            
        }
        
        return getC();
    }
    
    public void desconectar(){
        
    }
}
