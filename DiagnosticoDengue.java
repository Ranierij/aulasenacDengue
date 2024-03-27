package br.senac.aula2;
public class DiagnosticoDengue {
    public static void main(String[] args) {
        // Verificando se foram passados sintomas suficientes
        if (args.length < 4) {
            System.out.println("Por favor, forneça os sintomas do paciente.");
            return;
        }

        // Obtendo os sintomas do paciente dos argumentos da linha de comando
        char dorCabeca = args[0].charAt(0);
        char febreAlta = args[1].charAt(0);
        char dorOlhos = args[2].charAt(0);
        char manchasVermelhas = args[3].charAt(0);

        // Verificando se os sintomas indicam dengue
        boolean dengue = (dorCabeca == 's' && febreAlta == 's') || (dorOlhos == 's' && manchasVermelhas == 's');

        // Imprimindo o diagnóstico
        if (dengue) {
            System.out.println("O paciente pode estar com dengue.");
        } else {
            System.out.println("O paciente provavelmente não está com dengue.");
            
            
        }
    }
}
