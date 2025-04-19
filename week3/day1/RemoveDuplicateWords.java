package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
        String text = "We learn java basics as part of java sessions in java week1";
        String[] words = text.split(" ");
        String result = "";
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    isDuplicate = true;
                    count++;
                    break;
                }
            }

            if (!isDuplicate) {
                result += words[i] + " ";  // concatenating to result
            }
        }

        System.out.println("After removing duplicates:\n" + result.trim());
        System.out.println("Total duplicates found: " + count);
    }

}
