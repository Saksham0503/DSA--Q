package ARRAYLIST;

import java.util.*;

public class CH23_Questions {

    // Question 1
    public static boolean isMonotonic(ArrayList<Integer> list) {

        boolean inc = true;
        boolean dec = true;

        for (int i = 0; i < list.size() - 1; i++) {

            if (list.get(i) > list.get(i + 1)) {

                inc = false;
            }
            if (list.get(i) < list.get(i + 1)) {

                dec = false;
            }
        }

        return inc || dec;
    }

    // Question 2
    public static ArrayList<Integer> isLonely(ArrayList<Integer> list) {
        Collections.sort(list); // 5 6 8 10
        ArrayList<Integer> ll = new ArrayList<>();
        for (int i = 1; i < list.size() - 1; i++) {
            int curr = list.get(i);

            if (curr - 1 > list.get(i - 1) && curr + 1 < list.get(i + 1)) {

                ll.add(list.get(i));
            }
        }

        if (list.size() == 1) { // single element is always lonely

            ll.add(list.get(0));
        }

        if (list.size() > 1) {
            if (list.get(0) + 1 < list.get(1)) {
                ll.add(list.get(0));
            }
            if (list.get(list.size() - 2) + 1 < list.get(list.size() - 1)) {
                ll.add(list.get(list.size() - 1));
            }
        }

        return ll;

    }

    // Question 3
    
    //Question 4
    

    public static void main(String[] args) {

        // ...question1
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);

        System.out.println(isMonotonic(list)); // calling function 1

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(6);
        nums.add(5);
        nums.add(4);
        nums.add(4);

        System.out.println(isMonotonic(nums)); // calling function 2

        ArrayList<Integer> l = new ArrayList<>();

        l.add(1);
        l.add(3);
        l.add(2);

        System.out.println(isMonotonic(l));

        // ...question2
        ArrayList<Integer> newlist1 = new ArrayList<>();

        newlist1.add(10);
        newlist1.add(6);
        newlist1.add(5);
        newlist1.add(8);

        System.out.println(isLonely(newlist1)); // function 2

        ArrayList<Integer> newlist2 = new ArrayList<>();

        newlist2.add(1);
        newlist2.add(3);
        newlist2.add(5);
        newlist2.add(3);
        System.out.println(isLonely(newlist2)); // function 2

        // ...question3
        ArrayList <Integer> mfl = new ArrayList<>() ;
        
        mfl.add(1);
        mfl.add(100);
        mfl.add(200);
        mfl.add(200);
        mfl.add(1);
        mfl.add(100);
        System.out.println(mostFrequent(nums, 1));
    }

}
