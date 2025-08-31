import com.xworkz.dairymilk.Dairymilk;

import java.util.SortedMap;

public class WrapperRunner {
    public static void main(String[] args) {
        String str1 = new String("54");
        String str = "54";

        Integer age = new Integer(5);
        Integer age1 = 5;

        Double point  = new Double(0.23);
        Double po = 2.0;

        Character size = 'M';
        Character sizes = new Character('M');

        Short jok = 452;
        Short joke =  new Short((short) 5622);

        Byte k = 21;
        Byte ko = new Byte((byte) 254);

        Long lon = 7896541230l;
        Long lo = new Long(987456321l);

        Float pol = 2.0f;
        Float fl = new Float(2.0f);

        Integer num = new Integer(45);
        int num1 = 45;

        Character alpa = new Character('m');
        char alpa1 = 'm';

        String stp = "baby";
        stp = null;
        System.out.println(stp);

        System.out.println(alpa1 == alpa);
        System.out.println(num1 == num);
        System.out.println(size == sizes);
    }
}
