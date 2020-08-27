import java.util.ArrayList;
import java.util.List;

public class PersonList {
   private static ArrayList<Person> personlist=new ArrayList<Person>() {
        {
            add(new Person("tung","140","HaNoi"));
            add(new Person("Nguyen","25","HaNoi"));
            add(new Person("Thanh","26","ThaiBinh"));
            add(new Person("Phan","17","SaiGon"));
            add(new Person("Hung","37","Hue"));
            add(new Person("Kien","140","SaiGon"));
        }
    };

    public static ArrayList<Person> getList(){
        return personlist;
    }
}
