package basic.lecture.problem43;
// 크레인 인형뽑기
// https://campus.programmers.co.kr/tryouts/63126/challenges
// 입력
// [[0,0,0,0,0]
// ,[0,0,1,0,3]
// ,[0,2,5,0,1]
// ,[4,2,4,4,2]
// ,[3,5,1,3,1]]
// , [1,5,3,5,1,2,1,4]
// 출력 4
import common.Utils;

import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        for ( int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move-1] != 0) {  // 인형뽑기
                    if ((!basket.empty() )&&(basket.peek() == board[i][move-1])) {   // 바스켓이 비지않고 top이 뽑을 인형과 같다면
                            basket.pop();
                            answer += 2;
                    } else basket.add(board[i][move-1]);    // basket에 추가
                    board[i][move-1] = 0;   // board에서 인형뽑아감
                    break;
                }
            }
        }
        return answer;
    }

//    public int solution2(int[][] board, int[] moves) {
//        int answer = 0;
//        Stack<Integer> stack = new Stack<>();
//        for (int move : moves) {
//            for (int j = 0; j < board.length; j++) {
//                if (board[j][move - 1] != 0) {
//                    if ((!stack.empty()) && (stack.peek() == board[j][move - 1])) {
//                        stack.pop();
//                        answer += 2;
//                    } else {
//                        stack.push(board[j][move - 1]);
//                    }
//                    board[j][move - 1] = 0;
//                    break;
//                }
//            }
//        }
//        return answer;
//    }
}
public class Problem43 {
    public static void main(String[] args) {
        Utils.print(new basic.lecture.problem43.Solution().solution(
                new int[][] {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}},
                new int[] {1,5,3,5,1,2,1,4}
        ));
    }
}