public class Solution {
	public static String encode(String secretInformation) {
		String secretInformationArr[] = secretInformation.split(" ");
		int numOfWords = secretInformationArr.length;
		String encodedInformation = "" + numOfWords;
		for (int i = 0; i < numOfWords; i++) {
			encodedInformation += "!" + secretInformationArr[i].length();
		}
		encodedInformation += "!";
		for (int i = 0; i < numOfWords; i++) {
			String temp = "";
			for (int j = 0; j < secretInformationArr[i].length(); j++) {
				temp += ((char) ((int) secretInformationArr[i].charAt(j) + 3));
			}
			encodedInformation += temp + "!";
		}
		return encodedInformation;
	}

	public static String decode(String encodedInformation) {
		String decodedStr = "";
		int i = 0;
		int numOfWords = 0;
		while (encodedInformation.charAt(i) != '!') {
			numOfWords = numOfWords * 10 + (encodedInformation.charAt(i) - '0');
			i++;
		}
		i++;
		int lengthOfEachWord[] = new int[numOfWords];
		for (int j = 0; j < numOfWords; j++) {
			int tempLength = 0;
			while (encodedInformation.charAt(i) != '!') {
				tempLength = tempLength * 10 + (encodedInformation.charAt(i) - '0');
				i++;
			}
			lengthOfEachWord[j] = tempLength;
			i++;
		}
		for (int j = 0; j < numOfWords; j++) {
			String temp = "";
			for (int k = 0; k < lengthOfEachWord[j]; k++) {
				temp += ((char) ((int) encodedInformation.charAt(i) - 3));
				i++;
			}
			i++;
			decodedStr += temp + " ";
		}
		return decodedStr.trim();
	}
}
