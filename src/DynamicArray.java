import java.util.Arrays;

public class DynamicArray {
    int size=0;
    int capacity=10;
    Object[] objects;

    public DynamicArray(){
        objects = new Object[this.capacity];
    }
    public DynamicArray(int capacity){
        objects = new Object[capacity];
    }

    private void expand(){
        capacity = 2 * capacity;
        Object[] newObjects = new Object[capacity];
        if (size >= 0) System.arraycopy(objects, 0, newObjects, 0, size );
        objects = newObjects;
    }

    private void shrink(){
        capacity = capacity/2;
        Object[] newObjects = new Object[capacity];
        System.arraycopy(objects, 0, newObjects, 0, size);
        objects = newObjects;
    }

    public void add(Object t){
        if(size<capacity){
            objects[size] = t;
            size++;
        }
        else{
            expand();
            add(t);
        }
    }

    public void remove(Object t){
        for(int i=0;i<size;i++){
            if(objects[i]==t){
                for(int j=i;j<size-1;j++){
                    objects[j] = objects[j+1];
                }
                size--;
                System.out.println(Arrays.toString(objects));
                if(size<=capacity/2){
                    shrink();
                }
            }
        }
    }

    public String toString(){
        StringBuilder string = new StringBuilder("[");
        for(int i=0;i<size;i++){
            string.append(objects[i]);
            if(i+1<size)string.append(", ");
        }
        string.append("]");
        return string.toString();
    }

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(1);
        dynamicArray.add(2);//1
        dynamicArray.add(1);
        dynamicArray.add(2);//
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(1);
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(1);
//        dynamicArray.remove(1);
        dynamicArray.remove(2);
//        dynamicArray.remove(1);
        System.out.println(dynamicArray);
    }
}
