package c11_sortAlgo.shakerSort;

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

    public void shakerSort() {
        int left = 1;
        int right = size-1;
        int k = size - 1;

        do {
            //idziemy od prawej do lewej
            for (int i = right; i >= left; i--) {
                //sprawdzamy czy przedostatni jest wiekszy od ostatniego
                //jak tak to zamieniamy miesjcami
                if (t[i - 1] > t[i]) {
                    int temp = t[i - 1];
                    t[i - 1] = t[i];
                    t[i] = temp;
                    //pamietamy ostatni zmieniony indeks
                    k = i;
                }
            }
            left = k + 1;

            //idziemy od lewej do prawej
            for (int i = left; i <= right; i++) {
                //sprawdzamy czy przedostatni jest wiekszy od ostatniego
                //jak tak to zamieniamy miesjcami
                if (t[i - 1] > t[i]) {
                    int temp = t[i - 1];
                    t[i - 1] = t[i];
                    t[i] = temp;
                    k = i;
                }
            }
            right = k-1;
        }
        while(left<=right);
    }
}
