class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        /*couple things to note:
            1) dividing by 3 (floor op) is key, for each pair (r // 3 and c // 3) since 
            we're dealing with 3x3 squares
            2) to differentiate between the 3x3 squares, we need a 2d converstion to 1d (converting the (x,y) stuff we get into 1 single number) and that is done by the following: box_id = (r//3) * 3 + (c//3)
        */

        //to convert 2D array coordinates to 1D array index:
        // formula: index = row x width + col

        HashSet<Integer>[] boxes = new HashSet[9];
        HashSet<Integer>[] rows = new HashSet[9];
        HashSet<Integer>[] cols = new HashSet[9];
        /*hashsets to check if val already exists in either row, col, or box */


        for(int i = 0; i < 9; i++)
        {
            boxes[i] = new HashSet<>();
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
        }
        /*big idea hashsets exist but are empty w/ nulls, so fill them up with objects */
        int size = board.length;
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                if(board[i][j] != '.') //ignores empties 
                {
                    int boxID = (i/3 * 3 + j/3);
                    //val to turn 2D (x,y) into single val for each box
                    int val = board[i][j] - '0';
                    //to turn val into int from char
                    if((boxes[boxID].contains(val)) || (rows[i].contains(val)) || (cols[j].contains(val)))
                        return false;
                    /*checks to see if val exists as a duplicate in either row, col, or box. if so, not valid sudoku */
                    else
                    {
                        boxes[boxID].add(val);
                        rows[i].add(val);
                        cols[j].add(val);
                    }
                    //if valid sudoku, add vall to each appropriate hashset
                }
            }
        }
        return true;
        //valid sudoku
    }
}