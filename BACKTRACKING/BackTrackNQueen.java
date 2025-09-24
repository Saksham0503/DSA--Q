package BACKTRACKING;
public class BackTrackNQueen {

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

    public static void nQueens (char board [][] , int row){

        //base case
        if( row == board.length ){
            printBoard(board);
            count++;
            return;
        }

        //column loop
        for( int j = 0 ; j < board.length ; j++){
            if(isSafe(board, row, j)){
               board[row][j] = 'Q';
               nQueens(board, row+1);   //recursion function call
               board[row][j] = '.';    //backtracking step
            }
        }

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

    static int count = 0 ;
    public static void main(String[] args) {
        
        int n = 4;  //queen --> n 
        char board [][] = new char[n][n] ; //chess board
        
        //initialization
        for (int i = 0 ; i < board.length ; i++){
            for (int j = 0 ; j < board.length ; j++){
                board[i][j]= '.';
            }
        }

        nQueens(board, 0); //calling a function
        System.out.println("TOTAL WAYS TO SOLVE N-QUEEN PROBLEM :"+ count);
    }
}
