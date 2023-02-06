package testProblem;

import common.Utils;

class Solutuion {
    public int solution(int k) {
        return k;
    }
}

public class TestProblem {
    public static void main(String[] args) {
        // Solutuion sol = new Solutuion();
        // System.out.println(sol.solution(5));
        Utils.print(new Solutuion().solution(5));
        Utils.print(new Solutuion().solution(7));

        System.out.println(new Solutuion().solution(5));
        System.out.println(new Solutuion().solution(10));

    }
}

