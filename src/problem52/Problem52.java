package problem52;
//수박수박수박수박수박수?
//https://campus.programmers.co.kr/tryouts/63130/challenges
//3	"수박수"
//4	"수박수박"
import common.Utils;

class Solution {
    public String solution(int n) {
        String answer = "";

        for (int i=0; i<n; i++) {
            answer += i%2 == 0 ? "수" : "박";
        }
        return answer;
    }
}   // 자바에선 문자열을 계속 더하는 것은 효율성이 덜어짐
// StringBuffer 이용하면 효율적임

class Solution2 {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            answer.append((i % 2 == 0) ? "수" : "박");
        }
        return answer.toString();
    }
}   // StringBuilder 이용

public class Problem52 {
    public static void main(String[] args) {
        Utils.print(new problem52.Solution().solution(3));
    }
}
