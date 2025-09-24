package ARRAYS;
public class N_QueenOneSolution {
    public static boolean isSafe (char board[][] , int row , int col){
        
        //vertically up 
        for (int i =row - 1 ; i >= 0 ; i--){
           
             if ( board [i][col] == 'Q'){
                return false ;
             }
        }

        // diagonally left up
        for (int i = row-1 , j = col-1 ; i >=0 && j >=0 ; i-- , j--){

            if ( board [i][j] == 'Q'){
                return false ;
            }
        }
       
        //diagonally right up
        for (int i= row-1 , j= col+1 ; i >=0 && j < board[0].length; i-- , j++ ){

            if( board [i][j]== 'Q'){
               return false ;
            }
        }

        return true;

    }

    public static boolean nQueens (char board [][] , int row){

        //base case
        if( row == board.length ){
            printBoard(board);
            return true;
        }

        //column loop
        for( int j = 0 ; j < board.length ; j++){

            if(isSafe(board, row, j)){

               board[row][j] = 'Q';

               if(nQueens(board, row+1)){   //recursion function call
                  return true;
               }       
                               
               board[row][j] = '.';    //backtracking step
            }
        }

        return false;

    }

    public static void printBoard (char board[][]){

        System.out.println("___________chess board___________");
        for ( int i = 0 ; i < board.length ; i++){
            for ( int j = 0 ; j < board.length ; j++){
                
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        
        int n = 4;  //queen --> n 
        char board [][] = new char[n][n] ; //chess board
        
        //initialization
        for (int i = 0 ; i < board.length ; i++){
            for (int j = 0 ; j < board.length ; j++){
                board[i][j]= '.';
            }
        }

       if(nQueens(board, 0)){      //calling a function 
         System.out.println("solution is possible");
       }else{
          System.out.println("solution is not possible"); 
       }
    
    } 

}
