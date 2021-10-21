import java.util.ArrayList;
import java.util.Collections;

public class Second {
    public static int process(int x, int y, int z, char a) {
        if(x<2 || y < 2 || z<2 || x>4 || y>4||z>4) return -1;
        if(a!='A' && a!='B') return -1;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(x);
        arr.add(y);
        arr.add(z);

        Collections.sort(arr);

        if(a=='A') return 4;
        else return arr.get(2) + arr.get(1) + 2;
    }

    public static void main(String[] args) {
        System.out.println(process(3,4,5,'A'));
    }
}
