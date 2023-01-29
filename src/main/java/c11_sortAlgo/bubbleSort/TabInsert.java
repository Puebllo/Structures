package c11_sortAlgo.bubbleSort;

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

    //zaczynamy interację od 2. elementu, oraz drugą iteracje od ostatniego elementu
    //sprawdzamy czy ostatni element jest mniejszy od elementu go poprzedzajacego (sortowanie rosnace)
    //jak tak to zamieniamy wartosci po indexach
    public void bubbleSort() {
        for (int i = 1; i < size; i++) {
            for (int j = size-1; j >= i ; j--) {
                if (t[j] < t[j-1]) {
                    int temp = t[j - 1];
                    t[j - 1] = t[j];
                    t[j] = temp;
                }
            }
        }
    }

}
