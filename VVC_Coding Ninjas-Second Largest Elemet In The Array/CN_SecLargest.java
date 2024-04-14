public class CN_SecLargest {
    public static int getSecondLargestElement (int a[]){
        int largest = Integer.MIN_VALUE;
        int SecLargest = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                SecLargest = largest;
                largest = a[i];
            }
            else if (a[i] < largest && a[i] > SecLargest){
                SecLargest = a[i];
            }
        }
        return SecLargest;
    }
    public static void main(String[] args) {
        int a[] = {3, 4, 5, 2};
        System.out.println(getSecondLargestElement(a));
    }
}
