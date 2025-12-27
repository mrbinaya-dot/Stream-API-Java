import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date joiningDateRam = dateFormat.parse("01-04-2002");
        Date joiningDateSita = dateFormat.parse("08-06-2010");
        Date joiningDateHari = dateFormat.parse("01-06-2008");
        Date joiningDateAnish = dateFormat.parse("01-06-2000");

        List<Employee> emp = Arrays.asList(
                new Employee("ram", 500000.0, joiningDateRam, "M"),
                new Employee("Sita", 400000.0, joiningDateSita, "F"),
                new Employee("Hari", 300000.0, joiningDateHari, "M"),
                new Employee("Anish", 560000.0, joiningDateAnish, "M")


        );

           /* to find the highest salary*/


//            Employee maxSal= emp.stream().max((a,b)->Double.compare(b.getSalary(),a.getSalary())).get();
//            System.out.println(maxSal);

     /* to find second highest salary*/


//        Optional<Employee> Secmax =emp.stream().sorted((a, b)-> Double.compare(a.getSalary(),b.getSalary()))
//                        .skip(1)
//                        .findFirst();
//        Secmax.ifPresent(System.out::println);



          /*  senior joining date*/


//        Optional<Employee> joindate = emp.stream().min((a,b)->a.getJoiningDate().compareTo(b.getJoiningDate()))
//                ;
//        joindate.ifPresent(System.out::println);




      /*  count female */


//        Long  genCount = emp.stream().filter((a)->"F".equals(a.getGender())).count();
//        System.out.println("number of females" + genCount);


    }















//       Sortstring.sortByLength();
//       Sortstring.minMax();



    }







