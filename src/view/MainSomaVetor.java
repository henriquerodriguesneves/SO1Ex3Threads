package view;

import java.util.Random;
import controller.SomaVetor;


public class MainSomaVetor {

	public static void main(String[] args) {
		int mat [][]= new int [3][5];
		Random random = new Random();
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; i < 5; i++) {
				mat[i][j] = random.nextInt(100);
			}
		}
		for(int i = 0; i < 3; i++) {
			SomaVetor somaVetor = new SomaVetor(i+1, mat[i]);
			somaVetor.start();
		}

	}

}