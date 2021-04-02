/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author jwict
 */
public class Veiculo {
    String marca;
    String modelo;
    char cor;
    int velocidade;
    
    public void velocidade (){
    
    velocidade++;
    
    
    }
    
    public void frear () {
    
    velocidade--;
    
  }
    
    public void exibirVeiculo() {
       
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.printf("Velocidade: %dkm/h \n\n", velocidade);
    }
 
}
