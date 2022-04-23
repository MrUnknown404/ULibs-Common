package main.java.ulibs.common.helpers;

public class WordH {
	public static String capitalize(String str) {
		char[] chars = str.toLowerCase().toCharArray();
		boolean isPrevSplit = false;
		for (int i = 0; i < chars.length; i++) {
			if (!isPrevSplit && Character.isLetter(chars[i])) {
				chars[i] = Character.toUpperCase(chars[i]);
				isPrevSplit = true;
			} else if (Character.isWhitespace(chars[i]) || chars[i] == '.' || chars[i] == '\'' || chars[i] == '-' || chars[i] == '_') {
				isPrevSplit = false;
			}
		}
		
		return String.valueOf(chars);
	}
}
