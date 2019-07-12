public class DailyCoding1 {
    public static void main(String[]args){
        int[] x = new int[5];
        int k = 17;
        int treffer = 0;

        x[0] = 10;
        x[1] = 15;
        x[2] = 3;
        x[3] = 7;

        for(int y : x){
            for(int z : x){
                if(y + z == k){
                    treffer++;
                    System.out.println(y + " + " + z + " = " + k);
                }
            }
        }
        System.out.println("Treffer: " + treffer);
    }
}
