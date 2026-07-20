    package Entidades;

    import lombok.*;
    @Getter
    @Setter
    public class Cachorro extends Animal {

        private boolean temPedigre;
        public boolean isTemPedigre(){
            return temPedigre;
        }
        public void setTemPedigre(boolean temPedigre){
            this.temPedigre = temPedigre;
        }

         @Override
        public String alimentar() {
            return "Comer ração!";
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
        public String emitirSom() {
            return "Au!";
        }


        @Override
        public String apresentar() {

            return "Sou um Cachorro \n"
                    + "Nome: " + getNome() + "\n"
                    + "Cor: " + getCor() + "\n"
                    + "Descrição: " + getDescricao() + "\n"
                    + "Identificador: " + getIdentificador() + "\n"
                    + "Sexo: " + getSexo() + "\n"
                    + "Data de Nascimento: " + getDataNascimento() + "\n"
                    + "Espécie: " + getEspecie().getDescricao() + "\n"
                    + "Data da última consulta veterinária: " 
                    + getDataUltimaConsultaVeterinaria() +"\n"
                    + "Tem pedigre: " + temPedigre ; 


        }
    }