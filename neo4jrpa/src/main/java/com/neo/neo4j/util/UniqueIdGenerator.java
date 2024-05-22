package com.neo.neo4j.util;

import java.security.SecureRandom;
import java.util.Base64;
import java.util.Calendar;
import java.util.Random;
import java.util.UUID;


public class UniqueIdGenerator {
	
	private long uniqueIdCounter;
	private static UniqueIdGenerator genarator;

	static {
		genarator = new UniqueIdGenerator();
	}

	public static UniqueIdGenerator getInstance() {
		return genarator;
	}

	private UniqueIdGenerator() {

	}
	public static long randomNumber() {
	long theRandomNum = (long) (Math.random()*Math.pow(10,10));
	return theRandomNum;
	}
	
	public static String generateRandomString(int length) {
        String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
        String CHAR_UPPER = CHAR_LOWER.toUpperCase();
        String NUMBER = "0123456789";

        String DATA_FOR_RANDOM_STRING = NUMBER +  CHAR_UPPER ;
        SecureRandom random = new SecureRandom();
    
        if (length < 1) throw new IllegalArgumentException();

        StringBuilder sb = new StringBuilder(length);
        
        for (int i = 0; i < length; i++) {
            // 0-62 (exclusive), random returns 0-61
            int rndCharAt = random.nextInt(DATA_FOR_RANDOM_STRING.length());
            char rndChar = DATA_FOR_RANDOM_STRING.charAt(rndCharAt);

            sb.append(rndChar);
        }

        return sb.toString();
    }

	public synchronized String createUniqueId() {
		StringBuffer sb = new StringBuffer(25);

		// CCYYMMDDHHMMSSmmm
		Calendar myCal = Calendar.getInstance();
		sb.append(formatNumberToString(myCal.get(Calendar.YEAR), 4, "0"));
		sb.append(formatNumberToString((myCal.get(Calendar.MONTH) + 1), 2, "0"));
		sb.append(formatNumberToString(myCal.get(Calendar.DATE), 2, "0"));
		sb.append(formatNumberToString(myCal.get(Calendar.HOUR_OF_DAY), 2, "0"));
		sb.append(formatNumberToString(myCal.get(Calendar.MINUTE), 2, "0"));
		sb.append(formatNumberToString(myCal.get(Calendar.SECOND), 2, "0"));
		sb.append(formatNumberToString(myCal.get(Calendar.MILLISECOND), 3, "0"));

		// Room for 4-digit PID//
		sb.append(strZero(convertToBase62(new Random().nextInt()), 4, "L"));

		// Room for 4-digit numeric counter
		sb.append(formatNumberToString(this.uniqueIdCounter, 4, "0"));

		if (this.uniqueIdCounter < 9999)
			this.uniqueIdCounter++;
		else
			this.uniqueIdCounter = 0;

		return sb.toString();
	}

	private String formatNumberToString(long number, int length, String padWith) {
		StringBuffer buf = new StringBuffer((new Long(number)).toString());

		if (buf.length() > length) {
			buf = new StringBuffer(buf.substring((buf.length() - length)));

		} else {
			while (buf.length() < length)
				buf.insert(0, padWith);
		}

		return buf.toString();
	}

	private String convertToBase62(int num) {
		String result = "";

		try {
			String base62Str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
			int workingInt = num;
			if (workingInt < 0)
				workingInt = workingInt * -1;
			int remainder;
			while (workingInt != 0) {
				remainder = workingInt - (workingInt / 62) * 62;
				result = base62Str.charAt(remainder) + result;
				workingInt = workingInt / 62;
			}
			if (result.length() > 4)
				result = result.substring(0, 4);

		} catch (Exception ex) {
			result = null;
			ex.printStackTrace();
		}

		return result;
	}

	private static String strZero(String strVal, int stringLen, String side) {
		String stringText;
		if (strVal.indexOf(".") == strVal.length() - 2)
			strVal += "0";
		if (side.equals("R"))
			stringText = strVal + replString("0", stringLen - strVal.length());
		else
			stringText = replString("0", stringLen - strVal.length()) + strVal;
		return stringText;
	}

	private static String replString(String charVal, int stringLen) {
		String retVal = "";
		int counter = 1;
		for (counter = 0; counter < stringLen; counter++)
			retVal += charVal;
		return retVal;
	}

	public String get6digitUniqueId() {
		return getAlphaNumeric(6);
	}
	
