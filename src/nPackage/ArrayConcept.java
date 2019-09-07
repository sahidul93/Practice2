package nPackage;

public class ArrayConcept {

    public static void main(String[] args) {

//array: to store similar data type values in a variable
//array = list of strings
//lower bound/index = 0
//upper bound/index = n-1 (n is size of array)

        int i [] = new int [4];
        i[0] = 10;
        i[2] = 30;
        i[3] = 40;

        System.out.println(i[2]);
        System.out.println(i[3]);

        System.out.println(i.length); // size of array

// print a;; the values of array: use for loop
        for(int j = 0; j<i.length; j++){ // true conditions: establish number, condition and increment/decrement

            System.out.println(i[j]);
        }
        //2. double array: decimal numbers
        double d[] = new double[3];
        d[0] = 12.33;
        d[1] = 13.44;
        d[2] = 45.55;

        System.out.println(d[2]);

        //3. char array: can be any character (letters, numbers, symbols)

        char c[] = new char [3];
        c[0] = 'q';
        c[1] = 2;
        c[2] = '$';

        System.out.println(c[2]);

        //4. boalean array:

        boolean b[] = new boolean[2];
        b[0] = true;
        b[1] = false;

        System.out.println(b[1]);
        System.out.println(b[0]);
        //5. String Array :

        String s[] = new String [3];
        s[0] = "test";
        s[1] = "hello";
        s[2] = "world";


        System.out.println(s.lenght);


        //6. object array : (Object is a class) -- is used to store different data types of values

        Object ob[] = new Object[6];
        ob[0] = "Tom";
        ob[1] = "25";
        ob[2] = "12.33";
        ob[3] = "1/1/1993";
        ob[4] = "M";
        ob[5] = "Yemen";

        System.out.println(ob[5]);




    }


}
