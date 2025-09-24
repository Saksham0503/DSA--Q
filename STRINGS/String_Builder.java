package STRINGS;
public class String_Builder {

    //function 1
    public static void toUpperCase (String str){
        StringBuilder line = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        line.append(ch);

        for (int i = 1 ; i <str.length() ; i++){
            if (str.charAt(i) == ' '){
               line.append(str.charAt(i));
            
               i++;
               line.append(Character.toUpperCase(str.charAt(i)));

            }else{
                line.append(str.charAt(i));
            }
        }
        System.out.println(line);
    }
    
    //function 2
    public static void toCompressString(String group){
            StringBuilder compr = new StringBuilder("");

            for (int i =0 ; i < group.length() ; i++){
                Integer count = 1;
                while (i < group.length()-1  && group.charAt(i) == group.charAt(i+1)){
                    count ++ ;
                    i++;
                }
                compr.append(group.charAt(i));
                if (count > 1){
                    compr.append(count);
                }

            }
            System.out.println(compr);
        
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z' ; ch++){
            sb.append(ch);
        }         //abcdefghijklmnopqrstuvwxyz

        System.out.println(sb);


        //QUESTION 4
        String str = "hi , i am skand";
        toUpperCase(str); //calling a function

        //QUESTION 5
        String group = "aaabbcccdd";
        toCompressString( group);  // calling a function
        
    }
}