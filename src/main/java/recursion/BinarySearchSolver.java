package recursion;

public class BinarySearchSolver extends SolverAbstract{
    private int[] numbers;
    @Override
    protected void initData() {
        numbers = new int[]{1, 2, 6,18,20,23,29,32,34,39,40,41};
    }

    @Override
    protected void solve() {
        int valToSearch = 39;
        int idx = doBinarySearch(numbers,valToSearch,0,numbers.length-1);
        if (idx !=-1){
            System.out.println("Znaleziono idx= " + idx + " val = " + numbers[idx]);
        }else{
            System.out.println("Nie znaleziono val = " + valToSearch);
        }

    }

    private int doBinarySearch(int[] numbers, int search, int left, int right) {
        if (left > right){
            return -1;
        }else {
            int midIdx = (right+left)/2;
            int midVal = numbers[midIdx];
            if (midVal == search) {
                return midIdx;
            }
            if (search > midVal) {
                return doBinarySearch(numbers, search, midIdx+1, right);
            } else {
                return doBinarySearch(numbers, search, left, midIdx - 1);
            }
        }
    }
}
