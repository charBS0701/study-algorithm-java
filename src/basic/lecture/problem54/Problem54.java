package basic.lecture.problem54;
//k진수에서 소수 개수 구하기
// https://campus.programmers.co.kr/tryouts/63132/challenges
// 437674 3 3
// 110011 10 2
import common.Utils;

class Solution {
    public boolean isPrime(long n){
        if( n<2 ) return false;
        for( int i = 2; i <= (int)Math.sqrt(n); i++)
            if( n % i == 0) return false;
        return true;
    }
    public String toBase(int n, int k) {
        String res = "";
        while(n > 0) {
            res = n % k + res;
            n /= k;
        }
        return res;
    }
    public int solution(int n, int k) {
        // n을 k진법으로 변환 스트링 433000021000032
        // 스트링을 "0"을 split -> 배열 "433", "21", "", "", "", "32"
        // 숫자를 소수판단, 빈문자열을 제외
        int answer = 0;
        String s = toBase(n,k);
        String[] tokens = s.split("0");
        for(String token : tokens) {
            //long num = Long.parseLong(token); //"433" -> 433
            if ( token.equals("")) continue;
            if ( token.length() > 0 && isPrime( Long.parseLong(token)) ) {
                answer++;
            }
        }
        return answer;
    }
}
public class Problem54 {
    public static void main(String[] args) {
        Utils.print(new Solution().solution(437674, 3));
        Utils.print(new Solution().solution(110011, 10));
    }
}