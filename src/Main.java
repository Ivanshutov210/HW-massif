import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(" Задача 1 ");
        int[] first = new int[]{1, 2, 3};
        float[] two = {1.57f, 7.654f, 9.986f};
        int[] free = new int[12];

        System.out.println("Задача 2");
        for (int i = 0; i < first.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(first[i]);
        }
        System.out.println();

        for (int i = 0; i < two.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(two[i]);
        }
        System.out.println();

        for (int i = 0; i < free.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(free[i]);
        }
        System.out.println();

        System.out.println("Задача 3");
        int[] box = {1, 2, 3};
        double[] klop = {1.57, 7.654, 9.986};
        int[] boll = {3, 12, 20};

        for (int i = box.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(box[i] + ", ");
            } else {
                System.out.print(box[i]);
            }
        }
        System.out.println();

        for (int i = klop.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(klop[i] + ", ");
            } else {
                System.out.print(klop[i]);
            }
        }
        System.out.println();

        for (int i = boll.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(boll[i] + ", ");
            } else {
                System.out.print(boll[i]);
            }
        }
        System.out.println();

        System.out.println("Задача 4");
        int[] boxe = {1, 2, 3};
        for (int iq = 0; iq < boxe.length; iq++) {
            if (boxe[iq] % 2 != 0) {
                boxe[iq] += 1;
            }
        }
            System.out.println(Arrays.toString(boxe));
        }
    }



