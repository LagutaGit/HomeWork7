public class Main {
    public static void main(String[] args) {

        // 1
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[1]);

        //1.1
        int[] arrayFirst = new int[]{1, 2, 3};
        double[] arraySecond = {1.57, 7.654, 9.986};
        int[] arrayThrid = {532, 634, 123, 653};


        //2

        for (int i = 0; i < arrayFirst.length; i++) {
            if (i != arrayFirst.length - 1) {
                System.out.print(arrayFirst[i] + ", ");
            } else {
                System.out.println(arrayFirst[i]);
            }
        }

        for (int i = 0; i < arraySecond.length; i++) {
            if (i != arraySecond.length - 1) {
                System.out.print(arraySecond[i] + ", ");
            } else {
                System.out.println(arraySecond[i]);
            }
        }

        for (int i = 0; i < arrayThrid.length; i++) {
            if (i != arrayThrid.length - 1) {
                System.out.print(arrayThrid[i] + ", ");
            } else {
                System.out.println(arrayThrid[i]);
            }
        }

//        3

        for (int i = arrayFirst.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arrayFirst[i] + ", ");
            } else {
                System.out.println(arrayFirst[i]);
            }

        }

        for (int i = arraySecond.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arraySecond[i] + ", ");
            } else {
                System.out.println(arraySecond[i]);
            }

        }

        for (int i = arrayThrid.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arrayThrid[i] + ", ");
            } else {
                System.out.println(arrayThrid[i]);
            }

        }

//        4
        for (int i = 0; i < arrayFirst.length; i++) {
            if (i % 2 == 0){
                if (i != arrayFirst.length - 1) {
                    System.out.print(arrayFirst[i] + ", ");
                } else {
                    System.out.println(arrayFirst[i]);
                }
            }
        }

//

    }


}
