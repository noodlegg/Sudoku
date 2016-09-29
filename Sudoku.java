class Sudoku {
    private static final int SIZE = 9;     // size of the grid e.g. 9 -> 9x9
    private static final int DMAX = 9;     // max digit to be filled in e.g. 9
    private static final int BOXSIZE = 3;  // size of the boxes e.g. 3 -> 3x3
    int[][] grid = new int[][] {
        { 0, 6, 0,  0, 0, 1,  0, 9, 4 },
        { 3, 0, 0,  0, 0, 7,  1, 0, 0 },
        { 0, 0, 0,  0, 9, 0,  0, 0, 0 },
        { 7, 0, 6,  5, 0, 0,  2, 0, 9 },
        { 0, 3, 0,  0, 2, 0,  0, 6, 0 },
        { 9, 0, 2,  0, 0, 6,  3, 0, 1 },
        { 0, 0, 0,  0, 5, 0,  0, 0, 0 },
        { 0, 0, 7,  3, 0, 0,  0, 0, 2 },
        { 4, 1, 0,  7, 0, 0,  0, 8, 0 },
    };

    int solutionnr = 0; //solution counter

    void run() {
        //TODO starts the solving process.
        print();


        //END TODO
    }

    boolean givesConflict(int r, int  c, int d) {
        //TODO is there a conflict when we fill in d at position r,c?
        


        //END TODO
        return false;
    }

    boolean rowConflict(int r, int d) {
        //TODO is there a conflict in row r when we fill in d?



        //END TODO
        return false;
    }

    boolean colConflict(int c, int d) {
        //TODO is there a conflict in column c when we fill in d?



        //END TODO
        return false;
    }

    boolean boxConflict(int rr, int cc, int d) {
        //TODO is there a conflict when we fill in d at position in the box of rr,cc?



        //END TODO
        return false;
    }


    int[] findEmptySquare() {
        //TODO return the next empty square (See assignment).



        //END TODO
        return null;
    }

    void solve() {
        //TODO see (4)



        //END TODO
    }

    // print the grid, 0s are printed as spaces
    void print() {
        //TODO print the grid, printing spaces instead of 0s.
        String hline = "-------------------------------"; // horizontal line
        
        System.out.println("+-----------------------------+"); // beginning
        for (int r = 0; r < grid.length; r++ ) {
            for ( int c = 0; c < grid[r].length; c++ ) {
                if ( c%3 == 0 ) { // every 3 numbers are to be seperated by a '|'
                    System.out.print("|");
                }
                if ( grid[r][c] == 0 ) { // if array value is 0, then it's empty
                    System.out.print("   ");
                } else { // otherwise it's not empty, then print the value
                System.out.print( " " +grid[r][c]+ " " );
                }
                if ( c == 8 ) { // after the last number in a column, place a '|'
                    System.out.print("|");
                }
            }
            System.out.println();
            if ( r == 8 ) { // finishing touch if it was the last row
                hline = "+-----------------------------+";
            }
            if ( (r+1)%3 == 0 ) { // otherwise it's a horizontal line which seperates the values vertically
                System.out.println(hline);
            }
        }


        //END TODO
    }

    //TODO extra methods



    //END TODO


    public static void main(String[] args) {
        new Sudoku().run();
    }
}