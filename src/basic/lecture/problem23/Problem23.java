package basic.lecture.problem23;
//더 맵게
// https://campus.programmers.co.kr/courses/16066/lessons/148390
// [1, 2, 3, 9, 10, 12] 7 2
import common.Utils;
import java.util.* ;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue();
// pq.add(10);
// pq.add(60);
// pq.add(5);
//
// int k = pq.poll(); // 삭제, get
// pq.peek() // 살펴만 봄
// pq.size() //
        //[5, 9]
        //[5, 15] 30
        //[5+30=35] 30
        for(int s : scoville) pq.add(s);
        int anawer = 0;
        // 6, 10보다는 큰 숫자
        while ( pq.peek() < K ) {
            if ( pq.size() < 2 ) {
                anawer = -1;
                break;
            }
            // 음식을 섞는다.
            int s1 = pq.poll();
            int s2 = pq.poll();
            pq.add(s1 + s2 * 2);
            anawer++;
        }
        return anawer;
    }
}
public class Problem23 {
    public static void main(String[] args) {
        Utils.print(new Solution().solution( new int[]{1, 2, 3, 9, 10, 12}, 7));
    }
}