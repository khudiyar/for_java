public class Main {
    public static void main(String[] args){
        System.out.println(MathFunctions.areaCircle(4));
        System.out.println(MathFunctions.powerExp(4));
        System.out.println(MathFunctions.areaTriangle(3,4,5));
    }

    // Topshiriq #1
    public static int maxNumber(int[] array){
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>maxNumber) maxNumber = array[i];
        }
        return maxNumber;
    }

    // Topshiriq #2
    public static int sumArray(int[] array){
        int sum = array[0];
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    // Topshiriq #3
    public static boolean isSorted(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }

    // Topshiriq #4

}