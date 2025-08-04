package kyu7;

public class UglifyWord {

    public static String uglifyWord(String str) {
	StringBuilder sb = new StringBuilder();
	boolean flag = true;
	
	for (int i = 0; i < str.length(); i++) {
	    char c = str.charAt(i);
	    
	    if (Character.isAlphabetic(c)) {
		c = flag ? Character.toUpperCase(c) : Character.toLowerCase(c);
		flag = !flag;
	    } else flag = true;
	    
	    sb.append(c);
	}
	
	return sb.toString();
    }

}
