package basics;

public class TypeCasting {
    public static void main(String[] args) {
        // ek datatype se dusre datatype me conversion is type casting

        char a = 'b';
        int x = a; //implicit type as small data type getting converted into big data type.
        System.out.println(x);

        char aditya = 'a';
        int y=(int)aditya; //explicit typecasting big datatype to small
        System.out.println(y);

    }
}
