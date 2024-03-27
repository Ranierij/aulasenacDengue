package br.senac.aula2;
public class DiagnosticoDengue {
    public static void main(String[] args) {
        // Verificando se foram passados sintomas suficientes
        if (args == null || args[0] == null || args[1] == null || args[2] == null || args[3] == null) {
            System.out.println("Por favor, forneça os sintomas do paciente.");
            return;
        }

        // Obtendo os sintomas do paciente dos argumentos da linha de comando
        String dorCabeca = args[0];
        String febreAlta = args[1];
        String dorOlhos = args[2];
        String manchasVermelhas = args[3];

        // Calculando o diagnóstico
        boolean dengue = diagnosticoDengue(dorCabeca, febreAlta, dorOlhos, manchasVermelhas);

        // Imprimindo o diagnóstico
        imprimirDiagnostico(dengue);
    }

    // Função para calcular o diagnóstico de dengue
    public static boolean diagnosticoDengue(String dorCabeca, String febreAlta, String dorOlhos, String manchasVermelhas) {
        return ("s".equalsIgnoreCase(dorCabeca) && "s".equalsIgnoreCase(febreAlta)) ||
               ("s".equalsIgnoreCase(dorOlhos) && "s".equalsIgnoreCase(manchasVermelhas));
    }

    // Função para imprimir o diagnóstico
    public static void imprimirDiagnostico(boolean dengue) {
        if (dengue) {
            System.out.println("O paciente pode estar com dengue.");
        } else {
            System.out.println("O paciente provavelmente não está com dengue.");
        }
    }
}
