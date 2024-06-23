public class SmallestLetter {
    public static void main(String[] args) {

    }

    public char nextGreatestLetter(char[] letters, char target) {

            int start = 0;
            int end = letters.length - 1;

            while (start <= end) {
                // Find the mid
                //  int mid = (start+end)/2;  // might be the sum of start and end exceeds the range of int
                int mid = start + (end - start) / 2; // better way

                if (target < letters[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return letters[start % letters.length];
        }
    }

