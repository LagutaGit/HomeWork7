public class Main {
    public static void main(String[] args) {

        // 1
        int [] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[1]);

        //2
        int [] arrayFirst = {1,2,3};
        int [] arraySecond = {4,5,6};
        int [] arrayThrid = {7,8,9};

        for (int i = 0; i < arrayFirst.length; i++){
            if (i != arrayFirst.length - 1) {
                System.out.print(arrayFirst[i] + ", ");
            } else {
                System.out.println(arrayFirst[i]);
            }
        }

        for (int i = 0; i < arraySecond.length; i++){
            if (i != arraySecond.length - 1) {
                System.out.print(arraySecond[i] + ", ");
            } else {
                System.out.println(arraySecond[i]);
            }
        }

        for (int i = 0; i < arrayThrid.length; i++){
            if (i != arrayThrid.length - 1) {
                System.out.print(arrayThrid[i] + ", ");
            } else {
                System.out.println(arrayThrid[i]);
            }
        }

//        3

    }
}