package CodeAcademy;

public class Operators {
    public static void main(String[] args){
        float k= 3.5F;
        k = (float)7.2;
        k += 2.2F;
        System.out.println(k);

        k = (int)k;
        System.out.println(k);

        int l=(int)k;
        l -= 2;
        System.out.println(l);

        l *= 3;
        System.out.println(l);

        l /= 9;
        System.out.println(l);

        l %= 2;
        System.out.println(l);

        l++;
        System.out.println(l);

        l--;
        System.out.println(l);
    }
}
