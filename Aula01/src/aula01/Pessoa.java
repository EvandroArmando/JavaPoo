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
public class Pessoa implements ControladorPessoa {
    
    public String nome;
    public  int idade;


public String getNome(){
    
    return this.nome;
} 


public void setNome(String nomes){
   this.nome = nomes;
}
  

public void setIdade(int  ano){
  
    this.idade = ano;
   
    
}
    
 
public int getIdade (){
    
  return this.idade; 
    
}
    
    
    
    
    
    
    @Override
    public String resultado() {
        
    return "Pessoa{" + "nome=" + this.getNome() + ", idade=" + this.getIdade() + '}';

    }

    @Override
    public void setarCampos(String nome, int idade) {
        
        this.setNome(nome);
        this.setIdade(idade);
    }
    
    
    
    
}
