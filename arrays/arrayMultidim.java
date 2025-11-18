package arrays;

//array multidimensionais
public class arrayMultidim {
    public static void main(String[] args) {
        int[] [] dias = new int[2][2];
        dias[0][0] = 22 ;
        dias[0][1] = 12;
        dias[1][0] = 31;
        dias[1][1] = 23;
        
        for (int[] ref : dias) {
            for (int dia : ref) {
                System.out.println(dia);
            }
        }


    }}

