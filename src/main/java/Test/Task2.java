package Test;

public class Task2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        int count = 1;
        while (count <= 10){
            System.out.println(count);
            count++;
        }

        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i <= 10);

        System.out.println();
        int a = 2;
//        a++;
        System.out.println(++a);
        System.out.println(a);

        int b = a++ + a++ + ++a + a--; // 3(+1) + 4(+1) + 6 + 6(-1)
        System.out.println(b);
    }
}
