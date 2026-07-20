package Entidades;

import lombok.*;
@Getter
@Setter
public class Onca extends Animal {
    
    private boolean temFilhotes;
    public boolean isTemFilhotes(){
        return temFilhotes;
    }
    public void setTemFilhotes(boolean temFilhotes){
        this.temFilhotes = temFilhotes;
    }

     @Override
    public String alimentar() {
        return super.alimentar();
    }
     @Override
    public String emitirSomMiau() {
        return "Não emite som miau!";
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
        return "Esturro!";
    }
    
    
    @Override
    public String apresentar() {
        
        return "Sou uma Onça \n"
                + "Nome: " + getNome() + "\n"
                + "Cor: " + getCor() + "\n"
                + "Descrição: " + getDescricao() + "\n"
                + "Identificador: " + getIdentificador() + "\n"
                + "Sexo: " + getSexo() + "\n"
                + "Data de Nascimento: " + getDataNascimento() + "\n"
                + "Espécie: " + getEspecie()+getDescricao() + "\n"
                + "Data da última consulta veterinária: " 
                + getDataUltimaConsultaVeterinaria() +"\n"
                + "Tem filhotes: " + temFilhotes ; 
        
        
    }
}