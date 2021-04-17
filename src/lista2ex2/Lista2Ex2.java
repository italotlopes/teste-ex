/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2ex2;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Lista2Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracão de Variáveis
        Scanner input = new Scanner(System.in);
        int filhos, cont1 = 0, somafilhos = 0, mediafilhos = 0;
        double salario, mediasal = 0, somasalario = 0;

        //Entrada de Dados
        System.out.println("Informe seu salário: ");
        salario = input.nextDouble();

        while (salario >= 0) {
            System.out.println("Qntd de filhos: ");
            filhos = input.nextInt();
            cont1++;
            
            somafilhos = somafilhos + filhos;
            somasalario += salario;
            
            mediafilhos = (somafilhos) / cont1;
            mediasal = (somasalario) / cont1;

            System.out.println("Informe seu salário: ");
            salario = input.nextDouble();
        }
        
        System.out.printf("Média do salário da populacão: R$%.2f\n" , mediasal);
        System.out.println("Média do número de filhos: " + mediafilhos);

    }

}
