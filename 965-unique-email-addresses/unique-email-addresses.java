class Solution {
        public int numUniqueEmails(String[] emails) {
                // Set to store the normalized "actual" emails
                        Set<String> uniqueEmails = new HashSet<>();
                                
                                        for (String email : emails) {
                                                    // Split the email into local and domain parts
                                                                int atIndex = email.indexOf('@');
                                                                            String local = email.substring(0, atIndex);
                                                                                        String domain = email.substring(atIndex); // Keep the '@' with the domain
                                                                                                    
                                                                                                                // 1. Handle the '+' rule: ignore everything after the first '+'
                                                                                                                            if (local.contains("+")) {
                                                                                                                                            local = local.substring(0, local.indexOf('+'));
                                                                                                                                                        }
                                                                                                                                                                    
                                                                                                                                                                                // 2. Handle the '.' rule: remove all dots
                                                                                                                                                                                            local = local.replace(".", "");
                                                                                                                                                                                                        
                                                                                                                                                                                                                    // Reconstruct the normalized email and add to the set
                                                                                                                                                                                                                                uniqueEmails.add(local + domain);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                        // The size of the set represents the number of unique addresses
                                                                                                                                                                                                                                                                return uniqueEmails.size();
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    }
