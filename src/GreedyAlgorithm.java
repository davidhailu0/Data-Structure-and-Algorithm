import java.util.Arrays;

public class GreedyAlgorithm {
    int calculateSmallestPath(int[] inputValues,int amount) {
        int count = 0;
        int[] tempInputValues = Arrays.stream(inputValues).sorted().toArray();
        for (int i = inputValues.length - 1; i >= 0; ) {
             if(amount%tempInputValues[i]!=amount){
                 count += amount/tempInputValues[i];
                 amount = amount%tempInputValues[i];
             }
             else{
                 i--;
             }
        }
        return count;
    }
}
