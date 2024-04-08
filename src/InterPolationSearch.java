public class InterPolationSearch {
    public static void main(String[] args) {
        System.out.println(interpolationSearch(new int[]{1,2,3,4,5,6,7,8},1));
    }
    public static int interpolationSearch(int[] array,int val){
        int min = 0, max = array.length-1,prob;
        while(array[min]<=val&&array[max]>=val&&min<max){
            prob = min + (max-min)*(val-array[min])/(array[max]-array[min]);
            if(array[prob]==val){
                return prob;
            }
            else if(array[prob]>val){
                max = prob-1;
            }
            else{
                min = prob+1;
            }
        }
        return -1;
    }
}
