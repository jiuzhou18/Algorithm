package self_reversalString;

public class MatchingReversalIterately {
	
	private char[] origin;
	private String opitmal;
	
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
	

}
