package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Index_VS_Object {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2, 4, 6));

        //  num = 2; // index number i temsil ediyor...
        Integer num = 2; // object i temsil ediyor

        list.remove(num);

        System.out.println(list);

        String names[] = {"Jonny", "Edurardo", "Francis", "Franklin", "Freedy"};
        ArrayList<String > nameList = new ArrayList<>();

        nameList.addAll(Arrays.asList(names));

        if(nameList.remove("Francis")){ // TRUE , ["Jonny", "Edurardo", "Franklin", "Freedy"]
            nameList.remove("Jonny");
        }
        System.out.println(nameList);





    }
}
