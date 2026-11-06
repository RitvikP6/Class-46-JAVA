import java.util.*;
public class main {
    public int[] findDuplicates(int[] arr) {
        Set<Integer> uniqueValues = new HashSet<>();
        List<Integer> duplicateValues = new ArrayList<>();
        for (int num : arr) {
            if (!uniqueValues.add(num)) {
                duplicateValues.add(num);
            }
        }
        int[] result = new int[duplicateValues.size()];
        int index = 0;
        for (int i = 0; i < duplicateValues.size(); i++) {
            result[index++] = duplicateValues.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        main obj = new main();
        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] duplicates = obj.findDuplicates(arr);
        System.out.println("Duplicate elements in the array are:");
        for (int num : duplicates) {
            System.out.print(num + " ");
        }
    }
}