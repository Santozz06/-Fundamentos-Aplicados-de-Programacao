/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Controller;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author santos
 */
public class Controller {

    JTextField jTextFieldTimeA;
    JTextField jTextFieldTimeB;
    JTextArea jTextAreaSaida;
    JButton jButtonVencedor;

    public Controller(JTextField jTextFieldTimeA, JTextField jTextFieldTimeB, JTextArea jTextAreaSaida, JButton jButtonVencedor) {
        this.jTextFieldTimeA = jTextFieldTimeA;
        this.jTextFieldTimeB = jTextFieldTimeB;
        this.jTextAreaSaida = jTextAreaSaida;
        this.jButtonVencedor = jButtonVencedor;
    }
    
    public void processarClique(){
        if (jButtonVencedor.getText().equals("Limpar")){
            limpar();
        } else {
            vencedor();
        }   
    }
    public void vencedor() {
        int timeA = Integer.parseInt(jTextFieldTimeA.getText());
        int timeB = Integer.parseInt(jTextFieldTimeB.getText());

        if (timeA > timeB) {
            jTextAreaSaida.setText("O time A ganhou");
        } else if (timeB > timeA) {
            jTextAreaSaida.setText("O time B ganhou");
        } else {
            jTextAreaSaida.setText("O jogo terminou empatado");
        }
        jButtonVencedor.setText("Limpar");
    }

    public void limpar(){
        jTextFieldTimeA.setText("");
        jTextFieldTimeB.setText("");
        jTextAreaSaida.setText("");
        jButtonVencedor.setText("Vencedor");
    }

}
