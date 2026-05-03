public class Solution {
        // you need treat n as an unsigned value
            public int reverseBits(int n) {
                    int result = 0;
                            for (int i = 0; i < 32; i++) {
                                        // 1. Shift result to the left to make room for the next bit
                                                    result <<= 1;
                                                                
                                                                            // 2. Isolate the last bit of n using bitwise AND (&)
                                                                                        // 3. Add that bit to the end of result using bitwise OR (|)
                                                                                                    result |= (n & 1);
                                                                                                                
                                                                                                                            // 4. Shift n to the right to process the next bit
                                                                                                                                        // Use >>> for unsigned shift to handle negative numbers
                                                                                                                                                    n >>>= 1;
                                                                                                                                                            }
                                                                                                                                                                    return result;
                                                                                                                                                                        }
                                                                                                                                                                        }
