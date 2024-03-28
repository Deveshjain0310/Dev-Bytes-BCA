public class largestElem {
    public static int largestElement(int arr[]){
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i <= n-1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr [] = {4, 7, 8, 6, 7, 6};
        System.out.println(largestElement(arr));
        System.out.println(Integer.MIN_VALUE);
    }
}
