package _01_StringBuilder;


public class _03_StringBuilder {
    static StringBuilder strBuilder;
    public static String append(String str, char[] characters) {
    	strBuilder = new StringBuilder(str);
    	
    	strBuilder.append(characters);
    	
        return strBuilder.toString();
    }
    
    public static String reverse(String str) {
    	strBuilder = new StringBuilder(str);
    	strBuilder.reverse();
        return strBuilder.toString();
    }
    
    public static String insert(String str, int index, char newChar) {
    	strBuilder = new StringBuilder(str);
        return strBuilder.insert(index, newChar).toString();
    }
    
    public static String delete(String str, int startIndex, int endIndex) {
    	strBuilder = new StringBuilder(str);
        return strBuilder.delete(startIndex, endIndex).toString();
    }
}