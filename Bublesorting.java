class BubbleSort {
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }


    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
    public class Bublesorting {

    public static void main(String[] args)
    {
       int arr[]={8,4,6,2,9,3,1};


       for(int i=0;i<arr.length;i++)
       {
            System.out.print(arr[i]+" ");
       }
System.out.println("");
    BubbleSort ob = new BubbleSort();
    ob.bubbleSort(arr);

    System.out.println("Sorted array"); 
        ob.printArray(arr); 
    }
}
