package javaRegexPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {

		//Pattern pattern = Pattern.compile("^\\+[9][1]\s[89][0-9]{9}$");
		//Matcher matcher = pattern.matcher("+91 9638527412");
		
		//Pattern pattern = Pattern.compile("^[a|A][g][e][n][t][\\s-.]?(\\d{3})$");
		//Pattern pattern = Pattern.compile("^[a|A]gent[\\s-.]?(\\d{3})$");
		//Matcher matcher = pattern.matcher("Agent007");
		
		//Pattern pattern = Pattern.compile("^([a-z]+.*\\d*.*)@([a-zA-Z]+[_0-9]*)\\.(com?in?)$");
		//Matcher matcher = pattern.matcher("absd#12?@xyz.com");
		
		Pattern pattern = Pattern.compile("^(\\w+)@([a-z]+)\\.(com|in)$");
		Matcher matcher = pattern.matcher("sVsd8_6@xyz.com");
		
		System.out.println(matcher.find());
		System.out.println(matcher.group(1));
		System.out.println(matcher.group(2));
		System.out.println(matcher.group(3));
		
		
	}

}
