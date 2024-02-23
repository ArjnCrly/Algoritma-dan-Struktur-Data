package Pertemuan2;

import java.util.Scanner;

public class DragonMain {
    public static void main(String[] args) {
        
        Dragon player1 = new Dragon();
        player1.x=0;
        player1.y=0;
        player1.width=5;
        player1.height=5;

        player1.moveUp();
        player1.position();
        player1.moveDown();
        player1.position();
        player1.moveRigth();
        player1.position();
        player1.moveLeft();
        player1.position();
    }
}
