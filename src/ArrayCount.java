import java.util.Scanner;

public class ArrayCount {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter array size:");
        int size=scanner.nextInt();
        int array[]=new int[size];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        int count=0;
        for (int j=0;j<size;j++)
        {
            if(array[j]==max)
            {
                count++;
            }
        }
        System.out.println(size-count);
    }
}
