package src;
//import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
	
	//int[][] matrix   = new int[3][5];
	int[][] matfinal = new int[5][3];

	int org[]={4,7,1,3,5,2,0,6,9,7,3,1,2,6,4};
	/*int matrix[][]={
		{4,7,1,3,5},
		{2,0,6,9,7},
		{3,1,2,6,4}
	};*/

	int [][] matrix = new int[3][5];

	for(int y=0;y<3;y++){
		for(int x=0;x<5;x++){
			matrix[y][x]=org[x+y*5];
		}
	}

	

	for(int y=0;y<matrix.length;y++){
		for(int x=0;x<matrix[0].length;x++){
			matfinal[x][y]=matrix[y][x];
			System.out.print(matrix[y][x]);
		}
		System.out.println("");
	}
	System.out.println("------------------------------------");
	for(int y=0;y<5;y++){
		for(int x=0;x<3;x++){
			System.out.print(matfinal[y][x]);
		}
		System.out.println("");
	}
	//ezuwu



  }
}