	public String getUniqueId(String prepend,int len) {
		return prepend+getAlphaNumeric(len);
	}

	public static  String getAlphaNumeric(int len) {
		char[] ch = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] c = new char[len];
		SecureRandom random = new SecureRandom();
		for (int i = 0; i < len; i++) {
			c[i] = ch[random.nextInt(ch.length)];
		}

		return new String(c).toUpperCase();
	}
	
	    public static int generateNumericId(int len) {
	        char[] digits = "0123456789".toCharArray();
	        int result = digits[new SecureRandom().nextInt(digits.length)] - '0';
	        SecureRandom random = new SecureRandom();

	        for (int i = 0; i < len; i++) {
	            int digit = digits[random.nextInt(digits.length)] - '0';
	            result = result * 10 + digit;
	        }

	        return result;
	    }
	    
	    public static String generateUniqueId() {
	        return UUID.randomUUID().toString();
	    }
	    
	
	
	
	static String getAlphaNumericString(int n) {

		// chose a Character random from this String
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

		// create StringBuffer size of AlphaNumericString
		StringBuilder sb = new StringBuilder(n);

		for (int i = 0; i < n; i++) {

			// generate a random number between
			// 0 to AlphaNumericString variable length
			int index = (int) (AlphaNumericString.length() * Math.random());

			// add Character one by one in end of sb
			sb.append(AlphaNumericString.charAt(index));
		}

		return sb.toString().toUpperCase();
	}
	
	public String getAlphaNumerical(int len) {
		StringBuffer sb = new StringBuffer(len);

		// CCYYMMDDHHMMSSmmm
		Calendar myCal = Calendar.getInstance();
		sb.append(formatNumberToString(myCal.get(Calendar.YEAR), 4, "0"));
		sb.append(formatNumberToString((myCal.get(Calendar.MONTH) + 1), 2, "0"));
		sb.append(formatNumberToString(myCal.get(Calendar.DATE), 2, "0"));
		sb.append(formatNumberToString(myCal.get(Calendar.HOUR_OF_DAY), 2, "0"));
		sb.append(formatNumberToString(myCal.get(Calendar.MINUTE), 2, "0"));
		sb.append(formatNumberToString(myCal.get(Calendar.SECOND), 2, "0"));
		sb.append(formatNumberToString(myCal.get(Calendar.MILLISECOND), 3, "0"));

		return new String(sb);
	}
	public synchronized String createUniqueId(int length) {
		StringBuffer sb = new StringBuffer(length);

		// CCYYMMDDHHMMSSmmm
		Calendar myCal = Calendar.getInstance();
		sb.append(formatNumberToString(myCal.get(Calendar.YEAR), 4, "0"));
		sb.append(formatNumberToString((myCal.get(Calendar.MONTH) + 1), 2, "0"));
		sb.append(formatNumberToString(myCal.get(Calendar.DATE), 2, "0"));
		sb.append(formatNumberToString(myCal.get(Calendar.HOUR_OF_DAY), 2, "0"));
		sb.append(formatNumberToString(myCal.get(Calendar.MINUTE), 2, "0"));
		sb.append(formatNumberToString(myCal.get(Calendar.SECOND), 2, "0"));
		sb.append(formatNumberToString(myCal.get(Calendar.MILLISECOND), 3, "0"));

		// Room for 4-digit PID//
		sb.append(strZero(convertToBase62(new Random().nextInt()), 4, "L"));

		// Room for 4-digit numeric counter
		sb.append(formatNumberToString(this.uniqueIdCounter, 4, "0"));

		if (this.uniqueIdCounter < 9999)
			this.uniqueIdCounter++;
		else
			this.uniqueIdCounter = 0;

		return sb.toString();
	}
	public static void main(String[] args) {
		//System.out.println(new UniqueIdGenerator().getUniqueId("C", 8));
		
		//System.out.println(generateRandomString(6));
		

        // create a sample String to encode
        String sample1 = "1231212121";
        
        String sample1Base64format
        = Base64.getEncoder()
              .encodeToString(sample1.getBytes());
        System.out.println("sample1Base64format:\n"
                + sample1Base64format);
       
        byte[] actualByte = Base64.getDecoder()
                .decode(sample1Base64format);

        String actualString = new String(actualByte);
        
       System.out.println("actualString-"
                + actualString);

	}

	
	/*
	 * public static int get6DigitUniqueNumber() { SecureRandom rnd = new
	 * SecureRandom(); return rnd.nextInt(100000, 999999); }
	 */
}
