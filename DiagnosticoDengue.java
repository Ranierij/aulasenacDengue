package br.senac.aula2;
public class DiagnosticoDengue {
    public static void main(String[] args) {
        // Verificando se foram passados sintomas suficientes
        boolean argsValidos = args != null && args[0] != null && args[1] != null && args[2] != null && args[3] != null;
        boolean dengue = argsValidos && diagnosticoDengue(args[0], args[1], args[2], args[3]);
        imprimirDiagnostico(dengue);
    }

    // Função para calcular o diagnóstico de dengue
    public static boolean diagnosticoDengue(String dorCabeca, String febreAlta, String dorOlhos, String manchasVermelhas) {
        return ("s".equalsIgnoreCase(dorCabeca) && "s".equalsIgnoreCase(febreAlta)) ||
               ("s".equalsIgnoreCase(dorOlhos) && "s".equalsIgnoreCase(manchasVermelhas));
    }

    // Função para imprimir o diagnóstico
    public static void imprimirDiagnostico(boolean dengue) {
        String resultado = dengue ? "O paciente pode estar com dengue." : "O paciente provavelmente não está com dengue.";
        System.out.println(resultado);
    }
}
