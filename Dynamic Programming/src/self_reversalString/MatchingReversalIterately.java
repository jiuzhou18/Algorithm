package self_reversalString;

public class MatchingReversalIterately {
	
	private char[] origin = new char[1];
//	private String optimal;
	
	public MatchingReversalIterately (){
		
	}
	
	public MatchingReversalIterately (char[] origin){
		this.origin = new char[origin.length];
		System.arraycopy(origin, 0, this.origin, 0, origin.length); 
	}
	
	public void renew(char[] origin){
		this.origin = new char[origin.length];
		System.arraycopy(origin, 0, this.origin, 0, origin.length); 
	}
	
	public String splitWhole(){
		return splitString(origin.length-1);
	}
	
	public String splitString(int k){
		String optimal = "";
		if (k==0)
			return optimal = origin[0] +"";
		else{
			optimal = splitString(k-1)+" "+origin[k];
			for (int a=0; a<k; a++){
				if (origin[a]==origin[k]){
					boolean judge = true;
					if(a<k-2){
						for(int b=a+1; b<=(a+k)/2; b++){
							if (origin[b]!=origin[a+k-b]){ 
								judge = false;
								break;
							}
						}
					}
					if (judge==true){
						if (a==0)
							return new String(origin,0,k+1);
						else{
							String optimal2 = splitString(a-1) +" "+new String(origin,a,k-a+1);
							if (optimal2.split(" ").length < optimal.split(" ").length)
								optimal = optimal2;
							
						}
					}
				}
			}
		}
		return optimal;
	}

}
