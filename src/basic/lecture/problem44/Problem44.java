package basic.lecture.problem44;
//조이스틱
// https://campus.programmers.co.kr/tryouts/63127/challenges
//
// "JEROEN" 56
// "JAN" 23
import common.Utils;

class Solution {
    public int solution(String name) {
        int answer = 0;
        int length = name.length();
        // idx
        //JJJAAAAAAAAAAABABZ
        int index = 0;
        int move = length - 1; // 좌우 움직임 수를 체크 , 3글자면 2번 좌우로는 2번 이동하면됨
        for(int i = 0; i < name.length(); i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);
            index = i + 1; // 다음글자
            // 연속되는 A 갯수 확인
            while(index < length && name.charAt(index) == 'A'){
                index++;
            }
            // i idx
            //___AAAAA__
            move = Math.min(move, i + i + length - index);
            // i idx
            //BBBBAAAAAAAB 와 같이
            move = Math.min(move, (length - index) * 2 + i);
        }
        return answer + move; // 누적된 상하이동횟수 + 좌우이동횟수
    }
}
public class Problem44 {
    public static void main(String[] args) {
        Utils.print(new Solution().solution("JEROEN"));
        Utils.print(new Solution().solution("JAN"));
    }
}