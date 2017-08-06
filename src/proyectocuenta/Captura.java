/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocuenta;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeffersond
 */
public class Captura {

    public static int demeInteger(String mensaje,String titulo){
        return Integer.parseInt(JOptionPane.showInputDialog(null, titulo, mensaje, JOptionPane.PLAIN_MESSAGE));

    }
    
   
    public static String demeCadena( String mensaje,String titulo){
        return JOptionPane.showInputDialog(null, titulo, mensaje, JOptionPane.PLAIN_MESSAGE);
    }
}
