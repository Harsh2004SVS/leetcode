import java.util.PriorityQueue;

class Solution {
    public int[][] kClosest(int[][] points, int k) {
            // Max-heap based on distance: (x^2 + y^2)
                    // We use (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]) to make it a max-heap
                            PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
                                        (a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1])
                                                );

                                                        for (int[] point : points) {
                                                                    maxHeap.add(point);
                                                                                // If heap size exceeds k, remove the point with the largest distance
                                                                                            if (maxHeap.size() > k) {
                                                                                                            maxHeap.poll();
                                                                                                                        }
                                                                                                                                }

                                                                                                                                        // Convert heap to the required 2D array output
                                                                                                                                                int[][] result = new int[k][2];
                                                                                                                                                        while (k > 0) {
                                                                                                                                                                    result[--k] = maxHeap.poll();
                                                                                                                                                                            }
                                                                                                                                                                                    
                                                                                                                                                                                            return result;
                                                                                                                                                                                                }
                                                                                                                                                                                                }