package problem11;
//최댓값 인덱스 구하기
//https://campus.programmers.co.kr/courses/16066/lessons/148366
//입력: [1, 3, 5, 4, 5, 2, 1]
// 출력: [2, 4]
//입력: [3, 6, 10, 1, 7, 2, 4, 6, 10, 9]
// 출력: [2, 8]

import common.Utils;

class Solution {
    public int[] solution(int[] arr) {
        // 1. 최대값 구하기
        // 2. 최대값이 몇 개인지 확인하기
        // 3. 리턴 배열 만들기
        // 4. 배열에 인덱스 채우기
        int max = 0;
// for(int i = 0; i < arr.length; i++)
// if( arr[i] > max) max = arr[i+1];
        for(int a : arr)
            if(a > max) max = a;

        int count = 0;
        for(int a : arr) if(a == max) count++;

        int[] answer = new int [count];
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == max) answer[index++] = i;
        }
        return answer;
    }
}
public class Problem11 {
    public static void main(String[] args) {
        Utils.print( new Solution().solution( new int[] {1, 3, 5, 4, 5, 2, 1}));
        Utils.print( new Solution().solution( new int[] {3, 6, 10, 1, 7, 2, 4, 6, 10, 9}));
    }
}