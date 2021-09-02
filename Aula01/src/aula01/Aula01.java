/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

/**
 *
 * @author evandroarmando
 */
public class Aula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Pessoa pessoa = new Pessoa();
      
      pessoa.nome ="evandro";
      pessoa.idade =12;
      
      System.out.println(pessoa.nome+" sua idade é :"+pessoa.idade);
      
      System.out.println("----------------------------------------");
      
      Pessoa empregado = new Pessoa();
      empregado.setarCampos("Rui", 20);
      System.out.println(empregado.resultado());
      
        
        
    }
    
}
