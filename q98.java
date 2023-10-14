public class q98 {
    
    public static int mini(int[] arr, int low, int high) {
        if (high < low) {
            return arr[0];
        }

        int mid = (low + high) / 2;

        if (mid == 0 || arr[mid - 1] > arr[mid]) {
            return arr[mid];
        }

        if (arr[mid] > arr[high]) {
            return mini(arr, mid + 1, high);
        } else {
            return mini(arr, low, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};

        int minElement = mini(arr, 0, arr.length - 1);

        System.out.println("The minimum element in the array is: " + minElement);
    }
}

