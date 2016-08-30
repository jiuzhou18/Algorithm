package optimalPath;

public class PathRecurrence {
	
	private int optimal[][];
	private int goldMap[][];
	
	public PathRecurrence(){
		
	}
	
	public PathRecurrence(int goldMatrix[][]){
		goldMap = goldMatrix.clone();
		int row = goldMatrix.length;
		int column = goldMatrix[1].length;
		optimal = new int[row][column];
	}
	
	public void renew(int goldMatrix[][]){
		goldMap = goldMatrix.clone();
		int row = goldMatrix.length;
		int column = goldMatrix[1].length;
		optimal = new int[row][column];
	}
	
	public int[][] findGold(int i, int j){
		if (i==1){
			if (j==1){
				optimal[0][0] = goldMap[0][0];
				return optimal;
			}else{
				findGold(i, j-1);
				optimal[i][j] = optimal[i][j-1] + goldMap[i][j];
			}			
		}else if (j==1){
			findGold(i-1,j);
			optimal[i][j] = optimal[i-1][j] + goldMap[i][j];
		}else{
			findGold(i, j-1);
			findGold(i-1, j);
			if(optimal[i-i][j] > optimal[i][j-1])
				optimal[i][j] = optimal[i-1][j] + goldMap[i][j];
			else optimal[i][j] = optimal[i][j-1] +goldMap[i][j];
		}
		return optimal;
	}

	

}
