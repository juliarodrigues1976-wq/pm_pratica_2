/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pm_prova2_m;

import java.util.Scanner;

/**
 *
 * @author glbra
 */
public class PM_Prova2_M {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("1. Associar veículos a um aluguel\r\n" +
                        "2. Exibir todos os veículos cadastrados\r\n" +
                        "3. Exibir todos os alugueis cadastrados\r\n" +
                        "4. Exibir apenas veículos disponíveis\r\n" +
                        "5. Avaliar objetos que implementam a interface Avaliavel\r\n" +
                        "6. Realizar inspeção em veículos que implementam a interface Inspecionavel\r\n" +
                        "7. Remover veículos em manutenção do sistema");

        int opcaoMenu = teclado.nextInt();

        switch (teclado) {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            case 7:
                
                break;
        
            default:
                break;
        }
    
        teclado.close();
    }
    
}
