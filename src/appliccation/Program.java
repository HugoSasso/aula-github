package appliccation;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite a qt de linhas: ");
		int linha = sc.nextInt();
		System.out.print("digite a qt de colunas: ");
		int coluna = sc.nextInt();
		int[][] mat= new int[linha][coluna];
		
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
	
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.print("\nA digite o número que procura: ");
		int proc = sc.nextInt();
		int cont =0;

		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (proc == mat[i][j]) {
					System.out.printf("\n\nposição: %d, %d", i, j);
					cont++;
					if(j>0) {
						System.out.printf("\nESQUERDA: %d", mat[i][j-1]);
					}
					if(j<mat[i].length-1) {
						System.out.printf("\nDIREITA: %d", mat[i][j+1]);
					}
					if(i>0) {
						System.out.printf("\nEM CIMA: %d", mat[i-1][j]);
					}
					if(i<mat.length-1) {
						System.out.printf("\nEM BAIXO: %d", mat[i+1][j]);
					}
				}
				
			}
	
		}
		if (cont==0) {
			System.out.printf("Não existe %d na Matris", proc);
		}
		sc.close();
	}

}
