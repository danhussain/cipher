import java.util.ArrayList;

class cipher {

	public static void main(String[] args) {
		encrypt("Hello"); /* For testing purposes */
	}

	private static void encrypt(String encode) { // Method to encode an abitrary string
		ArrayList<Integer> cip = new ArrayList<Integer>();
		String str = encode.toLowerCase();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			int ind = ch - 'a';
			int encr = ind + 3;
			cip.add(encr);
		}
		decrypt(cip); /* For testing purposes */
	} // END encrypt

	private static void decrypt(ArrayList<Integer> decode) { // Method to decode an arbitrary string
		String message = "";
		for(int i=0; i<decode.size(); i++) {
			int encr = decode.get(i) - 3;
			int ind = encr + 'a';
			char ch = (char) ind;
			message += ch;
		}
	} // END decrypt
} // END cipher