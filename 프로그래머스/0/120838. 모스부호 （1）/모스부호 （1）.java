class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder sb = new StringBuilder();
        for(String l : letter.split(" ")){
            for(int i = 0; i < morse.length; i++){
                if(morse[i].equals(l)){
                    sb.append((char)(i + 97));
                }
            }
        }
        return sb.toString();
    }
}