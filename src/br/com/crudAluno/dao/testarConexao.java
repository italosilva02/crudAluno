/**
 *
 * @author italo
 */



package br.com.crudAluno.dao;

import br.com.crudAluno.connections.conexaoMySQL;
import javax.swing.JOptionPane;


public class testarConexao {
    public static void main(String[] args) {
        conexaoMySQL c = new conexaoMySQL();
        conexaoMySQL c2 =new conexaoMySQL("https://bd.teste.com.br", "BdTeste", "Pica Pau", "242424");
        
        c.setServidor("192.168.1.1");
        c.setNomeDoBanco("BdAulaEstacio20212Q");
        c.setUsuario("root");
        c.setSenha("1234");
        
        JOptionPane.showMessageDialog(null, "Servidor: " + c.getServidor() + "\n" + "Nome do Banco: " + c.getNomeDoBanco() + "\n" + "Usuário: " + c.getUsuario()
                                            + "\n" + "Senha: " + c.getSenha());
        
        JOptionPane.showMessageDialog(null, "Servidor: " + c2.getServidor() + "\n" + "Nome do Banco: " + c2.getNomeDoBanco() + "\n" + "Usuário: " + c2.getUsuario()
                                            + "\n" + "Senha: " + c2.getSenha());
        
    }
}
