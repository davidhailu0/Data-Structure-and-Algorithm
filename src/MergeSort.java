import java.util.Arrays;

public class MergeSort {
    private int[] partition(int[] array){
        if(array.length==1){
            return array;
        }
        int index = array.length/2;
        int[] leftArray = new int[index];
        int[] rightArray = new int[array.length-index];
        for(int i=0;i<index;i++){
            leftArray[i] = array[i];
            rightArray[i] = array[i+index];
        }
        if(array.length%2!=0){
            rightArray[array.length-index-1] = array[array.length-1];
        }
        int[] sortedLeft = partition(leftArray);
        int[] sortedRight = partition(rightArray);
        return merge(sortedLeft,sortedRight);

    }
    private int[] merge(int[]leftArray,int[]rightArray){
        int total = leftArray.length+ rightArray.length;
        int[] returnedArray = new int[total];
        int i=0,j=0,k=0;
        while(i<leftArray.length&&j<rightArray.length){
            if(leftArray[i]>=rightArray[j]){
                returnedArray[k] =  rightArray[j];
                j++;
            }
            else{
                returnedArray[k] = leftArray[i];
                i++;
            }
            k++;
        }
        while(i< leftArray.length){
            returnedArray[k] = leftArray[i];
            i++;
            k++;
        }
        while(j< rightArray.length){
            returnedArray[k] = rightArray[j];
            j++;
            k++;
        }
        return returnedArray;
    }

    public int[] sort(int[] array){
        return partition(array);
    }
}
