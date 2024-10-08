package stringassignments;

//W.A.J.P to find the second most frequent character in a given string. The given string 
//is: successes The second most frequent char in the string is: c 

public class SecondMostFrequentCharacter {

	public static void main(String[] args) {
		
		String str="successes";
		
		int[] count=new int[256];
		int i;
		int first=0;
		int second=0;
		
		
		for(i=0;i<str.length();i++) {
			(count[str.charAt(i)])++;
		}
		
		for(i=0;i<256;i++) {
			if(count[i]>count[first]) {
				 second=first;
				 first=i;
			}
			else if(count[i]>count[second]&&count[i]!=count[first]) {
				count[second]=count[i];
				second=i;
			}
		}
		
		char secFrequent=(char)second;
		System.out.println(secFrequent);
	}

}
