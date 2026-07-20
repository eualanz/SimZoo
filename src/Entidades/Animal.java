    package Entidades;

import java.util.Date;
import lombok.*;

@Getter
@Setter
public abstract class Animal {

    private String nome;
    private String cor;
    private String descricao;
    private int identificador;
    private char sexo;
    private Date dataNascimento;
    private Especie especie;
    private Date dataUltimaConsultaVeterinaria;

    public abstract String apresentar();

    public int calcularIdade(Date dataNascimento) {
       return  DataUtility.calcularIdade(dataNascimento);     
    }

    public String alimentar() {

        return "Comer carne!!";
    }
    
    public String emitirSomMiau() {

        return "Miau, Miau, Miau";
    }

    public String andar() {
        return "Andar de 4 patas";
    }

    public String voar() {

        return "Voar com duas asas";
    }

    public String latir() {
        return "Au...Au.. Au..";
    }
    
    public String rugir() {
        return "Ruamm... Ruammm... Ruammm";
    }
    
    public String emitirSom() {
        return "Co co ri có ..cooocoricó";
    }
    // getter e setter
   
        public String getNome(){
            return nome;    
    }
        public void setNome(String nome){
            this.nome = nome;
    }
            public String getCor(){
            return cor;    
    }
        public void setCor(String cor){
            this.cor = cor;
    }
            public String getDescricao(){
            return descricao;    
    }
        public void setDescricao(String descricao){
            this.descricao = descricao;
    }
            public int getIdentificador(){
            return identificador;    
    }
        public void setIdentificador(int identificador){
            this.identificador = identificador;
    }
        public void setSexo(char sexo){
            this.sexo = sexo;
    }
                 public char getSexo(){
            return sexo;    
    }
        public void setDataNascimento(Date dataNascimento){
            this.dataNascimento = dataNascimento;
    }
            public Date getDataNascimento(){
            return dataNascimento;    
    }
            public Especie getEspecie(){
            return especie;    
    }
        public void setEspecie(Especie especie){
            this.especie = especie;
    }
                public Date getDataUltimaConsultaVeterinaria(){
            return dataUltimaConsultaVeterinaria;    
    }
        public void setDataUltimaConsultaVeterinaria(Date dataUltimaConsultaVeterinaria){
            this.dataUltimaConsultaVeterinaria = dataUltimaConsultaVeterinaria;
    }   
}