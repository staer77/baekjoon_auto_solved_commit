class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        String[] array = code.split("");
        for (int i = 0; i < array.length; i++) {
            if (i % q == r) {
                answer += array[i];
            }
        }
        return answer;
    }
}