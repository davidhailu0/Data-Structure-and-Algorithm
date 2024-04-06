public class Main {
    public static void main(String[] args) {

//        GreedyAlgorithm greedyAlgorithm = new GreedyAlgorithm();
//        System.out.println(greedyAlgorithm.calculateSmallestPath(new int[]{1,5,10,15},100));
//        BubbleSort bubbleSort = new BubbleSort();
//        int[] array = bubbleSort.sort(new int[]{2,1,4,6,3,7,8});
//        int[] array = new SelectionSort().sort(new int[]{7,8,9,6,4,7,2,3});
//        int[] array = new InsertionSort().sort(new int[]{7,8,9,6,4,7,2,3});
        int[] array = new MergeSort().sort(new int[]{7,8,9,6,4,7,2,3});
        for(int g:array){
            System.out.println(g);
        }
    }
}