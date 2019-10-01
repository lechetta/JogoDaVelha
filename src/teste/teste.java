package teste;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		String [][] n = {
				{"-","-","-"},{"-","-","-"},{"-","-","-"}
		};
		int x=0;
		int y=0;
		int l=0;
		System.out.println();
		for(int i=0;i<=n.length-1;i++) {
			for(int v=0;v<=n.length-1;v++) {
				System.out.print(" " + n[i][v]);

			}
			System.out.println(" ");
		}
		while(l<=8) {
			System.out.println("Escolha uma Posicao para X");
			System.out.println("Digite a Linha (X)");
			x = tc.nextInt();
			if(x>2 || x<0) {
				System.out.println("Posicao Invalida Digite Novamente");
				x=tc.nextInt();
			}
			System.out.println("Digite a Coluna (Y)");
			y=tc.nextInt();
			if(y>2 || y<0 || n[x][y].contentEquals("X") || n[x][y].contentEquals("O")) {
				System.out.println("Posicao Invalida Digite Novamente");
				y=tc.nextInt();
			}
			n[x][y] = "X";
			l++;

			for(int i=0;i<=n.length-1;i++) {
				for(int v=0;v<=n.length-1;v++) {
					System.out.print(" " + n[i][v]);
				}
				System.out.println(" ");
			}
			System.out.println("Proximo Jogador");
			System.out.println("Escolha a Posicao para O");
			System.out.println("Digite a Linha (X)");
			x = tc.nextInt();
			if(x>2 || x<0) {
				System.out.println("Posicao Invalida Digite Novamente");
				x=tc.nextInt();
			}
			System.out.println("Digite a Coluna (Y)");
			y=tc.nextInt();
			if(y>2 || y<0 || n[x][y].contentEquals("X") || n[x][y].contentEquals("O")) {
				System.out.println("Posicao Invalida Digite Novamente");
				y=tc.nextInt();
			}
			n[x][y] = "O";
			l++;
			for(int i=0;i<=n.length-1;i++) {
				for(int v=0;v<=n.length-1;v++) {
					System.out.print(" " + n[i][v]);


				}
				System.out.println(" ");
			}
		}

	}

}