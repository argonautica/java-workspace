
public class HangmanGame {
	
	
	public String word; 
	
	public StringBuffer partial  = new StringBuffer("");
	public StringBuffer tried = new StringBuffer(""); 

	
	
	
	public HangmanGame(String word) {
		 this.word = word; 
		for (int i = 0; i < word.length() ; i++) {
			
			
			partial.append("-");
		}
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getWord() {
		
		
		return word; 
		
		
	}
	public String getGuessed() {
		// TODO Auto-generated method stub
		return partial.toString();
	}

	public int tryLetter(char charAt) {
	if(tried.toString().indexOf(charAt) >= 0) {
		
        return 0;
     }   
     
     tried.append(charAt);
     
     if(word.indexOf(charAt) >= 0) {
        
        for(int i =0; i<word.length(); i++) {
           if(word.charAt(i) == charAt) {
              partial.setCharAt(i, charAt);
           }
        }
        
                 
        return 1;
     }
     
     return -1;
  }
	

		
		
		
	
	

	public String getTried() {
		// TODO Auto-generated method stub
		return tried.toString();
	}

}
	