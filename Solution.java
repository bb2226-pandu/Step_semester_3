class Solution {
    public void checkVotingEligibility(int age) {
        boolean eligible = age >= 18;

        if (eligible) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        sol.checkVotingEligibility(20);
        sol.checkVotingEligibility(16);
    }
}