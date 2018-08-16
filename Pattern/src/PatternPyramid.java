
public class PatternPyramid {
	public static String getTable(){
	String result="";
	for(int i=1;i<=5;i++){
		for(int j=5;j>=i;j--){
			result+=" ";
					}
		for(int k=1;k<=i;k++){
			result+="* ";
		}
		result+="\n";
	}
	return result;
	}
	public static void main(String[]args){
		System.out.println(getTable());
}
}