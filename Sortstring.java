import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sortstring {


    public  static void sortByLength() {
        /* shorted String in ascending order*/

        List<String> list = Arrays.asList("a", "bb", " ccc", "ddddd", " eeeeeee");
        Comparator<String> c = (a, b) -> {
            int i1 = a.length();
            int l2 = b.length();
            if (i1 > l2) return 1;
            else if (i1 < l2) return -1;
            else return 0;

        };

        List<String> stringlist = list.stream().sorted(c).toList();
        System.out.println(stringlist);
    }

    /* min return 1st element
     max return nth element not the lagest number  */

    public static void minMax(){
        List<String> list = Arrays.asList("a", "bb", " ccc", "ddddd", " eeeeeee");
        Comparator<String> c = (a,b)->{
            int l1 = a.length();
            int l2 = b.length();
           return Integer.compare(l1,l2);
        };
        String maxLength = list.stream().min(c).get();
        System.out.println(maxLength);

    }

}

