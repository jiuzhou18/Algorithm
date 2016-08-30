package optimalPath;

import java.util.Random;
import java.util.Scanner;

public class OperatingPathing {

	public static void main(String[] args) {

		PathRecurrence path = new PathRecurrence();
		Scanner in = new Scanner(System.in);
		
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
		
		
	}

}
