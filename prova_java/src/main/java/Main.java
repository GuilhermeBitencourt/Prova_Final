
import java.time.LocalDate;
import java.time.Month;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Guilherme", "123.456.789.99", "15.123.456.78", 
                new Endereco("Rua 3 de almeida", "15", "Casa", "40750-123", "Salvador", UnidadeFederativa.BAHIA), Setor.OPERACOES, Genero.MASCULINO, 2000, EstadoCivil.CASADO, LocalDate.of(2000, Month.JANUARY, 15));
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Isabele", "123.456.789.99", "15.456.789.12", 
                new Endereco("Rua das pedrinhas", "3", "Apartamento", "40750-123", "Salvador", UnidadeFederativa.BAHIA), Setor.JURIDICO, Genero.FEMININO, 5000, EstadoCivil.CASADO, LocalDate.of(1999, Month.JULY, 17));
        Engenheiro engenheiro = new Engenheiro("12.456", "Paulo", "213.456.789", "15.123.456.21", 
                new Endereco("Rua 4 de Setembro", "12", "Casa", "40750-123", "São Paulo", UnidadeFederativa.SAO_PAULO), Setor.ENGENHEIRO, Genero.MASCULINO, 3000, EstadoCivil.SOLTEIRO, LocalDate.of(2002, Month.FEBRUARY, 5));
        Motoboy motoboy = new Motoboy("12.456", "Carlos", "213.456.119", "11.111.456.21", 
                new Endereco("Rua 100 de Setembro", "3", "Casa", "41111-123", "São Paulo", UnidadeFederativa.SAO_PAULO), Setor.OPERACOES, Genero.MASCULINO, 1000, EstadoCivil.SOLTEIRO, LocalDate.of(1981, Month.NOVEMBER, 5));
        
        
        //System.out.println(engenheiro.toString());
        System.out.println("");
        //System.out.println(gerente.toString());
        System.out.println("");
        System.out.println(diretor.toString());
        System.out.println("");
        //System.out.println(motoboy.toString());
        
        diretor.admitir(engenheiro);
        diretor.admitir(gerente);
        diretor.admitir(motoboy);
        diretor.demitir(engenheiro);
        diretor.demitir(gerente);
        diretor.demitir(motoboy);
    }
}
