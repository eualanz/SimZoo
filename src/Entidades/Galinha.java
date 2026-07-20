package Entidades;

import lombok.*;
@Getter
@Setter
public class Galinha extends Animal {
    
      private boolean eDeGranja;
    public boolean isEDeGranja(){
        return eDeGranja;
    }
    public void setEDeGranja(boolean eDeGranja){
        this.eDeGranja = eDeGranja;
    }

    @Override
    public String alimentar() {
        return "Comer milho!";
    }
     @Override
    public String emitirSomMiau() {
        return "Não emite som miau";
    }
     @Override
    public String andar() {
        return "Anda sob duas patas";
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
    public String apresentar() {
        
        return "Sou uma Girafa \n"
                + "Nome: " + getNome() + "\n"
                + "Cor: " + getCor() + "\n"
                + "Descrição: " + getDescricao() + "\n"
                + "Identificador: " + getIdentificador() + "\n"
                + "Sexo: " + getSexo() + "\n"
                + "Data de Nascimento: " + getDataNascimento() + "\n"
                + "Espécie: " + getEspecie().getDescricao() + "\n"
                + getDataUltimaConsultaVeterinaria() +"\n"
                + "É de granja: " + eDeGranja ; 
        
        
    }
    
}
