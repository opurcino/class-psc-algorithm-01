import java.util.Scanner;

public class divertidamente {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        // Inicialização dos pontos das emoções
        int pontosAlegria = 0;
        int pontosTristeza = 0;

        System.out.println("--- Sistema de Controle de Emoções da Riley ---");

        // 1. Bloco de Amizades
        System.out.print("A Riley fez novas amizades na cidade? (s/n): ");
        char fezAmizade = leitor.next().toLowerCase().charAt(0);

        if (fezAmizade == 's') {
            System.out.print("Quantas amizades ela fez? ");
            int qtdAmizades = leitor.nextInt();
            pontosAlegria += (qtdAmizades * 10);
        } else {
            pontosTristeza += 30;
        }

        // 2. Bloco Acadêmico (Provas A1, A2 e A3)
        System.out.println("\n--- Notas das Provas ---");
        System.out.print("Nota A1: ");
        double a1 = leitor.nextDouble();
        System.out.print("Nota A2: ");
        double a2 = leitor.nextDouble();
        System.out.print("Nota A3: ");
        double a3 = leitor.nextDouble();

        double media = (a1 + a2 + a3) / 3;

        if (media >= 7.0) {
            System.out.println("Aprovada! Média: " + String.format("%.2f", media));
            pontosAlegria += 50;
        } else {
            System.out.println("Reprovada. Média: " + String.format("%.2f", media));
            pontosTristeza += 50;
        }

        // 3. Bloco de Programação
        System.out.println("\n--- Desafio de Programação (10 algoritmos) ---");
        System.out.print("Quantos exercícios a Riley conseguiu fazer? ");
        int exerciciosFeitos = leitor.nextInt();
        
        // Validação básica para não ultrapassar o limite de 10
        if (exerciciosFeitos > 10) exerciciosFeitos = 10;
        
        int exerciciosNaoFeitos = 10 - exerciciosFeitos;

        pontosAlegria += (exerciciosFeitos * 10);
        pontosTristeza += (exerciciosNaoFeitos * 10);

        // 4. Comparação Final
        System.out.println("\n========================================");
        System.out.println("Placar Final - Alegria: " + pontosAlegria + " | Tristeza: " + pontosTristeza);
        
        if (pontosAlegria > pontosTristeza) {
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
        } else if (pontosTristeza > pontosAlegria) {
            System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        } else {
            System.out.println("A Riley está com sentimentos mistos sobre a mudança.");
        }
        System.out.println("========================================");

        leitor.close();
    }
}