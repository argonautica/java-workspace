import java.util.ArrayList;

public class LipogramAnalyzer {


	
	
	
	private String text; //holds text for class
	
	//creates analyzer and sets text 
	public LipogramAnalyzer(String text)  
	{
		this.text=text;
	}
	
	//replaces letter and returns String

	public String mark(char letter)		
	{
		return text.replace(letter, '#');
	}
	
	//returns a string of all words with given letter

	public String allWordsWith(char letter)
	{
		String list = "";
		ArrayList<String> strings = new ArrayList<String>();
		int last=0;
		text+=" ";
		
		for(int i=0;i<text.length();i++)		//loops through text string
		{
			String temp="";
			Character c=text.charAt(i);
			if(!Character.isLetterOrDigit(c) && c!='\'' && c!='-')	//if the char is something that separates words
			{
				temp=text.substring(last,i);
				strings.add("");
				
				
				if(temp.indexOf(letter)!=-1)		//if the word contains the given letter
				{
					temp=temp.trim();
					for(int j=0;j<strings.size();j++)	//loop through ArrayList of added words to check for repeats
					{
						if(strings.indexOf(temp)==-1)	//if no repeats, add to ArrayList and return string
						{
							strings.add(0, temp);
							list+=temp+'\n';
						}	
					}
				}
				last=i;		//sets location of the end of the current word
			}
		}
		return list.trim();
	}
	
	//test for 't' and different punctuation
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LipogramAnalyzer la=new LipogramAnalyzer("test");
		System.out.println(la.allWordsWith('t'));
		
	}

}