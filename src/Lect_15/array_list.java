package Lect_15;
import java.util.ArrayList;
public class array_list {
    public static void main(String[] args) {
        //syntax of Arraylist
        //ArrayList<datatype> name= new ArrayList<datatype>();
        ArrayList<Integer> mean= new ArrayList<>();
        //we typed here integer and not int because we can't use primitive datatype while creating an arraylist ,so we use wrapper class
        ArrayList<String> arrayList1= new ArrayList<>();

        //add elements to the arraylist
        arrayList1.add("ashish");
        arrayList1.add("saloni");
        arrayList1.add("ashok");
        arrayList1.add("poonam");
        arrayList1.add("poonam1");
        //printing arraylist
        System.out.println(arrayList1);

        //access elements of the array list
        String mymom=arrayList1.get(4);
        System.out.println(mymom);

        //to change an element
        arrayList1.set(4,"poonam_devi");
        System.out.println(arrayList1);

        //to remove an element
        arrayList1.remove(3);
        System.out.println(arrayList1);

        //print the size of an arraylist
        System.out.println(arrayList1.size());

        //iteration
        for (String name:arrayList1){
            System.out.println(name);
        }

        //add to specific index
        arrayList1.add(2,"poonam_devi");
        System.out.println(arrayList1);




    }
}
