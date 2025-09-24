package GREEDY_ALGORITHMS.GREEDYALGORITHMS;
import java.util.* ;

public class JobSequencing {

    public static class Job { 
        int id ;     //job class 
        int deadline ;      //property
        int profit ;
    

        public Job (int id , int deadline , int profit ){   //constructor
            this.id = id ;
            this.deadline = deadline ;
            this.profit = profit ;
        }
    }
    public static void main(String[] args) {
        int jobInfo [][] = {{4, 20} , {1 , 10} , {1 , 40} , {1 , 30}};
        
        //create obj for job class
        ArrayList <Job> jobs = new ArrayList<>();  
         
        for(int i = 0 ; i < jobInfo.length ; i++){
           jobs.add(new Job (i , jobInfo[i][0] , jobInfo[i][1]));    //i - > index , job info[i][0] = deadline , jobinfo[i][1] = profit
        }

        //sorting on the basis of profit ---> decending order 
        Collections.sort(jobs , (obj1, obj2) -> obj2.profit - obj1.profit);

        //total profit calculation
        ArrayList <Integer> seq = new ArrayList<>() ;
        int time = 0 ;
        for (int i = 0 ; i< jobs.size() ; i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time ++ ;
            }
        }
        System.out.println("MaxJob = "+ seq.size());

        for(int i =0 ; i < seq.size() ; i++){
            System.out.print("JOB A"+seq.get(i) + " , ");
        }
        System.out.println();
    }
}
