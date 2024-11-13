package LinearSearch;

public class SearchInString {
    public static int searchString(String str, char target) {
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        String str = "Lokesh";

        int index = searchString(str, 'k');

        if (index == -1) {
            System.out.println("Targeted value not found in the string");
        } else {
            System.out.println("Targeted value is present at index :" + index);
        }
    }
}
