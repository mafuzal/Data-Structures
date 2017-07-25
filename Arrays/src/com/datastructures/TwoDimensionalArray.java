package com.datastructures;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] data  = new int[3][3];
		data[0][0] = 10;
		data[0][1] = 11;
		data[0][2] = 16;
		data[1][0] = 14;
		data[1][1] = 19;
		data[1][2] = 12;
		data[2][0] = 19;
		data[2][1] = 10;
		data[2][2] = 21;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==j) {
					System.out.print(data[i][j]+"\t");
				}
			}
			System.out.println("\n");
		}
 	}

}
