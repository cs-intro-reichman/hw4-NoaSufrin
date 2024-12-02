public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        String ans = "";
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                char ch = (char) (str.charAt(i) + 32); 
                ans = ans + ch;
            } else {
                ans = ans + str.charAt(i);
            }
            i++;
        }
        return ans;
    }

    public static boolean strEqual (String substring, String str2) {
        for (int i = 0; i < substring.length(); i++) {
            if (substring.charAt(i) != str2.charAt(i)) {
                return false;
            }            
        }
        return true;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        if (str2 == "") {
            return true;
        }

        if (str2.length() > str1.length()) {
            return false;
        }
        for (int i = 0; i < str1.length() - str2.length(); i++) {
            if (str2.charAt(0) == str1.charAt(i)) {
               String substring = str1.substring(i, i + str2.length());
                if (strEqual(substring, str2)) {
                    return true;
                }
            }   
        }
        return false;
    }
}
