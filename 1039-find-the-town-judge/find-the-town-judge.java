class Solution {
        public int findJudge(int n, int[][] trust) {
                // If there's only one person and no trust relationships, they are the judge
                        if (trust.length < n - 1) {
                                    return n == 1 ? 1 : -1;
                                            }

                                                    // trustCounts[i] will store: (number of people who trust i) - (number of people i trusts)
                                                            int[] trustCounts = new int[n + 1];

                                                                    for (int[] relation : trust) {
                                                                                int a = relation[0];
                                                                                            int b = relation[1];
                                                                                                        
                                                                                                                    // a trusts someone, so decrement their score
                                                                                                                                trustCounts[a]--;
                                                                                                                                            // b is trusted by someone, so increment their score
                                                                                                                                                        trustCounts[b]++;
                                                                                                                                                                }

                                                                                                                                                                        // The judge must have a net score of exactly n - 1
                                                                                                                                                                                for (int i = 1; i <= n; i++) {
                                                                                                                                                                                            if (trustCounts[i] == n - 1) {
                                                                                                                                                                                                            return i;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                        return -1;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            }
