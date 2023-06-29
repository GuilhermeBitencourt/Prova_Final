/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public enum Bonificacao {
    GERENTE  (0.15),
    DIRETOR  (0.25);
    
    protected double valor;

    private Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "\nBonificacao: " + 
                "Valor: " + valor;
    }
    
  
    
    
    
}
