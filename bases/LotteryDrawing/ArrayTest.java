import java.util.*;

public class ArrayTest
{
    public static void main(String[] args)
    {
	int[] arr1 = new int[] {1, 1, 2, 3, 5};
	int[] arr2 = arr1;
	int[] arr3 = Arrays.copyOf(arr1, arr1.length);
	arr1[0] = 10;

	System.out.println(arr1[0] + ", " + arr2[0] + ", " + arr3[0]);

	int[] arr4 = Arrays.copyOf(arr1, 2 * arr1.length);
	for (int i = 0; i < arr4.length; i++) System.out.print(arr4[i] + " ");
	System.out.println();
    }
}
