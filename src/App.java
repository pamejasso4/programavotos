import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos candidatos hay? ");
        int n = sc.nextInt();

        int[] votos = new int[n + 1];
        int voto;
        int total = 0;

        System.out.printf("Ingrese el número del candidato (0 para terminar):");
        voto = sc.nextInt();

        while (voto != 0) {
            if (voto >= 1 && voto <= n) {
                votos[voto]++;
                total++;
            } else {
                System.out.printf("Candidato no valido");
            }
            voto = sc.nextInt();
        }

        System.out.println("\nResultados:");

        if (total > 0) {
            for (int i = 1; i <= n; i++) {
                double porcentaje = votos[i] * 100.0 / total;
                System.out.printf("Candidato %d: %.2f%%%n", i, porcentaje);

            }
        } else {
            System.out.printf("No se registraron votos.");
        }
    }
}
