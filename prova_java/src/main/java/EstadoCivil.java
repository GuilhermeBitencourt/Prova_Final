/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public enum EstadoCivil {
    CASADO("Casado"),
    DIVORCIADO("Divorciado"),
    SOLTEIRO("Solteiro"),
    SEPARADO("Separado"),
    VIUVO("Viúvo");
    
    protected String texto;

    private EstadoCivil(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
    
    
}
