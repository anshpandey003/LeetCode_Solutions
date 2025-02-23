class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        String vowels = "aeiouAEIOU";

        while (i < j) { // Ensure i is always less than j
            while (i < j && vowels.indexOf(c[i]) == -1) i++;  // Move i to next vowel
            while (i < j && vowels.indexOf(c[j]) == -1) j--;  // Move j to previous vowel

            // Swap vowels
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;

            // Move both pointers inward
            i++;
            j--;
        }
        return new String(c);
    }
}