class Solution {
    public String firstNonRepeating(String s) {
        int[] freq = new int[26];          // frequency of characters
        StringBuilder sb = new StringBuilder();
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // update frequency
            freq[ch - 'a']++;

            // add current character to queue
            q.add(ch);

            // remove repeating characters from front
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.poll();
            }

            // decide answer for this prefix
            if (q.isEmpty()) {
                sb.append('#');
            } else {
                sb.append(q.peek());
            }
        }

        return sb.toString();
    }
}
