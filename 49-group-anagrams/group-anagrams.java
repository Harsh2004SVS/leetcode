class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
                if (strs == null || strs.length == 0) return new ArrayList<>();
                        
                                Map<String, List<String>> map = new HashMap<>();
                                        
                                                for (String s : strs) {
                                                            // Sort the string to create a unique key for anagrams
                                                                        char[] ca = s.toCharArray();
                                                                                    Arrays.sort(ca);
                                                                                                String key = String.valueOf(ca);
                                                                                                            
                                                                                                                        // If the key isn't in the map, initialize the list
                                                                                                                                    if (!map.containsKey(key)) {
                                                                                                                                                    map.put(key, new ArrayList<>());
                                                                                                                                                                }
                                                                                                                                                                            
                                                                                                                                                                                        // Add the original string to the matching group
                                                                                                                                                                                                    map.get(key).add(s);
                                                                                                                                                                                                            }
                                                                                                                                                                                                                    
                                                                                                                                                                                                                            return new ArrayList<>(map.values());
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                }
