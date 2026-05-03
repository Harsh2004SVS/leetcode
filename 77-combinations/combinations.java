class Solution {
        public List<List<Integer>> combine(int n, int k) {
                List<List<Integer>> result = new ArrayList<>();
                        backtrack(1, n, k, new ArrayList<>(), result);
                                return result;
                                    }

                                        private void backtrack(int start, int n, int k, List<Integer> current, List<List<Integer>> result) {
                                                // Base case: if the combination is the required size
                                                        if (current.size() == k) {
                                                                    result.add(new ArrayList<>(current));
                                                                                return;
                                                                                        }

                                                                                                // Optimization: i <= n - (k - current.size()) + 1
                                                                                                        // This ensures we only loop if there are enough numbers left to fill the remaining slots
                                                                                                                for (int i = start; i <= n; i++) {
                                                                                                                            current.add(i);            // Make a choice
                                                                                                                                        backtrack(i + 1, n, k, current, result); // Recurse to next number
                                                                                                                                                    current.remove(current.size() - 1); // Undo the choice (backtrack)
                                                                                                                                                            }
                                                                                                                                                                }
                                                                                                                                                                }
