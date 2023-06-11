public class ArrayExample{


    static void multiArray(){

        int [][] array_1 = new int [3][2];
        array_1[0][1] = 11;
        array_1[1][1] = 12;
        array_1[2][1] = 13;
        // array_1 = {11,12,13}
        System.out.println(array_1[0][1]);
        System.out.println(array_1[1][1]);
        System.out.println(array_1[2][1]);
        

         int [][] array = {{8,9},{10,11},{15,20}};
         for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[i].length; j++)
            System.out.println(array[i][j]);
         }
         

        System.out.println(array[0][1]);
        System.out.println("Array lenght is = "+ array.length);
    }
    public static void main(String[] args) {

        int [] ages = new int[5];
        ages[0] = 22;
        ages[1] = 33;
        ages[2] = 44;
        ages[3] = 55;
        ages[4] = 66;
        // System.out.println(ages[0]);
        // System.out.println(ages[1]);
        // System.out.println(ages[2]);
        // System.out.println(ages[3]);
        // System.out.println(ages[4]);

        // for(int i= 0; i<ages.length; i++){
        //     System.out.println(ages[i]);
        //  }

        
         for(int x: ages ){
            System.out.println(x);
         }
         int sum = 0;
         for(int i = 0; i<ages.length; i++){
            sum = sum+ages[i];
         }
         System.out.println("ages sum is = "+ sum);

        multiArray();
       

        

    }
}