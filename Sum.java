public class Sum {
    public static void main(String[] args) {
        // int a[] = { 2,2,2,9,7};
        // int sum = 0;
        // for (int i = 0; i < a.length; i++)
        // sum += a[i];
        // System.out.println(sum);
        // System.out.println("avg are "+ sum/a.length);
        // sum++;

        // int[] org = { 24, 5, 3, 2, 4 };
        // for (int i = 0; i < org.length; i++)
        // System.out.println("origianl " + org[i]);
        // int[] cpy = new int[org.length];
        // cpy = org;
        // cpy[0]++;
        // for (int i = 0; i < org.length; i++)
        // System.out.println("copy " + cpy[i]);

        // int[] org = { 24, 5, 3, 2, 4 };
        // for (int i = 0; i < org.length; i++)
        // System.out.print(" :" +org[i]);
        // System.out.println();
        // for (int i = org.length-1; i >= 0; i--)
        // System.out.print(" :" +org[i]);

        int[] org = { 24, 5, 3, 2, 4 };
        int key = 8;
        int index = -1;
        for (int i = 0; i < org.length; i++) {
            if (org[i] == key) {
                index = i;
                break;
            }
            
        }
        if(index>=0){
            System.out.println("number is located at " + index + " index");  
        }
        else{
            System.out.println("value not found well");
        }
        
        
    }
}