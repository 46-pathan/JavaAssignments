package stringassignments;

//W.A.J.P to find all interleaving of given strings. 
//The given strings are: WX YZ 
//The interleaving strings are: YWZX WYZX YWXZ WXYZ YZWX WYXZ

public class InterleavingOfStrings {
	
	static void printInterLeaving(String s1,int i,String s2,int j,String result) {
		if(i==s1.length()&&j==s2.length()) {
			System.out.println(result);
		}
		if(i<s1.length()) {
			printInterLeaving(s1,i+1,s2,j,result+s1.charAt(i));
		}
		if(j<s2.length()) {
			printInterLeaving(s1,i,s2,j+1,result+s2.charAt(j));
		}
	}
	
	public static void main(String[] args) {
		String str1="WX";
		String str2="YZ";
		printInterLeaving(str1,0,str2,0,"");
	}
}
