import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main{
    public static void main(String[] args){
        // int i = 5;
        // System.out.println(i);

        // String text = "Hello Timo";
        // System.out.println(text);

        // boolean isJavaFun = true;
        // boolean isFishTasty = false;
        // System.out.println(isJavaFun);     // Outputs true
        // System.out.println(isFishTasty);  

        // char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        // System.out.println(myVar1);
        // System.out.println(myVar2);
        // System.out.println(myVar3);

        // var x = 5;

        // var y = "Hello World";
        // String str = "Hello";
        // System.out.println(x);
        // System.out.println(y);

        // Object myObj = "Hello World";
        // Object myNum = 15;

        // String nama = "Timo";

//        List & Map
        List<String> names = new ArrayList<>();
        names.add("Timo");
        names.add("Anna");
        names.add("Lena");

        List<String> names1 = new ArrayList<>();
        names1.add("Timo");

        Map<String, List<String>> mapBackendCourses = new HashMap<>();
        mapBackendCourses.put("Backend-C", names);
        mapBackendCourses.put("Backend-D", names1);

        System.out.println(mapBackendCourses.get("Backend-D"));

//        Operator : + * - /
        int i = 5;
        int y = 5;
        int result = i + y;
        System.out.println("penjumlahan : " + result);

        result = i * y;
        System.out.println("perkalian : " + result);

        result = i - y;
        System.out.println("pengurangan : " + result);

        result = i / y;
        System.out.println("pembagian : " + result);

        result = i % y;
        System.out.println("modulus : " + result);
    }
}