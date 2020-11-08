//class containing the dynamic and simple recursive solutions to finding the nth number in the fibonnaci sequence
class Solution {
    //item i represents (i+1)th number in fibbonnaci sequence 
    public ArrayList<Long> sequence;//arraylist to serve as table for sequence
    public Solution () {
        sequence = new ArrayList<Long>();
    }
    public static long nthFibonacci(long num){
        int n = (int)num;
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            Solution soln = new Solution();
            return soln.dynamicFibonacci(n, soln.sequence);
        }
    }
    //nth fib number is at nth spot in fib
    //get fibonnaci number using dynamic programming
    public long dynamicFibonacci(int n, ArrayList<Long> sequence) {
        if (sequence.size() >= n) {//if contains n
            return sequence.get(n-1);//return nth item
        }
        else {//nth position at n-1
            buildSequence(n, sequence);
            return dynamicFibonacci(n, sequence);
        }
    }
    //function to build fibonnaci table up to long n. 
    public static void buildSequence(long n, ArrayList<Long> sequence) {
        long nMinus1Term = 1L;
        long nMinus2Term = 1L;//0, 1, 1. from 3rd term to nth term
        if (sequence.isEmpty()) {
            sequence.add(nMinus2Term);
            sequence.add(nMinus1Term);
        }//containing 2 at least
        for (int i=sequence.size(); i<n+1; i++) {//term 0 has 1st term, term n-1 has nth term
            nMinus1Term = sequence.get(i-1);
            nMinus2Term = sequence.get(i-2);
            sequence.add(nMinus1Term+nMinus2Term);
        }
    }
    //simple recursive solution to fibonacci sequence
    public static long recursiveFibonacci(long n){
        if (n == 1L) {
            return 0L;
        }
        else if (n ==2L || n == 3L) {
            return 1L;
        }
        else {
            return recursiveFibonacci(n-1L) + recursiveFibonacci(n-2L);
        }
    }
}
