public class LinearSearch {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9};
        System.out.println(linearSearch(num,4));
    }
    public static int linearSearch(int[] arr,int val){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                return i;
            }
        }
        return -1;
    }
}
