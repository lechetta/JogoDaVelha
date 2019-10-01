package teste;

import java.util.Scanner;

public class jogodavelha {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String[][] velha = {
				{"-","-","-"},{"-","-","-"},{"-","-","-"}
		};
		String[] aux = new String [9];
		String[] aux1 = new String [9];
		int x=0;
		int y = 0;
		String jogador=" ";
		String jogador2=" ";

		//mostrar tabuleiro
		for(int i =0; i < velha.length; i++) {
			for(int j=0; j < velha.length; j++) {
				System.out.print(" " + velha[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println("nome do jogador 1");
		jogador=teclado.next();
		System.out.println("nome do jogador 2");
		jogador2=teclado.next();
		boolean vencedor = false;
		//laço de jogada
		System.out.println("Bem vindo " + jogador + " e  " + jogador2);
		System.out.println("as posições são de 0 a 2 para colunas e linhas");
		while(vencedor == false) {

			System.out.println("digite a linha");

			x=teclado.nextInt();
			if(x > 2 || x < 0) {
				System.out.println("posição invalida");
				x=teclado.nextInt();
				return;
			}
			System.out.println("digite a coluna");
			y=teclado.nextInt();
			if((y > 2) || (y < 0)) {
				System.out.println("posição invalida");
				y=teclado.nextInt();
				return;
			}
			for(int i =0; i <velha.length; i++) {
				aux[i]=velha[x][y];
				if( velha[x][y] == aux[i]) {
					velha[x][y]="X";					
				}else {
					System.out.println("posição ja alocada");					
				}
			}
			for(int i =0; i < velha.length; i++) {
				if(((velha[0][0] == "X") && (velha[1][0] == "X") && (velha[2][0] == "X"))){
					System.out.println("Parabens " + jogador + "você é o vencedor");
					vencedor = true;
					break;
				}else
					if(((velha[0][1] == "X") && (velha[1][1] == "X") && (velha[2][1] == "X"))){
						System.out.println("Parabens " + jogador + "você é o vencedor");
						vencedor = true;
					}else 
						if(((velha[0][2] == "X") && (velha[1][2] == "X") && (velha[2][2] == "X")) ){
							System.out.println("Parabens " + jogador + "você é o vencedor");
							vencedor = true;
						}else 
							if(((velha[0][0] == "X") && (velha[0][1] == "X") && (velha[0][2] == "X"))){
								System.out.println("Parabens " + jogador + "você é o vencedor");
								vencedor = true;
							}else 
								if(((velha[1][0] == "X") && (velha[1][1] == "X") && (velha[1][2] == "X"))){
									System.out.println("Parabens " + jogador + "você é o vencedor");
									vencedor = true;
								} else 
									if(((velha[2][0] == "X") && (velha[2][1] == "X") && (velha[2][2] == "X"))){
										System.out.println("Parabens " + jogador + "você é o vencedor");
										vencedor = true;
									}else 
										if(((velha[0][0] == "X") && (velha[1][1] == "X") && (velha[2][2] == "X"))){
											System.out.println("Parabens " + jogador + "você é o vencedor");
											vencedor = true;
										}else 
											if(((velha[0][2] == "X") && (velha[1][1] == "X") && (velha[2][0] == "X"))){
												System.out.println("Parabens " + jogador + "você é o vencedor");
												vencedor = true;
											}
			}

			//mostrar tabuleiro 
			for(int i =0; i < velha.length; i++) {
				for(int j=0; j < velha.length; j++) {
					System.out.print(" " + velha[i][j]);
				}
				System.out.println(" ");
			}

			//jogador 2
			System.out.println("vez do " + jogador2);
			System.out.println("digite a linha");
			x=teclado.nextInt();
			if(x > 2 || x < 0) {
				System.out.println("posição invalida");
				x=teclado.nextInt();

			}
			System.out.println("digite a coluna y");
			y=teclado.nextInt();
			if(y > 2 || y < 0|| velha[x][y].contentEquals("X") || velha[x][y].contentEquals("0")) {
				System.out.println("posição invalida");
				y=teclado.nextInt();

			}
			for(int i =0; i < velha.length;i++) {
				aux1[i]=velha[x][y];
				if( velha[x][y] == aux1[i]) {
					velha[x][y]="0";					
				}else {
					System.out.println("posição ja alocada");					
				}
			}

			for(int i =0; i < velha.length; i++) {
				for(int j=0; j < velha.length; j++) {
					System.out.print(" " + velha[i][j]);
				}
				System.out.println(" ");
			}
			for(int i =0; i < velha.length; i++) {
				if(((velha[0][0] == "0") && (velha[1][0] == "0") && (velha[2][0] == "0"))){
					System.out.println("Parabens " + jogador2 + "você é o vencedor");					
					vencedor = true;
				}else
					if(((velha[0][1] == "0") && (velha[1][1] == "0") && (velha[2][1] == "0"))){
						System.out.println("Parabens " + jogador2 + "você é o vencedor");	
						vencedor = true;
					}else
						if(((velha[0][2] == "0") && (velha[1][2] == "0") && (velha[2][2] == "0"))){
							System.out.println("Parabens " + jogador2 + "você é o vencedor");	
							vencedor = true;
						}else
							if(((velha[0][0] == "0") && (velha[0][1] == "0") && (velha[0][2] == "0"))){
								System.out.println("Parabens " + jogador2 + "você é o vencedor");	
								vencedor = true;
							}else 
								if(((velha[1][0] == "0") && (velha[1][1] == "0") && (velha[1][2] == "0"))){
									System.out.println("Parabens " + jogador2 + "você é o vencedor");	
									vencedor = true;
								} else 
									if(((velha[2][0] == "0") && (velha[2][1] == "0") && (velha[2][2] == "0"))){
										System.out.println("Parabens " + jogador2 + "você é o vencedor");	
										vencedor = true;
									}else 
										if(((velha[0][0] == "0") && (velha[1][1] == "0") && (velha[2][2] == "0"))){
											System.out.println("Parabens " + jogador2 + "você é o vencedor");	
											vencedor = true;
										}else 
											if(((velha[0][2] == "0") && (velha[1][1] == "0") && (velha[2][0] == "0"))){
												System.out.println("Parabens " + jogador2 + "você é o vencedor");	
												vencedor = true;
											}

			}
		}
	}
}

