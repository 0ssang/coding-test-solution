import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        
        int currentTime = 0;
        List<Integer> results = new ArrayList<>();
        List<Job> jobList = new ArrayList<>();
        
        for(int i = 0; i < jobs.length; i++){
            jobList.add(new Job(i, jobs[i][0], jobs[i][1]));
        }
        
        jobList.sort(Comparator.comparingInt(j -> j.s));
        
        PriorityQueue<Job> readyQ = new PriorityQueue<>((a,b) -> {
            if(a.l != b.l) return a.l - b.l;
            if(a.s != b.s) return a.s - b.s;
            return a.seq - b.seq;
        });
        
        int jobIndex = 0;
        
        while(jobIndex < jobList.size() || !readyQ.isEmpty()){
            while(jobIndex < jobList.size() && jobList.get(jobIndex).s <= currentTime){
                readyQ.add(jobList.get(jobIndex));
                jobIndex++;
            }
            
            if(!readyQ.isEmpty()){
                Job job = readyQ.remove();
                currentTime += job.l;
                results.add(currentTime - job.s);
            } else {
                if(jobIndex < jobList.size()){
                    currentTime = jobList.get(jobIndex).s;
                }
            }
        }
        
        return (int)results.stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0);
    }
    
        static class Job {
        int seq;
        int s;
        int l;
        
        Job(int seq, int s, int l){
            this.seq = seq;
            this.s = s;
            this.l = l;
        }
    }
}