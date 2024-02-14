import java.util.Scanner;

public class TwoD_Array {

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
    public static boolean searchKey(int Array[][] ,int Key)
    {
        int n=Array.length;
        int m=Array[0].length;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {   
                if(Array[i][j]==Key)
                 {
                    System.out.println("Key Found at ("+i+","+j+")");  
                    return true;
                 }
            }
        }
        System.out.println("Sorry Ket Not Found ");
        return false;
    }  



    public static void main(String[] args) 
    {
        int Array[][]= new int[3][3];
        int n=Array.length;
        int m=Array[0].length;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Array Elements: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                Array[i][j]=sc.nextInt();
            }
          
        }

        displayArr(Array);
        int Key=5;
        searchKey(Array, Key);
    }
}