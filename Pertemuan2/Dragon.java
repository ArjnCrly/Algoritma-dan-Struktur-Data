package Pertemuan2;

public class Dragon {
    
    int x, y, width, height;

    void moveLeft() {
        if ( x >= 0 && x < width) {
            x -= 1;
        } else {
            detectCollision();
        }
        
    }
    void moveRigth() {
        if ( x >= 0 && x < width ) {
            x += 1;
        } else {
            detectCollision();
        }
        
    }
    void moveUp() {
        if ( y>=0 && y<height) {
            y +=1;
        } else {
            detectCollision();
        }
        
    }
    void moveDown() {
        if ( y>=0 && y<height ) {
            y -= 1;
        } else {
            detectCollision();
        }
        
    }
    void position() {
        System.out.println("Player berada di: (" + x + "," + y + ")");
    }
    void detectCollision() {
       System.out.println("Game Over");
       System.exit(0);
    }
}
