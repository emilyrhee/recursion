public class BinarySearch {
    public static boolean binarySearch(
        int[] list, 
        int target, 
        int first, 
        int last
    ) {
        int middle = (first + last) / 2;

        if (list[middle] == target) {
            return true;
        } else if (first > last) {
            return false;
        } else if (list[middle] < target) {
            return binarySearch(list, target, middle + 1, last);
        } else {
            return binarySearch(list, target, first, middle - 1);
        }
    }

    public static void main(String[] args) {
        int[] list = {1, 2, 5, 7, 8, 14};
        int target = 14;
        
        System.out.print("List: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        System.out.println("\nTarget number: " + target);

        if (binarySearch(list, target, 0, list.length - 1)) {
            System.out.println("Target found");
        } else {
            System.out.println("Target not found");
        }
    }
}