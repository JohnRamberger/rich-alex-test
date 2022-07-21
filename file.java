import java.util.Scanner;

public class file {

    // comment
    /*
     * big comment
     */

    public static void main(String[] args) {
        // string - text (uses "")
        // int - integer (whole number)
        // boolean - true/false
        // double - real number
        // char - 1 character (uses '')
        // final - fixed value (will error if different value)
        // classes - public
        // int s; // declaration (claiming the name)
        // s = 12; //instantiating (assigning a value
        // int s = 12; //both declaring and instantiating
        // static - linked to the class (one time variable)
        // nonstatic - dynamic (access through an object)
        // Array - list of values (fixed length)
        // int[] arr = new int[2];
        // ArrayList - list of values (auto increases size when full)
        // void - doesn't return a value
        // if statement - == means true/false (if the statement is true it uses one
        // value)
        // else statement - if the if statement is false it uses this value
        // for loops - loops between 2 numbers
        // java.util.scanner - allows us to read user terminal

        // //[7, _]
        // // 0, 1
        // arr[0] = 7;
        // arr[1] = 2;

        int[] arr = new int[3];

        // [1, 5, 7]
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 7;

        // int i = test("hellodkjs fhjdksh");
        // System.out.println(i);d
        // System.out.println(product(2.7, 3.9));
        // double i = Math.round(2.4); // i = 2
        // System.out.println(i);
        // System.out.println(i);
    }

    static int test(String name) {
        if (name == "hello") { // true/false
            return 1;
        } else {
            return 2;
        }
    }

    static int test2(int[] x) {
        Scanner scan = new Scanner(System.in);
        // arr = [1, 5, 7]
        // 0, 1, 2
        // i = 0
        // i < 3
        // i++
        boolean b = true;
        while (b) { // is true
            int s = scan.nextInt();
            if (s == 1) {
                b = false;
            }
        }
        return 0;
    }

    // static int product(double x, double y) {
    //     return (int) x * y;
    // }
}
