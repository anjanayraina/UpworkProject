import java.util.Scanner;

public class Game {
    GameBoard gameBoard;
    Hero hero;

    Game(int sizeX , int sizeY){
      // initilizing the hero and game board objects
        hero = new Hero();
        gameBoard = new GameBoard(sizeX , sizeY);
        gameBoard.set(0,0,'H');
    }
    // move up
    public void moveUp(){
        gameBoard.set(hero.posX , hero.getPosY() , '_');
        hero.setPosX(hero.getPosX() - 1);
        gameBoard.set(hero.getPosX() , hero.getPosY(), 'H');

    }
    // move down
    public void moveDown(){
        gameBoard.set(hero.posX , hero.getPosY() , '_');
        hero.setPosX(hero.getPosX() + 1);
        gameBoard.set(hero.getPosX() , hero.getPosY(), 'H');
    }
    // move left
    public void moveLeft(){
        gameBoard.set(hero.posX , hero.getPosY() , '_');
        hero.setPosY(hero.getPosY() - 1);
        gameBoard.set(hero.getPosX() , hero.getPosY(), 'H');
    }
    // move right
    public void moveRight(){
        gameBoard.set(hero.posX , hero.getPosY() , '_');
        hero.setPosY(hero.getPosY() + 1);
        gameBoard.set(hero.getPosX() , hero.getPosY(), 'H');
    }
    // checking if the hero is at the end of the matrix
    public boolean isWon(){
        return hero.getPosX() == gameBoard.sizeX- 1 && hero.getPosY() == gameBoard.sizeY -1;
    }
    // running the main game
    public void runGame(){
        while(!isWon()) {
            gameBoard.printBoard();
            Scanner s = new Scanner(System.in);
            System.out.println("Please enter where you want to move");
            char move = s.nextLine().charAt(0);
            if(move == 'u' && hero.getPosX()!=0){
                moveUp();
            }
            else if(move == 'd' && hero.getPosX()!= gameBoard.sizeX-1){
                moveDown();
            }
            else if(move == 'r' && hero.getPosY()!= gameBoard.sizeY-1){
                moveRight();
            }
            else if(move  == 'l' && hero.getPosY()!=0){
                moveLeft();
            }
            else{
                System.out.println("please make a valid move");
            }
        }
        System.out.println("Congrats you won the game !!");

    }

}
