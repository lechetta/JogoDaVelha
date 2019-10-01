package teste;

import java.util.Scanner;

public class teste2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String[][] velha = {
				{"0","1","2"},{"3","4","5"},{"6","7","8"}
		};
		String jogada = "";
		String[] aux1 = new String [9];
		int x=0;
		int l = 0;
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
		System.out.println("Bem vindo " + jogador + " " + jogador2);

		System.out.println("escolha um numero");
		while(vencedor == false) {
			x=teclado.nextInt();
			if(jogador.equals(x==0)){
				velha[0][0]="X";

			}else if(jogador2.equals(x==0)) {
				velha[0][0]="0";
			}
			if(jogador.equals(x==1)) {
				velha[0][1]="X";
			}else if(jogador2.equals(x==1)) {
				velha[0][1]="0";
			}
			if(jogador.equals(x==2)) {
				velha[0][2]="X";
			}else if(jogador2.equals(x==2)) {
				velha[0][2]="0";
			}
			if(jogador.equals(x==3)) {
				velha[1][0]="X";
			}else if(jogador2.equals(x==3)) {
				velha[1][0]="0";
			}
			if(jogador.equals(x==4)) {
				velha[1][1]="X";
			}else if(jogador2.equals(x==4)) {
				velha[1][1]="0";
			}
			if(jogador.equals(x==5)) {
				velha[1][2]="X";
			}else if(jogador2.equals(x==5)) {
				velha[1][2]="0";
			}if(jogador.equals(x==6)) {
				velha[2][0]="X";
			}
			else if(jogador2.equals(x==6)) {
				velha[2][0]="0";
			}if(jogador.equals(x==7)) {
				velha[2][1]="X";
			}else if(jogador2.equals(x==7)) {
				velha[2][1]="0";
			}if(jogador.equals(x==8)) {
				velha[2][2]="X";
			}else if(jogador2.equals(x==8)) {
				velha[2][2]="0";
			}
			for(int i =0; i < velha.length; i++) {
				for(int j=0; j < velha.length; j++) {
					System.out.print(" " + velha[i][j]);
				}
				System.out.println(" ");
			}

		}
	}
}

