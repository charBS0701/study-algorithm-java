package basic.lecture.problem42;
// 최대공약수와 최소공배수
// https://campus.programmers.co.kr/app/courses/16066/parts/37167/lessons/148400/
// 3, 12    [3,12]
// 2, 5  [1,10]
import common.Utils;

class Solution {
    // 유클리드호제법 - 최대공약수
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    // 최소공배수
    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    public int[] solution(int n, int m) {
//      int[] ret = new int[2];
//      ret[0] = gcd(n, m);
//      ret[1] = lcm(n, m);
//      return ret;
        return new int[]{gcd(n, m), lcm(m,n)};
    }
}
public class Problem42 {
    public static void main(String[] args) {
        Utils.print(new Solution().solution(3,12));
        Utils.print(new Solution().solution(2,5));
    }
}