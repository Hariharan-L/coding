import java.util.Scanner;

//we need to import the util scanner library to Get the user input
class basic {
  public static void main(String[] a) {
    Scanner scan = new Scanner(System.in);// Declare the system input to get the input
    for(int i=0;i<5;i++){
      for (int j=0;j<5;j++){
        if(i+j>=4){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      for (int j=0;j<5;j++)
      System.out.println();
    }
    scan.close();// you need to close the scan because it is an open door so every one can use it
  }
}