public class Main {

    public static void main(String[] args) {

        // 1) Cálculo do valor final da variável SOMA
        int INDICE = 13, SOMA = 0, K = 0;
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println("1) Valor da variável SOMA: " + SOMA);  // Resultado: 91

        System.out.println("\n---------------------------");

        // 2) Verifica se um número pertence à sequência de Fibonacci
        int num = 21;  // Você pode definir o número aqui
        if (isFibonacci(num)) {
            System.out.println("2) O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("2) O número " + num + " não pertence à sequência de Fibonacci.");
        }

        System.out.println("\n---------------------------");

        // 3) Cálculos de faturamento diário
        double[] faturamento = {1000.0, 1500.0, 0.0, 800.0, 0.0, 1200.0, 3000.0, 2000.0}; // Exemplo de faturamento
        calcularFaturamento(faturamento);

        System.out.println("\n---------------------------");

        // 4) Cálculo de percentual de representação por estado
        double SP = 67836.43, RJ = 36678.66, MG = 29229.88, ES = 27165.48, Outros = 19849.53;
        calcularPercentual(SP, RJ, MG, ES, Outros);

        System.out.println("\n---------------------------");

        // 5) Inverte uma string
        String str = "Exemplo";
        System.out.println("5) String invertida: " + inverterString(str));
    }

    // 2- Função para verificar se um número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int num) {
        int a = 0, b = 1, c = 0;
        while (c < num) {
            c = a + b;
            a = b;
            b = c;
        }
        return c == num || num == 0;
    }

    // 3-  Função para calcular menor, maior e dias com faturamento acima da média
    public static void calcularFaturamento(double[] faturamento) {
        double menor = Double.MAX_VALUE, maior = Double.MIN_VALUE, soma = 0.0;
        int diasComFaturamento = 0, diasAcimaDaMedia = 0;

        // Cálculo do menor, maior e soma do faturamento
        for (double valor : faturamento) {
            if (valor > 0) {
                if (valor < menor) menor = valor;
                if (valor > maior) maior = valor;
                soma += valor;
                diasComFaturamento++;
            }
        }

        double media = soma / diasComFaturamento;

        // Contagem de dias com faturamento acima da média
        for (double valor : faturamento) {
            if (valor > media) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("3) Menor faturamento: " + menor);
        System.out.println("3) Maior faturamento: " + maior);
        System.out.println("3) Dias com faturamento acima da média: " + diasAcimaDaMedia);
    }

    // 4- Função para calcular percentual de representação por estado
    public static void calcularPercentual(double SP, double RJ, double MG, double ES, double Outros) {
        double total = SP + RJ + MG + ES + Outros;
        System.out.println("4) Percentual de SP: " + String.format("%.2f", (SP / total * 100)) + "%");
        System.out.println("4) Percentual de RJ: " + String.format("%.2f", (RJ / total * 100)) + "%");
        System.out.println("4) Percentual de MG: " + String.format("%.2f", (MG / total * 100)) + "%");
        System.out.println("4) Percentual de ES: " + String.format("%.2f", (ES / total * 100)) + "%");
        System.out.println("4) Percentual de Outros: " + String.format("%.2f", (Outros / total * 100)) + "%");
    }

    // 5- Função para inverter uma string
    public static String inverterString(String str) {
        String invertida = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            invertida += str.charAt(i);
        }
        return invertida;
    }
}
