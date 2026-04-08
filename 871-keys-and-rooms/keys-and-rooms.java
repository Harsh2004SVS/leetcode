import java.util.*;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            // Track rooms we have entered
                    Set<Integer> visited = new HashSet<>();
                            visited.add(0);
                                    
                                            // Stack to manage keys we need to process
                                                    Stack<Integer> stack = new Stack<>();
                                                            stack.push(0);
                                                                    
                                                                            while (!stack.isEmpty()) {
                                                                                        int currentRoom = stack.pop();
                                                                                                    
                                                                                                                // Look at all keys in the current room
                                                                                                                            for (int key : rooms.get(currentRoom)) {
                                                                                                                                            // If we haven't visited the room this key belongs to
                                                                                                                                                            if (!visited.contains(key)) {
                                                                                                                                                                                visited.add(key);
                                                                                                                                                                                                    stack.push(key);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                        // If the number of visited rooms equals the total number of rooms
                                                                                                                                                                                                                                                                return visited.size() == rooms.size();
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    }