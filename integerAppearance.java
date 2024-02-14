import java.util.*;
public class integerAppearance {
    
    public static boolean checkInteger(int num[])
    {
       for(int i=0;i<num.length-1;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                if(num[i]==num[j])
                {
                  return true;   
                }
            }
        }
       return false;
    }
    public static void main(String[] args) {
        // int num[]=new int[10];
        int  num[]={1,2,3,4};
        System.out.println(checkInteger(num));
    }
}
