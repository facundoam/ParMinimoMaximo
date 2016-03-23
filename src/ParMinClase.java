/**
 * Created by farias on 23/03/16.
 */
public class ParMinClase  {

    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    public ParMinClase(int[] arreglo){
         parMinMaxRecursivo(arreglo,0,arreglo.length-1);
    }

    public void setMinMax(int a, int b) {
        if(a>b){ int x = a; a = b; b = x; }
        if(a < min){ min = a; }
        if(b > max){ max = b; }
        }


    private void parMinMaxRecursivo(int[] aux, int i, int j) {
        if(i==j || i==j-1) this.setMinMax(aux[i],aux[j]);
        else {
            int mitad = (i + j) / 2;
            parMinMaxRecursivo(aux,i,mitad);
            parMinMaxRecursivo(aux,mitad+1,j);
        }
    }

    public int getMin(){
        return min;
    }

    public int getMax(){
        return max;
    }

}
