package OtherPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regx_Numberpattern {

	public static void main(String[] args) {
		String[] strings= {
			"123456",
			"3.55",
			"30.2",
			"asda",
			"122sdd33",
			"-877",
			"+200"
		};
		
		//regular expression for numbers to validate
		String numberPattern = "[-+]?\\d*\\.?\\d+";
		
		Pattern regex=Pattern.compile(numberPattern);
		for(String str:strings) {
			Matcher matcher=regex.matcher(str);
			if(matcher.matches()) {
				System.out.println(str+" is a valid number");
			}
			else {
				System.out.println(str+" is a invalid number");
			}
		}
	}

}
