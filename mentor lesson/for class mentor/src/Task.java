public class Task {
    public static void main(String[] args) {
        System.out.println(numberOfWords("Lorem Ipsum is simply dummy text of the printing and " +
                "typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever " +
                "since the 1500s, when an unknown printer took a galley of type and scrambled it to " +
                "make a type specimen book. It has survived not only five centuries, but also the " +
                "leap into electronic typesetting, remaining essentially unchanged."));

        System.out.println(charOccurrences("lorem ipsum is simply dummy text of the printing and",'i'));
    }
    public static int numberOfWords(String text) {

        String[] words = text.split(" ");


        return words.length;
    }

    public static int charOccurrences(String text2, char target){
        int count = 0;
        char[] charArray = text2.toCharArray();
        for (int i = 0; i <charArray.length ; i++) {
            if (charArray[i] == target){
                count++;
            }
        }
        return count;
    }
}
