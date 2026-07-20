package Entidades;

import lombok.*;
@Getter
@Setter
public class Girafa extends Animal {
    
     private double tamanhoDaLingua;
    public double getTamanhoDaLingua (){
        return tamanhoDaLingua;
    }
    public void setTamanhoDaLingua(double tamanhoDaLingua){
        this.tamanhoDaLingua = tamanhoDaLingua;
    }

    @Override
    public String alimentar() {
        return "Comer folhas";
    }
     @Override
    public String emitirSomMiau() {
        return "Não emite som miau";

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
        return "Não emite som!";
    }
    
    
    
    @Override
    public String apresentar() {
        
        return "Sou uma Girafa \n"
                + "Nome: " + getNome() + "\n"
                + "Cor: " + getCor()+ "\n"
                + "Descrição: " + getDescricao() + "\n"
                + "Identificador: " + getIdentificador() + "\n"
                + "Sexo: " + getSexo() + "\n"
                + "Data de Nascimento: " + getDataNascimento() + "\n"
                + "Espécie: " + getEspecie().getDescricao() + "\n"
                + "Data da última consulta veterinária: " 
                + getDataUltimaConsultaVeterinaria() +"\n"
                + "Tamanho da lingua: " + tamanhoDaLingua ; 
        
        
    }
    
}
