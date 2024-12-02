public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    public static boolean strEqual (String substring, String str2) {
        for (int i = 0; i < substring.length(); i++) {
            if (substring.charAt(i) != str2.charAt(i)) {
                return false;
            }            
        }
        return true;
    }

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

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        // Replace this comment with your code

        for (int i = 0; i < sentences.length; i++) {
            for (int j = 0; j < keywords.length; j++) {
                if (contains(sentences[i], keywords[j])) {
                    System.out.println(sentences[i]);
                }
            }
        }
    }
}
