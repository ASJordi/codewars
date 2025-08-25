package kyu6;

public class BasicEncryption {

    public String encrypt(String text, int rule) {
	StringBuilder sb = new StringBuilder();

	for (char c : text.toCharArray()) {
	    char tmp = (char) ((c + rule) % 256);
	    sb.append(tmp);
	}
	
	return sb.toString();
    }

}
