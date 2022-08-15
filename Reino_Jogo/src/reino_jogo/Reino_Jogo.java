/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reino_jogo;

import javax.swing.JOptionPane;

/**
 *
 * @author Tarcyo
 */
public class Reino_Jogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Regras:\n Mantenha os poderes equibrados e tente governar pelo maior tempo \n não deixe chegar a 0 e nem a 100;");
        Tela tela =new Tela();
        tela.setVisible(true);
    }
    
}
