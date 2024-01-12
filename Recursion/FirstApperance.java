public class FirstApperance {
    public static void main(String[] args) {
        int[] arr={2,3,4,1,3,6,7,8};
        System.out.println(number(arr, 0, 6));
    }

    public static int number(int[] arr, int i,int item){

        if(arr.length==i){
            return -1;
        }

        if(arr[i]==item){
            return i;
        }

        return number(arr, i+1, item);
    }
}
