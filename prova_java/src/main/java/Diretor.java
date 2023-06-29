
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Diretor extends CargoDeConfianca implements Contratacao{
    private final double PREMIO = 0.3;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    public double getSalarioBonificado(){
        return super.salario * PREMIO + super.getSalario();
    }
    
    public double getSalarioFinal(){
        return getSalarioBonificado() * bonificacao.getValor() + super.salario; 
    }
    
    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("\nDiretor admitiu Funcionario: " + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
         System.out.println("\nDiretor demitiu Funcionario: " + funcionario.toString());
    }
    
    
    @Override
    public String toString() {
        return "Diretor: " + 
                super.toString() +
                "\nPRÊMIO: " + PREMIO + '%' +
                "\nSalário Fianl: " + getSalarioFinal();
    }

    
    
    
    
}
