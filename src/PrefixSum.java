import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int [size];
        for(int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }
        findPreixSum(array,size);
    }
    public static void findPreixSum(int[] array,int size)
    {
        int p[] = new int[size];
        p[0] = array[0];//storing first element
        for(int i =1;i<size;i++)
        {
            p[i] = p[i-1] + array[i];//storing prefix from 1 ..add prev value
        }
        for(int arr : p)
        {
            System.out.print(arr+" ");
        }
    }
}
//Given an array A of N integers. Construct prefix sum of the array in the given array itself.
