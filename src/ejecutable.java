/**
 * Created by farias on 23/03/16.
 */
public class ejecutable {

    public static void main(String[] args) {


        int arreglo[] = {2, 3, 1, 12, 34,151, 56, 78, 65, 10, 91,14};

        ParMinClase A = new ParMinClase(arreglo);


        System.out.println(A.getMax());
        System.out.println(A.getMin());
    }


}
