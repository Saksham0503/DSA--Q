package ARRAYLIST;
import java.util.ArrayList ;
public class MultidimArrList {
    public static void main(String[] args) {
        
        ArrayList < ArrayList <Integer> > mainlist = new ArrayList<>();

        //sub list
        ArrayList <Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(list);         //printing the list : [1, 3, 2]
        mainlist.add(list);
         
        //sub list
        ArrayList <Integer> list1 = new ArrayList<>();

        list1.add(4);
        list1.add(7);
        list1.add(9);
        list1.add(8);

        System.out.println(list1);        //printing the list1 : [4, 7, 9, 8]
        mainlist.add(list1);     
        

        for(int i = 0 ; i < mainlist.size() ; i++){

            ArrayList <Integer> currList = mainlist.get(i);

            for(int j = 0 ; j < currList.size() ; j++){            //1 3 2      // 4 7 9 8                                                   
                System.out.print(currList.get(j)+" ");              
            }
            System.out.println();
        }

        System.out.println(mainlist);         //printing the mainlist : [[1, 3, 2] , [4, 7, 9, 8]]
        System.out.println(mainlist.size());       //2
    }
}
