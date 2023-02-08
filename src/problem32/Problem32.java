package problem32;
//체육복
// https://campus.programmers.co.kr/tryouts/63120/challenges
// 5 [2, 4] [1, 3, 5] 5
// 5 [2, 4] [3] 4
// 3 [3] [1] 2
import common.Utils;
import java.util.* ;
import java.util.stream.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] people = new int[n];
        for (int l : lost) people[l-1]--;
        for (int r : reserve) people[r-1]++; // 0(참여만), 1(여유), -1(x)
        //[-1 1 0 0 ]
        int answer = people.length;
        for (int i = 0; i < people.length; i++) {
            if(people[i] == -1) { // 여유분이 없는데 잃어버린사람
                // 왼쪽사람에게 빌릴수 있는지, people[i]++, people[i-1]--;
                if ( (i-1>= 0) && (people[i-1] == 1) ) {
                    people[i]++;
                    people[i-1]--;
                }// 오른쪽사람에 빌릴수 있는지, people[i]++, people[i+1]--;
                else if ( (i+1 < people.length) && (people[i+1] == 1) ) {
                    people[i]++;
                    people[i+1]--;
                } else answer--;
            }
        }
        return answer;
// 0 -1 +1 -> 0
// 1 0 +1 -> 1
// 2 -1 +1 -> 0
// 3 0 -> 0
// 4 -1 ->
    }
}
public class Problem32 {
    public static void main(String[] args) {
        Utils.print(new Solution().solution(5, new int[]{2,4}, new int[]{1,3,5}));
    }
}