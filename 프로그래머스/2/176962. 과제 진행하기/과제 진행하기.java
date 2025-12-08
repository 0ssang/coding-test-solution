import java.util.*;

class Solution {
    class Task{
        String name;
        int start;
        int duration;
        
        Task(String name, int start, int duration){
            this.name = name;
            this.start = start;
            this.duration = duration;
        }
    }
    
    public String[] solution(String[][] plans) {
        List<String> result = new ArrayList<>();
        Stack<Task> stack = new Stack<>();
        List<Task> tasks = new ArrayList<>();
        
        for(String[] plan : plans){
            tasks.add(new Task(plan[0], timeToMinutes(plan[1]), Integer.parseInt(plan[2])));
        }
        
        tasks.sort((a,b) -> a.start - b.start);
        
        for(int i=0; i<tasks.size(); i++){
            Task now = tasks.get(i);
            
            if(i == tasks.size()-1){
                result.add(now.name);
                while(!stack.isEmpty()){
                    result.add(stack.pop().name);
                }
                break;
            }
            
            Task next = tasks.get(i+1);
            
            if(now.start + now.duration < next.start){
                result.add(now.name);
                int available = next.start - (now.start + now.duration);
                
                while(!stack.isEmpty() && available > 0){
                    Task remain = stack.pop();
                    if(remain.duration <= available){
                        result.add(remain.name);
                        available -= remain.duration;
                    } else{
                        remain.duration -= available;
                        stack.push(remain);
                        available = 0;
                    }
                    
                }
            }else if(now.start + now.duration > next.start){
                now.duration = now.start + now.duration - next.start;
                stack.push(now);
            }else{
                result.add(now.name);
            }
        }
        
        
        
        
        return result.stream().toArray(String[]::new);
    }
    
    private int timeToMinutes(String time){
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
    
}