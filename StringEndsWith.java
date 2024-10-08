package stringassignments;

//W.A.J.P to check whether a given string ends with the contents of another string. 
//"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True 

public class StringEndsWith {

	public static void main(String[] args) {
//		String str="Java Exercises";
		String str="Java Exercise";
		
		String checkStr="se";
		boolean isEndWith=str.endsWith(checkStr);
		System.out.println(isEndWith);

	}

}
