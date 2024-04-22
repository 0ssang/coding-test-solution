import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i=0; i<genres.length; i++)
            hm.put(genres[i], hm.getOrDefault(genres[i], 0)+ plays[i]);
        ArrayList<String> genre = new ArrayList<>();
        for(String key : hm.keySet()){
            genre.add(key);
        }
        Collections.sort(genre, (x, y) -> hm.get(y) - hm.get(x));
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < genre.size(); i++){
            String g = genre.get(i);
            int max = 0;
            int firstIdx = -1;
            for(int j = 0; j < genres.length; j++){
                if(g.equals(genres[j]) && max < plays[j]){
                    max = plays[j];
                    firstIdx = j;
                }
            }
            max = 0;
            int secondIdx = -1;
            for(int j = 0; j < genres.length; j++){
                if(g.equals(genres[j]) && max < plays[j] && j != firstIdx){
                    max = plays[j];
                    secondIdx = j;
                }
            }
            
            list.add(firstIdx);
            if(secondIdx >= 0) list.add(secondIdx);
            
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}