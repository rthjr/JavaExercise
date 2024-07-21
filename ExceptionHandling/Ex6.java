public class Ex6 {
    public static void main(String[] args) {
        try {
            System.out.println(hex2Binary("1A3F")); // Valid hex string: should print "Valid hex string"
            System.out.println(hex2Binary("GHIJ")); // Invalid hex string: should throw exception
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String hex2Binary(String hex) throws NumberFormatException {
        // String containing all valid hexadecimal characters
        String validHexChars = "0123456789ABCDEFabcdef";

        // Check each character in the input string
        for (char hexChar : hex.toCharArray()) {
            if (validHexChars.indexOf(hexChar) == -1) {
                throw new NumberFormatException("Invalid hex string: " + hex);
            }
        }

        return "Valid hex string: " + hex;
    }
}
