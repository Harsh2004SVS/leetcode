class Solution {
        public List<List<Integer>> permute(int[] nums) {
                List<List<Integer>> result = new ArrayList<>();
                        backtrack(result, new ArrayList<>(), nums, new boolean[nums.length]);
                                return result;
                                    }

                                        private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, boolean[] used) {
                                                // Base case: if current permutation is complete
                                                        if (tempList.size() == nums.length) {
                                                                    result.add(new ArrayList<>(tempList));
                                                                                return;
                                                                                        }

                                                                                                for (int i = 0; i < nums.length; i++) {
                                                                                                            // Skip if element is already in the current permutation
                                                                                                                        if (used[i]) continue;

                                                                                                                                    // Choose the element
                                                                                                                                                used[i] = true;
                                                                                                                                                            tempList.add(nums[i]);

                                                                                                                                                                        // Explore further
                                                                                                                                                                                    backtrack(result, tempList, nums, used);

                                                                                                                                                                                                // Backtrack: remove the element and mark as unused
                                                                                                                                                                                                            used[i] = false;
                                                                                                                                                                                                                        tempList.remove(tempList.size() - 1);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    }

