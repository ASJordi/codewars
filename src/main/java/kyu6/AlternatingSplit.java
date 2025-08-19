package kyu6;

public class AlternatingSplit {

    public static String encrypt(final String text, final int n) {
	if (text == null || text.isBlank() || n < 0) return text;

	StringBuilder sb = new StringBuilder(text);

	for (int i = 0; i < n; i++) {
	    StringBuilder odd = new StringBuilder();
	    StringBuilder even = new StringBuilder();

	    for (int j = 0; j < sb.length(); j++) {
		if (j % 2 == 0) even.append(sb.charAt(j));
		else odd.append(sb.charAt(j));
	    }

	    sb = odd.append(even);
	}

	return sb.toString();
    }
    

    public static String decrypt(final String encryptedText, final int n) {
	if (encryptedText == null || encryptedText.isBlank() || n < 0) return encryptedText;
	
	StringBuilder sb = new StringBuilder(encryptedText);
	int len = sb.length();
	int startOdd, startEven;
	boolean isEven = false;

	if (len % 2 == 0) {
	    startEven = len / 2;
	    startOdd = len / 2;
	    isEven = true;
	} else {
	    startEven = (len + 1) / 2;
	    startOdd = (len - 1) / 2;
	}

	for (int i = 0; i < n; i++) {
	    var evenStr = isEven ? sb.substring(startEven) : sb.substring(startEven - 1);
	    var oddStr = sb.substring(0, startOdd);
	    StringBuilder tmp = new StringBuilder();
	    
	    for (int j = 0; j < Math.min(evenStr.length(), oddStr.length()); j++) {
		tmp.append(evenStr.charAt(j));
		tmp.append(oddStr.charAt(j));
	    }

	    if (evenStr.length() > oddStr.length()) tmp.append(evenStr.substring(oddStr.length()));
	    else tmp.append(oddStr.substring(evenStr.length()));
	    
	    sb = tmp;
	}
	
	return sb.toString();
    }

}
