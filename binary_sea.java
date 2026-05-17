import java.util.*;

class binary_sea {

    public static int binary(int arr[], int l, int r, int t) {

        if (l > r) return -1;

        int mid = l + (r - l) / 2;

        if (arr[mid] == t) {
            return mid;
        }

        if (arr[mid] > t) {
            return binary(arr, l, mid - 1, t);
        } else {
            return binary(arr, mid + 1, r, t);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the search element");
        int tar = sc.nextInt();

        int res = binary(arr, 0, n - 1, tar);

        if (res == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + res);
        }

        
    }
}
