class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (myString.toLowerCase().contains(pat.toLowerCase())) {
                answer = 1;
                break;
            } else {
                answer = 0;
                break;
            }
        }
        return answer;
    }
}