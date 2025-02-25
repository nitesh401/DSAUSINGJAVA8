public class SpecialCharacterFinder {
    public static void main(String[] args) {
        String str = "Hello@World#123!";
        
        for (char ch : str.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) { 
                System.out.println("Special Character Found: " + ch);
            }
        }
    }
}
