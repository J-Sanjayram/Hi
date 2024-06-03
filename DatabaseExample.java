import java.util.*;
public class DatabaseExample {
    enum sample{
        Hi,Hello,World;
        // Hello,a,b,c;

        // static int a=9;
        // ;
    }
    public static void main(String[] args) {
        DatabaseExample db=new DatabaseExample();
        sample s = sample.Hi;
        System.out.println(s);
        ArrayList arr=new ArrayList<String>();
        ArrayList ar=new ArrayList<>();
        arr.add("C");
        arr.add("D");
        arr.add("B");
        arr.add("A");
        System.out.println(arr);
        arr.toArray();
        System.out.println(arr);
        for(char c='A';c<='Z';c++){
            System.out.println(c);
        }
    }
}