import java.util.Scanner;

public class BT1 {
    public static int[] deleteElement (int[] arr, int index){
        int[] newArr = new int[arr.length - 1];

        for (int i = index; i < arr.length-1  ; i++) {
            newArr[i] = arr[i];
        }
        for (int i = 0; i < arr.length-1 ; i++) {
             newArr[i] = arr[i+1];
        }
          return newArr;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number need delete: ");
        int indexDel = scanner.nextInt();
        for (int i = 0; i < a.length ; i++) {
            if(a[i] == indexDel ){
                indexDel=i;
            }
        }
        int[] a1 = deleteElement(a,indexDel);
        for (int i = 0; i < a1.length ; i++) {
            System.out.println(a1[i]);
        }

    }
}
