import java.util.*;

public class Main{
    public static void main(String[] args){
//        List<String> names = new ArrayList<>();
//        names.add("Timo");
//        names.add("Anna");
//        names.add("Lena");
//
//        List<String> names1 = new ArrayList<>();
//        names1.add("Timo");
//
//        Map<String, List<String>> mapBackendCourses = new HashMap<>();
//        mapBackendCourses.put("Backend-C", names);
//        mapBackendCourses.put("Backend-D", names1);
//
//        System.out.println(mapBackendCourses.get("Backend-D"));
//
//        int i = 5;
//        int y = 5;
//        int result = i + y;
//        System.out.println("penjumlahan : " + result);
//
//        result = i * y;
//        System.out.println("perkalian : " + result);
//
//        result = i - y;
//        System.out.println("pengurangan : " + result);
//
//        result = i / y;
//        System.out.println("pembagian : " + result);
//
//        result = i % y;
//        System.out.println("modulus : " + result);

        Scanner input = new Scanner(System.in);


        System.out.println("input alas : ");
        int alas = input.nextInt();

        System.out.println("input tinggi : ");
        int tinggi = input.nextInt();
        double luas = 0.5 * alas * tinggi;

        System.out.println("luas : " + luas);


    }
}