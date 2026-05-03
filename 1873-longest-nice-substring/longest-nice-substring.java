class Solution {
        public String longestNiceSubstring(String s) {
                if (s.length() < 2) return "";
                        
                                // Use a Set to store all characters present in the current string
                                        Set<Character> set = new HashSet<>();
                                                for (char c : s.toCharArray()) {
                                                            set.add(c);
                                                                    }
                                                                            
                                                                                    for (int i = 0; i < s.length(); i++) {
                                                                                                char c = s.charAt(i);
                                                                                                            // If the partner (upper/lower) is missing, this is a split point
                                                                                                                        if (set.contains(Character.toUpperCase(c)) && set.contains(Character.toLowerCase(c))) {
                                                                                                                                        continue;
                                                                                                                                                    }
                                                                                                                                                                
                                                                                                                                                                            // Recursively check the left and right parts
                                                                                                                                                                                        String left = longestNiceSubstring(s.substring(0, i));
                                                                                                                                                                                                    String right = longestNiceSubstring(s.substring(i + 1));
                                                                                                                                                                                                                
                                                                                                                                                                                                                            // Return the longer one (or the earlier one if tied)
                                                                                                                                                                                                                                        return left.length() >= right.length() ? left : right;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                // If no "bad" character was found, the whole string is nice
                                                                                                                                                                                                                                                                        return s;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            }
