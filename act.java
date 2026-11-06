import java.util.Scanner;

public class act {
    public int[] getSubArray(int[] arr, int start, int end) {
        int[] subArray = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            subArray[i - start] = arr[i];
        }
        return subArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        act obj = new act();
        System.out.println("Enter the number of elements in the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();}
        System.out.println("Enter the start index for the sub-array:");
        int start = sc.nextInt();
        System.out.println("Enter the end index for the sub-array:");
        int end = sc.nextInt();
        if (start < 0 || end >= size || start > end) {
            System.out.println("Invalid start or end index.");
        } else {
            int[] subArray = obj.getSubArray(arr, start, end);
            System.out.println("The sub-array is:");
            for (int num : subArray) {
                System.out.print(num + " ");}}
        
    }
}