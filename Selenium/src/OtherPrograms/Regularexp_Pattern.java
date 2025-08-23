package OtherPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regularexp_Pattern {

	public static void main(String[] args) {
		Pattern pattern= Pattern.compile("Javacoding",Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher("Learn JavaCoding is Fun ");
		boolean matchFound=matcher.find();
		if(matchFound) {
			System.out.println("Match Found");
		}
		else {
			System.out.println("Match not found");
		}
	}

}
