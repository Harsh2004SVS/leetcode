class Solution {
        public int findJudge(int n, int[][] trust) {
                
                        if (trust.length < n - 1) {
                                    return n == 1 ? 1 : -1;
                                            }

                                                   
                                                            int[] trustCounts = new int[n + 1];

                                                                    for (int[] relation : trust) {
                                                                                int a = relation[0];
                                                                                            int b = relation[1];
                                                                                                        
                                                                                                                    
                                                                                                                                trustCounts[a]--;
                                                                                                                                            
                                                                                                                                                        trustCounts[b]++;
                                                                                                                                                                }

                                                                                                                                                                       
                                                                                                                                                                                for (int i = 1; i <= n; i++) {
                                                                                                                                                                                            if (trustCounts[i] == n - 1) {
                                                                                                                                                                                                            return i;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                        return -1;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            }
