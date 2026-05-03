class Solution {
        public int minCostClimbingStairs(int[] cost) {
                int n = cost.length;
                        int prev2 = 0; // Cost to reach 2 steps back
                                int prev1 = 0; // Cost to reach 1 step back
                                        
                                                // We start from index 2 because we can start at index 0 or 1 for free
                                                        for (int i = 2; i <= n; i++) {
                                                                    // Min cost to reach current step is the minimum of coming from 
                                                                                // 1 step back or 2 steps back, including the cost of that step
                                                                                            int current = Math.min(prev1 + cost[i - 1], prev2 + cost[i - 2]);
                                                                                                        prev2 = prev1;
                                                                                                                    prev1 = current;
                                                                                                                            }
                                                                                                                                    
                                                                                                                                            return prev1;
                                                                                                                                                }
                                                                                                                                                }
