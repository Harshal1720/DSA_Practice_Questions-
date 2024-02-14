import java.util.Scanner;
public class Count_of_No {

    

    // Display 2D Array
    public static void displayArr(int Array[][])
    {    
        int n=Array.length;
        int m=Array[0].length;
        System.out.println("Input Array:  ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print (Array[i][j]+ " ");  
            }
            System.out.println(" ");
        }
    
    }
    
    //search element in 2D_Array
    public static int countnumber(int Array[][],int c)
    {
        int n=Array.length;
        int m=Array[0].length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {   
                if(Array[i][j]==c)
                 {
                    count++;
                 }
            }
        }
        return count;
    }  



    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);

        int Array[][]={{1,2,3,1},{5,6,7,1},{9,10,11,1}};
        displayArr(Array);
        System.out.println(" ");
        System.out.println("Enter the no. you want to count in 2D Array : ");
         int a =sc.nextInt();
        System.out.println("Count of number = "+countnumber(Array,a));
        
        System.out.println(" ");
        
        int Matrix[][] = { { 1, 2, 3 }, { 4, 2, 3 }, { 3, 8, 3 } };
        displayArr(Matrix);
        System.out.println(" ");
        System.out.println("Enter the no. you want to count in 2D Array : ");
        int b =sc.nextInt();
        System.out.println("Count of number = "+countnumber(Matrix,b));
    }
}
