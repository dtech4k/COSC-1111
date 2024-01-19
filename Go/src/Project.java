import java.awt.*;

public class Project {

    //Below is the rules to Go
    //1.Go is a game between two players, called Black and White.

    //2. Go is played on a plain grid of 19 horizontal and 19 vertical lines, called a board
        //("Intersection", "Adjacent") A point on the board where a horizontal line meets a vertical line is called an
        // intersection. Two intersections are said to be adjacent if they are connected by a horizontal or vertical
        //line with no other intersections between them.

    //3. Stones: Go is played with playing tokens known as stones. Each player has at their disposal an adequate supply
    // (usually 180) of stones of the same color.

    //4. At any time in the game, each intersection on the board is in one and only one of the following three states:
    // 1) empty; 2) occupied by a black stone; or 3) occupied by a white stone. A position consists of an indication of
    // the state of each intersection.
        //("Connected") Two placed stones of the same color (or two empty intersections) are said to be connected if it
        // is possible to draw a path from one intersection to the other by passing through adjacent intersections of
        // the same state (empty, occupied by white, or occupied by black).

        //("Liberty") In a given position, a liberty of a stone is an empty intersection adjacent to that stone or
        // adjacent to a stone which is connected to that stone.

    //upon start, initiate a 19x19 grid, which will be int[][]
    //empty squares will be populated by zeroes ->default value for an int[]
    //black plays first, black ==1;
    //white ==2;
    public static void main(String[] args){
        int whiteScore = 0;
        int blackScore = 0;
        int[][] board = new int[19][19];
        //draw the board
        StdDraw.setXscale(-1, 19);
        StdDraw.setYscale(-1, 21);
        DrawState(board);
        StdDraw.enableDoubleBuffering();
        int turnValue = 1;
        System.out.println("Score is:\nBlack: "+blackScore+"\nWhite: "+whiteScore);
        //boolean blackTurn = true;
        while (true) {
            // mouse click
            int x = (int) StdDraw.mouseX();
            int y = (int) StdDraw.mouseY();

            DrawState(board);
            if (turnValue == 1) {
                StdDraw.setPenColor(StdDraw.BLACK);
            }if (turnValue == 2) {
                StdDraw.setPenColor(StdDraw.WHITE);
            }if (turnValue > 3) {
                StdDraw.setPenColor(StdDraw.RED);
            }
            StdDraw.circle(x, y, 0.34);
            StdDraw.show();
            StdDraw.pause(10);

            if (StdDraw.isMousePressed() && turnValue < 3 && y >= 19) {
                turnValue += 3;
                turnValue = play(turnValue, board);
                while(StdDraw.isMousePressed()) {

                }
            } else if (StdDraw.isMousePressed() && turnValue > 3 && y > 19) {
                turnValue -= 3;
                while (StdDraw.isMousePressed()) {

                }
                if (turnValue==1){
                    System.out.println("Black to Play");
                }
                if (turnValue==2){
                    System.out.println("White to Play");
                }
            } else if (StdDraw.isMousePressed() && turnValue<3) {
                turnValue = play(turnValue, board);
                while (StdDraw.isMousePressed()) {

                }

            }if (turnValue == 4 && StdDraw.isMousePressed()){
                if (board[x][y] != 0){
                play(turnValue, board);
                while (StdDraw.isMousePressed()){

                }
                whiteScore++;
                System.out.println("Score is:\nBlack: "+blackScore+"\nWhite: "+whiteScore);}
            }else if (turnValue == 5 && StdDraw.isMousePressed()){
                if (board[x][y] != 0){
                play(turnValue, board);
                while (StdDraw.isMousePressed()) {

                }
                blackScore++;
                System.out.println("Score is:\nBlack: "+blackScore+"\nWhite: "+whiteScore);}
            }

                StdDraw.clear();

                //int x = (int) StdDraw.mouseX();
                //int y = (int) StdDraw.mouseY();



            }


        }

    public static void DrawState(int[][] board){
        StdDraw.setPenColor(186, 137, 2);
        StdDraw.filledSquare(10,10, 11);
        StdDraw.setPenColor(Color.red);
        StdDraw.filledRectangle(9, 20,10,1);
        //draw vertical lines
        StdDraw.setPenColor(Color.black);
        for (int i = 0; i < 19; i++) {
            StdDraw.line(i,0,i,18);
        }
        //draw horizontal lines
        for (int i = 0; i < 19; i++) {
            StdDraw.line(0,i,18,i);
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (board[i][j]==1){
                    StdDraw.setPenColor(Color.black);
                    StdDraw.filledCircle(i,j,0.34);
                }
                if (board[i][j]==2){
                    StdDraw.setPenColor(Color.white);
                    StdDraw.filledCircle(i,j,0.34);
                }
            }
        }
    }
    public static int play(int turnValue, int[][] board) {

        //current issue lies in the ability for an overwrite to occur, which should not be possible in the final
        //version
        if (turnValue == 1) {
            StdDraw.setPenColor(StdDraw.BLACK);

            StdDraw.clear();
            int x = (int) StdDraw.mouseX();
            int y = (int) StdDraw.mouseY();
            if (board[x][y] == 1 || board[x][y] == 2) {
                //click to remove
                rmv(x, y, board);
                return 1;
                }
            if (x<19 && y<19){
                board[x][y] = 1;}
            DrawState(board);
            return 2;
        }

        else if (turnValue == 2) {
            StdDraw.setPenColor(StdDraw.WHITE);

            StdDraw.clear();
            int x = (int) StdDraw.mouseX();
            int y = (int) StdDraw.mouseY();
            if (board[x][y] == 1 || board[x][y] == 2) {
                //click to remove
                rmv(x, y, board);
                return 2;}
            if (x<19 && y<19){
                board[x][y] = 2;}
                DrawState(board);
                return 1;
        }

        else if (turnValue==4 || turnValue==5) {
            System.out.println("Select stones to remove");
            StdDraw.clear();
            int x = (int) StdDraw.mouseX();
            int y = (int) StdDraw.mouseY();
            if (y<19) {
                if (board[x][y] == 1 || board[x][y] == 2) {
                    //click to remove
                    rmv(x, y, board);
                    return turnValue;
                }
                DrawState(board);
                return turnValue;
            }
        }
        return turnValue;
        }
    public static void rmv(int x, int y, int[][] board){
        board[x][y]=0;
        DrawState(board);
    }
}
