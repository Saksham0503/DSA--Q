public class NestedLoops_Questions {
    public static void main(String[] args) {
        //printing a pattern of a star
        for (int line = 1;line<=4;line++){
            for (int star = 1; star <= line; star ++ ){
                System.out.print("*");
                System.out.print("  ");
            }
            System.out.println();
        }
        //printing a pattern of stars in reverse order
        for (int line1 =1;line1 <=4;line1++){
            for( int star1 = 1; star1 <=(4-line1+1);star1++){
                System.out.print("*");
                System.out.print("  ");
            }
            System.out.println();
        }
        //printing half pyramid pattern
        for(int line2 =1; line2 <=4;line2++){
            for(int num =1 ;num <=line2;num++ ){
                System.out.print(num);
                System.out.print("  ");
            }
            System.out.println();
        }
        //printing character pattern
        char alphabet ='A';
        for(int line3 =1;line3<=4;line3++){
            for(int ch =1;ch <=line3;ch++){
                System.out.print(alphabet);
                System.out.print("  ");
                alphabet++;
            }
            System.out.println();
        }
    }
}