class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0;  // Pointer to write compressed result
        int read = 0;   // Pointer to traverse array

        while (read < n) {
            char currentChar = chars[read];
            int count = 0;

            // Count consecutive occurrences of currentChar
            while (read < n && chars[read] == currentChar) {
                read++;
                count++;
            }

            // Write the character
            chars[write++] = currentChar;

            // Write the count if greater than 1
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}
