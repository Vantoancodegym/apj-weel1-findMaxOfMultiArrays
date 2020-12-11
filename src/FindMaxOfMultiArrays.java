import java.util.Scanner;

public class FindMaxOfMultiArrays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x,y;
        do {
        System.out.println("Enter row");
        x=input.nextInt();
        System.out.println("Enter col");
        y=input.nextInt();}
        while (x<1||y<1);
        int[][] myArray=new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("enter myarray"+i+"-"+j);
                myArray[i][j]=input.nextInt();
            }
        }
        System.out.println(findMax(myArray));
    }
    public static String findMax(int[][] array){
        int max=array[0][0];
        int pos_row=0;
        int pos_col=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]>max){
                    max=array[i][j];
                    pos_row=i;
                    pos_col=j;
                }
            }
        }
        return "max is "+max+"position is "+pos_row+" - "+pos_col;
    }
}
