package stringassignments;

//W.A.J.P to check whether a given string starts with the contents of another string. 
//Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts 
//with Red? False I3. 

public class StringStartWith {

	public static void main(String[] args) {
//		String str="Red is my favorite color";
		String str="Orange is also my favorite color";
		
		String checkStr="Red";
		boolean isStartWith=str.startsWith(checkStr);
		System.out.println(isStartWith);

	}

}
