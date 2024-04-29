class Solution {
    public String solution(String b1, String b2) {
        StringBuilder sb = new StringBuilder();
        int sum1 = 0;
        int sum2 = 0;
        
        // b1을 10진수로 변환
        for(int i = 0; i < b1.length(); i++){
            if(b1.charAt(i) == '1'){
                sum1 += (int) Math.pow(2,b1.length()-1-i);
            }
        }
        
        // b2를 10진수로 변환
        for(int i = 0; i < b2.length(); i++){
            if(b2.charAt(i) == '1'){
                sum2 += (int) Math.pow(2,b2.length()-1-i);
            }
        }
        // 두 수의 합 구하기
        int res = sum1+sum2;
        
        // 두 수의 합을 다시 2진수로 변환
        while(res > 0){
            if(res % 2 == 0){
                sb.append(0);
            }else{
                sb.append(1);
            }
            res /= 2;
        }
        sb.reverse();
        if(sb.length() == 0){
            sb.append(0);
        }
        
        // 역순정렬
        return sb.toString();
    }
}