public class BinarySearch {
    public static int binarySearch(int[] arr,int val){
        int min = 0,max=arr.length,middle;
        while(min<max){
            middle = ((min+max)/2)+1;
            if(arr[middle]==val){
                return middle;
            }
            else if(arr[middle]>val){
                max = middle-1;
            }
            else if(arr[middle]<val){
                min = middle+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        long t1 = System.nanoTime();
        System.out.println(binarySearch(new int[]{1,2,3,4,5,6,7,8},4));
        long t2 = System.nanoTime();
        System.out.println(t2-t1);
    }
}
