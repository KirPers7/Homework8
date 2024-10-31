import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");

        byte[] threeArr = new byte[3];

        threeArr[0] = 1;
        threeArr[1] = 2;
        threeArr[2] = 3;

        float[] fractionArr = {1.57f, 7.654f, 9.986f};

        short[] randomArr = {111, 222, 333, 444, 555, 666, 777, 888, 999};

        System.out.println();

        //Задание 2
        System.out.println("Задание 2");

        for (byte i = 0; i < threeArr.length; i++) {
            if (i < threeArr.length - 1) {
                System.out.print(threeArr[i] + ", ");
            } else {
                System.out.println(threeArr[i]);
            }
        }

        for (byte i = 0; i < fractionArr.length; i++) {
            if (i < fractionArr.length - 1) {
                System.out.print(fractionArr[i] + ", ");
            } else {
                System.out.println(fractionArr[i]);
            }
        }

        for (byte i = 0; i < randomArr.length; i++) {
            if (i < randomArr.length - 1) {
                System.out.print(randomArr[i] + ", ");
            } else {
                System.out.println(randomArr[i]);
            }
        }

        System.out.println();

        //Задание 3
        System.out.println("Задание 3");

        for (byte i = (byte) (threeArr.length - 1); i >= 0; i--) {
            if (i > 0) {
                System.out.print(threeArr[i] + ", ");
            } else {
                System.out.println(threeArr[i]);
            }
        }

        for (byte i = (byte) (fractionArr.length - 1); i >= 0; i--) {
            if (i > 0) {
                System.out.print(fractionArr[i] + ", ");
            } else {
                System.out.println(fractionArr[i]);
            }
        }

        for (byte i = (byte) (randomArr.length - 1); i >= 0; i--) {
            if (i > 0) {
                System.out.print(randomArr[i] + ", ");
            } else {
                System.out.println(randomArr[i]);
            }
        }

        System.out.println();

        //Задание 4
        System.out.println("Задание 4");

        for (byte index = 0; index < threeArr.length; index++) {
            if (threeArr[index] % 2 != 0) {
                threeArr[index] = (byte) (threeArr[index] + 1);
            }
        }
        System.out.println(Arrays.toString(threeArr));
    }
}