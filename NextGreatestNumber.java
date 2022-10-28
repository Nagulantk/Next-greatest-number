 import java.util.Scanner;
public class NextGreatestNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Length:");
        int length=s.nextInt();
        int[] array=new int[length];
        for(int i=0;i<length;i++)
        {
            array[i]=s.nextInt();
        }
     findingMaximum(array);
    }
    public static void findingMaximum(int[] array)
    {
        int maximum;
        for(int i=0;i<array.length;i++)
        {    maximum=Integer.MAX_VALUE;
            for(int j=i+1;j<array.length;j++)
            {
                if(array[j]<maximum &&array[j]>array[i])
                    {
                        maximum=array[j];
                    }

            }
            if(maximum==Integer.MAX_VALUE){
            array[i]=-1;}
            else {
                array[i]=maximum;
            }
            System.out.print(array[i]+" ");
        }
    }
}