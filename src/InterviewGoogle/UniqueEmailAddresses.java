package InterviewGoogle;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public static void main(String[] args) {
        // String[] emails = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        String[] emails = {"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"};
        System.out.print(numUniqueEmails(emails));
    }

    static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String[] separated = email.split("@");
            StringBuilder sb = new StringBuilder();
            separated[0] = separated[0].replace(".", "");
            if (separated[0].contains("+")) {
                int addIndex = separated[0].indexOf("+");
                separated[0] = separated[0].substring(0, addIndex);
            }
            sb.append(separated[0]).append("@").append(separated[1]);
            set.add(sb.toString());
        }
        return set.size();
    }
}
