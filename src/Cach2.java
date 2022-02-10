import java.util.Scanner;

public class Cach2 {
    public static void main(String[] args) {

        // Khởi tạo mảng gồm 5 phần tử chưa gán giá trị
        int [] arr;
        arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element: ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }
        // Kiểm tra phần tử x cần xóa có trong mảng hay không
        int x;
        int indexDel = 0;
        Scanner scannerX = new Scanner(System.in);
        System.out.println("Enter number delete: ");
        x = scannerX.nextInt();
        boolean isExit = false;
        for (int i = 0; i < arr.length ; i++) {
            if(x==arr[i]){
                System.out.println("index: " + i);
                isExit=true;
                indexDel = i;
                break;
            }
        }
        if(!isExit){
            System.out.println("Not found " + x + " in the list");
        }

        if(isExit){
            int[] newArr;
            newArr = new int[arr.length-1];
            for (int i = 0; i <indexDel ; i++) {
                newArr[i] = arr[i];
            }
            for (int i = indexDel; i < newArr.length ; i++) {
                newArr[i]=arr[i+1];
            }
            arr = newArr;
            System.out.println("list Element in the new array: ");
            for (int i = 0; i <arr.length ; i++) {
                System.out.print(arr[i] + "\t");
            }
        }

    }
}
