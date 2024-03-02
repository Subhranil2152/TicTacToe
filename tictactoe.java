import java.util.*;
class TicTacToe {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    rules();
    System.out.println("Enter the name of the 1st player");
    String p1=scanner.nextLine();
    p1=p1.toUpperCase();
    System.out.println("Enter the name of the 2nd player");
    String p2=scanner.nextLine();
    p2=p2.toUpperCase();
    int q=0;
    char[][] matrix=new char[3][3];
    
    
    char check='Q';
    int a=0;
   
    

    do{

     
      a=0;check='Q';
      for(int i=0; i<3; i++) {
        for(int j=0; j<3; j++) {
          matrix[i][j]='-';
        }
      }
      
    
    while(check=='Q'){
      System.out.println("Enter the Box Number " + p1);
      int position = scanner.nextInt();
      
      
     
      int x = (position - 1) / 3;
      int y = (position - 1) % 3;
      
      while (matrix[x][y] != '-') {
          System.out.println("Position already occupied. Please enter new coordinates.");
          position = scanner.nextInt();
          x = (position - 1) / 3;
          y = (position - 1) % 3;
      }
      matrix[x][y] = 'X'; 
      displayElement(matrix);
      check = checkWin(matrix);
      a=a+1;
      if(a>8)
      break;

      
      System.out.println("Enter the Box Number " + p2);
      position = scanner.nextInt();
      
      
      x = (position - 1) / 3;
      y = (position - 1) % 3;
      
      while (matrix[x][y] != '-') {
          System.out.println("Position already occupied. Please enter new coordinates.");
          position = scanner.nextInt();
          x = (position - 1) / 3;
          y = (position - 1) % 3;
      }
      matrix[x][y] = 'O';
      displayElement(matrix);
      check = checkWin(matrix);
      a=a+1;
      if(a>9)
      break;
      
    }
    if(check=='X')
    {
      System.out.println(p1+" is the winner");
    }
    else if(check=='O')
    {
      System.out.println(p2+" is the winner");
    }
    else
    {
      System.out.println("Its a DRAW!");
    }






    System.out.println("Do You Want To continue playing?'\n' Press 1 to Continue or Press 0 to End");
    q=scanner.nextInt();
    }while(q!=0);

   


    scanner.close();
  }

  public static char checkWin(char matrix[][]) {
    char ans = 'Q';
    for (int i = 0; i < 3; i++) {
        if ((matrix[i][0] == 'X') && (matrix[i][2] == 'X') && (matrix[i][1] == 'X')) {
            ans = 'X';
            break;
        }
    }
    for (int i = 0; i < 3; i++) {
        if ((matrix[i][0] == 'O') && (matrix[i][2] == 'O') && (matrix[i][1] == 'O')) {
            ans = 'O';
            break;
        }
    }
    for (int i = 0; i < 3; i++) {
        if ((matrix[0][i] == 'X') && (matrix[2][i] == 'X') && (matrix[1][i] == 'X')) {
            ans = 'X';
            break;
        }
    }
    for (int i = 0; i < 3; i++) {
        if ((matrix[0][i] == 'O') && (matrix[2][i] == 'O') && (matrix[1][i] == 'O')) {
            ans = 'O';
            break;
        }
    }
    if ((matrix[0][0] == 'X') && (matrix[1][1] == 'X') && (matrix[2][2] == 'X'))
        ans = 'X';
    else if ((matrix[0][2] == 'X') && (matrix[1][1] == 'X') && (matrix[2][0] == 'X'))
        ans = 'X';
    else if ((matrix[0][0] == 'O') && (matrix[1][1] == 'O') && (matrix[2][2] == 'O'))
        ans = 'O';
    else if ((matrix[0][2] == 'O') && (matrix[1][1] == 'O') && (matrix[2][0] == 'O'))
        ans = 'O';

    return ans;
}



public static void displayElement(char matrix[][]){
  for(int i=0;i<3;i++){
    
      for(int j=0;j<3;j++){
        System.out.print(matrix[i][j]+" ");

      }
      System.out.println();
    }
}
public static void rules()
{
  System.out.println("Rules:");
  System.out.println(
      "Hello, gamers! Welcome to my game. This is no ordinary tic-tac-toe; it's a battle of wits and strategy. Let's dive in and see who will emerge victorious! ");
  System.out.println("* PLayer 1 will be putting X in the grid whereas Player 2 will be putting O in the grid.");
  System.out.println("* You cannot put your input in a preoccupied grid");
  System.out.println("* Just put the Box Number as shown below to give your input in the grid.");
  


  int k=1;
  for(int i=0;i<3;i++){
    
      for(int j=0;j<3;j++){
        System.out.print(k+" ");
        k=k+1;

    }
    System.out.println();

}
System.out.println();
System.out.println("Game created by Subhranil");
 System.out.println("Version:0.1");
}
}
