package Entidades;

import lombok.*;
@Getter
@Setter
public class Gato extends Animal {
    
    private boolean domesticado;
    public boolean isDomesticado(){
        return domesticado;
    }
    public void setDomesticado(boolean domesticado){
        this.domesticado = domesticado;
    }

     @Override
    public String alimentar() {
        return "Comer peixe";
    }

    @Override
    public String voar() {
        return "Voar de avião";
    }

    @Override
    public String latir() {
        return "Não late.";
    }

    @Override
    public String emitirSom() {
        return "miau!";
    }
    
    
    @Override
    public String apresentar() {
        
        return "Sou um Gato \n"
                + "Nome: " + getNome() + "\n"
                + "Cor: " + getCor() + "\n"
                + "Descrição: " + getDescricao() + "\n"
                + "Identificador: " + getIdentificador() + "\n"
                + "Sexo: " + getSexo() + "\n"
                + "Data de Nascimento: " + getDataNascimento() + "\n"
                + "Espécie: " + getEspecie().getDescricao() + "\n"
                + "Data da última consulta veterinária: " 
                + getDataUltimaConsultaVeterinaria() +"\n"
                + "Domesticado: " + domesticado ; 
        
        
    }
}