package Entidades;

import java.util.Calendar;

public class Teste {

    public static void main(String[] args) {

        // Instanciando o Leão
        Leao leao = new Leao();
        leao.setNome("Simba");
        leao.setDescricao("Rei da selva");

        // Preenchendo os dados
        leao.setNome("Simba");
        leao.setCor("Dourado");            // Definindo a cor
        leao.setIdentificador(12345);      // Definindo o ID
        leao.setSexo('M');             // Definindo o sexo
        leao.setTamanhoDaJuba(15.5);       // Definindo o tamanho da juba (double)

        // Configurando a Data de Nascimento
        Calendar cal = Calendar.getInstance();
        cal.set(2020, Calendar.JANUARY, 10);
        leao.setDataNascimento(cal.getTime());

        // Configurando a Data da Última Consulta ---
        Calendar calConsulta = Calendar.getInstance();
        calConsulta.set(2024, Calendar.MAY, 20);
        leao.setDataUltimaConsultaVeterinaria(calConsulta.getTime());

        // Configurando a Espécie
        Especie especie = new Especie();
        especie.setDescricao("Leão");
        leao.setEspecie(especie);

        // --- SAÍDAS NO CONSOLE ---

        System.out.println("Nome do Animal: " + leao.getNome());

        // Verificação de segurança para evitar NullPointerException caso a espécie não exista
        if (leao.getEspecie() != null) {
            System.out.println("Espécie: " + leao.getEspecie().getDescricao());
        }

        // Chamando o método estático da classe DataUtility
        int idade = DataUtility.calcularIdade(leao.getDataNascimento());
        System.out.println("Idade calculada: " + idade + " anos");

        // Testando o método apresentar classe Leao
        System.out.println("\n--- Ficha Completa ---");
        System.out.println(leao.apresentar());
        System.out.println("O animal faz: " + leao.emitirSom());
       }
}