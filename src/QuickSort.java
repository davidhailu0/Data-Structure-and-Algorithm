public class QuickSort {
    private void arrangePivot(int startIndex,int endIndex, int[] array){
        if(startIndex==endIndex){
            return;
        }
        int pivot = endIndex;
        for(int i = startIndex;i<endIndex;i++){
            if(array[i]>array[pivot]){
                int temp = array[pivot];
                array[pivot] = array[i];
                array[i] = temp;
                pivot = i;
            }
        }
        arrangePivot(0,pivot,array);
        arrangePivot(pivot+1,array.length,array);
    }

    public void sort(int[] array){
         arrangePivot(0,array.length,array);
    }
}
