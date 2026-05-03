import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
            // Handle edge case
                    if (strs == null || strs.length == 0) return new ArrayList<>();
                            
                                    Map<String, List<String>> map = new HashMap<>();
                                            
                                                    for (String s : strs) {
                                                                // Sort characters to create a unique key for all anagrams
                                                                            char[] ca = s.toCharArray();
                                                                                        Arrays.sort(ca);
                                                                                                    String key = String.valueOf(ca);
                                                                                                                
                                                                                                                            // If key is not present, add a new list
                                                                                                                                        if (!map.containsKey(key)) {
                                                                                                                                                        map.put(key, new ArrayList<>());
                                                                                                                                                                    }
                                                                                                                                                                                
                                                                                                                                                                                            // Add original string to the corresponding list
                                                                                                                                                                                                        map.get(key).add(s);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                        
                                                                                                                                                                                                                                return new ArrayList<>(map.values());
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    }