package gamefx.objects;

public class Snake {

    public int length = 2;
    public int direction = 0;

    public int[] snakeX = new int[300];
    public int[] snakeY = new int[300];

    public Snake(int x1, int y1, int x2, int y2){
        snakeX[0] = x1;
        snakeX[1] = x2;
        snakeY[0] = y1;
        snakeY[1] = y2;
    }

    public void move(){

        // up
        if(direction == 0) snakeY[0]--;

        // down
        if (direction == 2) snakeY[0]++;

        // right
        if(direction == 1) snakeX[0]++;

        // left
        if (direction == 3) snakeX[0]--;

        for (int i = length; i > 0 ; i--) {
            snakeX[i] = snakeX[i - 1];
            snakeY[i] = snakeY[i - 1];
        }
    }


}
