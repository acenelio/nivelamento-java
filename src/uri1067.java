import java.util.Scanner;

public class uri1067 {

	public static void main(String[] args) {
		Scanner scanner;
		int intervaloMin, intervaloMax, x;
		boolean xRespeitaIntervalo;

		intervaloMin = 1;
		intervaloMax = 1000;
		
		scanner = new Scanner(System.in);

		x = sc.nextInt();
		xRespeitaIntervalo = intervaloMin <= x && x <= intervaloMax;

		for (int numIteracao = 1; xRespeitaIntervalo && numIteracao <= x; numIteracao++) {
			boolean numIteracaoEhImpar = numIteracao % 2 != 0;
			if (numIteracaoEhImpar) {
				System.out.println(numIteracao);
			}
		}

		sc.close();
	}

}
