public class Shortest {
    public static String getShortestWord(String sentence) {
        if (sentence == null || sentence.isBlank()) {
            return "";
        }

        String[] words = sentence.trim().split("\\s");
        String shortest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }

        return shortest;
    }
}

