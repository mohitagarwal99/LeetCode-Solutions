class Solution {
    public double myPow(double x, int n) {
        if(n < 0)
            return calculatePos(1/x, Long.valueOf(n));
        return calculatePos(x, Long.valueOf(n));
    }
    public double calculatePos(double x, Long n){
        if(n == 0)
            return 1;
        if(n == 1 || n == -1)
            return x;
        double ans = calculatePos(x*x, n/2);
        if(n % 2 == 1 || n % 2 == -1){
            return (ans * x) % (2e31 - 1);
        }
        else
        return ans % (2e31 - 1);
    }
    // public double calculateNeg(double x, int n){
    //     if(n == 0)
    //         return 1;
    //     if(n == 1)
    //         return 1/x;
    //     System.out.println('a');
    //     double ans = calculateNeg(1/x * 1/x, n/2);
    //     System.out.println(n + "b " + ans);
    //     if(n % 2 == 1){
    //         return ans * 1/x;
    //     }
    //     else
    //     return ans;
    // }
}