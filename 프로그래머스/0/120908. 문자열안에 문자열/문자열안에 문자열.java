class Solution {
    public int solution(String str1, String str2) {
        boolean check = false;
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        for(int i=0;i<=c1.length - c2.length;i++){
            if(c1[i]==c2[0]){
                for(int j=0; j<c2.length;j++){
                    if(c1[i+j]!=c2[j]){
                        check = false;
                        break;
                    } else if(j == c2.length-1){
                        check = true;
                    }
                }
                if(check){break;}
            }
        }
        return check ? 1 : 2;
    }
}