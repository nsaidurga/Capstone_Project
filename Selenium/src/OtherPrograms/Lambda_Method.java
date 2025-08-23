package OtherPrograms;

interface StrFun{
	String run(String str);
}

public class Lambda_Method {

	public static void main(String[] args) {
		StrFun exclaim=(s)->s+"!!";
		StrFun query=(s)->s+"??";
		askquery("Hello",exclaim);
		askquery("Hello",query);
	}
	public static void askquery(String str,StrFun format) {
		String res=format.run(str);
		System.out.println(res);
	}
}
