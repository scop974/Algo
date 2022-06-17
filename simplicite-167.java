package eraser;

public class Eraser {
	public static String erase(String str) {
		String finalMsg = "";

		for (int i = 0 ; i < str.length() ; i++) {
			if (str.charAt(i) == 32) {
				if (i == 0) {
					if (str.charAt(i+1) == 32) {         
						finalMsg += str.charAt(i);       
					}      
				}
				else if(i == str.length() - 1) {
					if (str.charAt(i-1) == 32) {
						finalMsg += str.charAt(i);
					}
				}
				else if (str.charAt(i-1) == 32 || str.charAt(i+1) == 32) {
					finalMsg += str.charAt(i);
				}
			}
			else {
				finalMsg += str.charAt(i);
			}
		}

		return finalMsg;
	}
}
