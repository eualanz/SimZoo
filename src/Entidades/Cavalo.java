package Entidades;

import lombok.*;
import java.util.Date;

@Getter
@Setter
public class Cavalo  extends Animal {
    
    private Date dataInstalacaoFerradura;
    public Date getDataInstalacaoFerradura(){
        return dataInstalacaoFerradura;
    }
    public void setDataInstalacaoFerradura (Date dataInstalacaoFerradura){
        this.dataInstalacaoFerradura = dataInstalacaoFerradura;
    }
    
    @Override
    public String alimentar() {
        return "Comer feno!";
    }
     @Override
    public String emitirSomMiau() {
        return "Não emite som miau";
    }
     @Override
    public String andar() {
        return "POCOTÓ POCOTÓ...";
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
        return "Relinchar";
    }
    
    
    
    @Override
    public String apresentar() {
        
        return "Sou um Cavalo \n"
                + "Nome: " + getNome() + "\n"
                + "Cor: " + getCor() + "\n"
                + "Descrição: " + getDescricao() + "\n"
                + "Identificador: " + getIdentificador() + "\n"
                + "Sexo: " + getSexo() + "\n"
                + "Data de Nascimento: " + getDataNascimento() + "\n"
                + "Espécie: " + getEspecie() .getDescricao() + "\n"
                + getDataUltimaConsultaVeterinaria() +"\n"
                + "Data de instalação da ferradura: " + dataInstalacaoFerradura ; 
        
        
    }
    
}

    
