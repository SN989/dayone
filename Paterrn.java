public class Paterrn {
    public static void main(String[] args) {
        // int k=1;
        // for(int r=1;r<=4;r++){
        //     for(int c=1;c<=r;c++){
        //         System.out.print(k);
        //         k=k+1;
        //     }
        //     System.out.println();
        // }
        for(int r=5;r>=1;r--){
            for(int c=1;c<=r;c++){
                System.out.print(r);
            }
            System.out.println();
        }
    }
}
