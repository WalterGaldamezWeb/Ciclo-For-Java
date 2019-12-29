/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicloforjava;

/**
 *
 * @author Walter Galdamez
 */
public class CicloForJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limite=10;
        int num=5;

        for(int contador=1;contador<=limite;contador++){
            System.out.println("- "+num+"x"+contador+"="+(num*contador));
        }
    }
    
}
