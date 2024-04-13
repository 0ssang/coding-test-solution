class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        
        for(String s : keyinput){
            if(s.equals("left")){
                if((board[0]/2)*-1 < x)
                    x--;
            }else if(s.equals("right")){
                if(board[0]/2 > x)
                    x++;
            }else if(s.equals("up")){
                if(board[1]/2 > y)
                    y++;
            }else if(s.equals("down")){
                if((board[1]/2)*-1 < y)
                    y--;
            }
        }
        int[] res = {x, y};
        return res;
    }
}