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
public class TesteVeiculo {
    public static void main(String[] args) {
        
        //Criação e instância do objeto Veículo
        Veiculo carro = new Veiculo ();
        
        //Contrução
        carro.marca = "Volkswagen";
        carro.modelo = "Fusquinha";
        carro.cor = 'B';
        carro.velocidade = 0;
        
        //Exibir Carro
        System.out.println("\n\n\n -- Meu carro parado");
        carro.exibirVeiculo();
        
        //acelerando o carro
        for (int i = 0; i < 120; i++)
        carro.velocidade();
        
        System.out.println("\n\n\n -- Meu carro andando");
        carro.exibirVeiculo();
        
        //desacelerando o carro
        for (int i = 120; i > 0; i--)
        carro.frear();
        
        System.out.println("\n\n\n -- Meu carro parado");
        carro.exibirVeiculo();
        
        
        
    }
    
}
