class Solution {
    public int[] solution(int brown, int yellow) {
        int half = brown / 2;
        for(int i=half-1; i>2; i--){
            int width = i;
            int height = half - i + 2;
            if(isOk(width, height, yellow)){
                return new int[]{width, height};
            }
        }
        return new int[]{};
    }
    
    public boolean isOk(int width, int height, int yellow){
        return (width-2) * (height-2) == yellow;
    }
}