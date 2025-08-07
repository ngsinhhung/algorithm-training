

public class DynamicArrays {

    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArrays() {
        this.array = new Object[capacity];
    }

    public DynamicArrays(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data){
        if(size >= capacity){
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data){
        if(size >= capacity){
            grow();
        }

        for (int i = size; i > index; i--) {
            this.array[i] = this.array[i-1];
        }
        this.array[index] = data;
        this.size++;
    }

    public void delete(Object data){
        for (int i = 0; i < size; i++) {
            if(this.array[i].equals(data)){
                for (int j = i; j < size; j++) {
                    this.array[j] = this.array[j + 1];
                }
                break;
            }   
        }
        size--;
        if(size <= (int) (capacity/3)){
            shrink();
        }
    }

    public int search(Object data){
        for (int i = 0; i < size; i++) {
            if(this.array[i].equals(data)){
                return i;
            }
        }
        return -1;
    }

    private void grow(){
        this.capacity = this.size + this.capacity;
        Object [] newArray = new Object[this.capacity];
        for(int i = 0; i < size; i++) {
            newArray[i] = this.array[i];
        }
        this.array = newArray;
    }

    private void shrink(){

    }

    public boolean isEmpty(){
        return size == 0;
    }

    public String toString(){
        String s = new String();
        for (int i = 0; i < size; i++) {
            s = s + array[i] + " ";
        }

        if(s != ""){
            s = "[" + s.substring(0, s.length()) + "]";
        } else {
            s = "[]";
        }
        return s;
    }




    public static void main(String[] args) {
        DynamicArrays dynamicArrays = new DynamicArrays(5);

        dynamicArrays.add(1);
        dynamicArrays.add(2);
        dynamicArrays.add(3);
        dynamicArrays.add(4);
        dynamicArrays.add(5);
        dynamicArrays.add(6);

        dynamicArrays.insert(0, "X");

        dynamicArrays.delete(3);

        System.out.println(dynamicArrays.size);
        System.out.println(dynamicArrays.capacity);

        System.out.println(dynamicArrays.search("XXXX"));


        System.out.println(dynamicArrays);
    }


}
