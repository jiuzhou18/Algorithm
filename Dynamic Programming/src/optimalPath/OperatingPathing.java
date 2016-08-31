package optimalPath;

import java.util.Random;
import java.util.Scanner;

public class OperatingPathing {

	public static void main(String[] args) {

		PathRecurrence path = new PathRecurrence();
		int[][] optimal;
		Scanner in = new Scanner(System.in);
		int goldMax = 10;
		
		System.out.print("Please input the length of two-dementional matrixs: ");
		int matrixsLength = 0;
		do{
			if(!in.hasNextInt()){
				System.out.println("Error: Please input a integer.");
				in.nextLine();
			}else{
				matrixsLength = in.nextInt();
				in.nextLine();
				if(matrixsLength < 1){
					System.out.println("Error: Your input number is not positive. Please try a correct one.");
					continue;
				}
			}	
		}while(matrixsLength<1);
		int[][] goldMap = new int[matrixsLength][matrixsLength];
		Random random = new Random();
		for (int i=0; i<matrixsLength; i++){
			for(int j=0; j<matrixsLength; j++){
				goldMap[i][j] = random.nextInt(goldMax);
			}
		}
		path.renew(goldMap);
		optimal = path.findGold(matrixsLength-1, matrixsLength-1);
		System.out.println("The gold map shows:");
		for (int[] r: goldMap){
			for(int e: r){
				System.out.print(e+"\t");
			}
			System.out.println();
		}
		System.out.println("The optimal path is:");
		for (int[] r: optimal){
			for(int e: r){
				System.out.print(e+"\t");
			}
			System.out.println();
		}
		
	}

}
