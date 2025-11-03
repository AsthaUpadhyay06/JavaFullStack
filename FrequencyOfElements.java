public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 3, 4, 5, 2};
        int[] freq = new int[arr.length]; // to store frequency
        int visited = -1;  // marker for counted elements

        for (int i = 0; i < arr.length; i++) {
            int count = 1;   // start counting current element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited; // mark duplicate as visited
                }
            }
            if (freq[i] != visited)
                freq[i] = count;
        }

        System.out.println("Element | Frequency");
        for (int i = 0; i < arr.length; i++) {
            if (freq[i] != visited) {
                System.out.println("   " + arr[i] + "   |   " + freq[i]);
            }
        }
    }
}
