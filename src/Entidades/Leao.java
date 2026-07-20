package Entidades;
import lombok.*;
@Getter
@Setter
public class Leao extends Animal {
    
    private double tamanhoDaJuba;
    public double getTamanhoDaJuba (){
        return tamanhoDaJuba;
    }
    public void setTamanhoDaJuba(double tamanhoDaJuba){
        this.tamanhoDaJuba = tamanhoDaJuba;
    }
    
   @Override
    public String alimentar() {
        return super.alimentar();
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
        return rugir();
    }
    
    
    @Override
    public String apresentar() {
        return "Sou um Leão \n"
                + "Nome: " + getNome() + "\n"
                + "Cor: " + getCor() + "\n"
                + "Descrição: " + getDescricao() + "\n"
                + "Identificador: " + getIdentificador() + "\n"
                + "Sexo: " + getSexo() + "\n"
                + "Data de Nascimento: " + getDataNascimento() + "\n"
                + "Espécie: " + getEspecie().getDescricao() + "\n"
                + "Data da última consulta veterinária: " 
                + getDataUltimaConsultaVeterinaria() +"\n"
                + "Tamanho da Juba: " + tamanhoDaJuba ; 
        
        
    }
}