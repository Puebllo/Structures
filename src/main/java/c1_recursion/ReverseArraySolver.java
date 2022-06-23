package c1_recursion;

public class ReverseArraySolver extends SolverAbstract{

    private int[] numbers;
    @Override
    protected void initData() {
    numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    @Override
    protected void solve() {
        for (int i = 0 ; i < numbers.length ; i++)
            System.out.print(numbers[i] + ",");
        System.out.println();
      reverseArray(numbers,0,numbers.length-1);
        System.out.print("Odwrocone: ");

        for (int i = 0 ; i < numbers.length ; i++)
            System.out.print(numbers[i] + ",");
        System.out.println();
    }

    private void reverseArray(int[] numbers, int left, int right) {

        if (left < right){
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            reverseArray(numbers, left+1, right-1);
        }
    }


}
