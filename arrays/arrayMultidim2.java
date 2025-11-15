package arrays;

//array multidimensionais
public class arrayMultidim2 {
    public static void main(String[] args) {
        int[] [] arrayMult = new int[2][2];
        arrayMult[0][0] = 22 ;
        arrayMult[0][1] = 11;
        arrayMult[1][0] = 54;
        arrayMult[1][1] = 44;
        arrayMult[1][1] = 56;
        arrayMult[1][1] = 76;

        for (int i = 0; i < arrayMult.length; i++) {
            for (int j = 0; j < arrayMult[i].length; j++) {
                System.out.println("[ "+i+ "] [" +j+ "] ="+arrayMult[i] [j]);
            }
        }
    }
}
