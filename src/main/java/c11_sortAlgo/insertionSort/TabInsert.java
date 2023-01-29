package c11_sortAlgo.insertionSort;

public class TabInsert {

    private int[] t;
    private int size;
    private int counter;

    public TabInsert(int maxSize){
        this.size = maxSize;
        t = new int[size];
        counter = 0;
    }

    public void insert (int val){
        if (counter<size){
            t[counter] = val;
            counter++;
        }else{
            System.out.println("Table is full, Won't add: " + val);
        }
    }

    public void printAllElements(){
        System.out.print("[");
        for (int i = 0;i<t.length; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println("]");
    }

    public void insertSort(){
        for (int i = 1; i < size; i++) {
            int j = i;
            int temp = t[j];
            while ((j>0) && (t[j-1]>temp)){
                t[j] = t[j-1];
                j--;
            }
            t[j] = temp;
        }
    }

}
