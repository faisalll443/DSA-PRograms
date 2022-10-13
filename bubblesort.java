//further optimization is needed
public class bubblesort {
    
    public static void main(String[] args) {
        int a[]={4,3,7,1,5};
        for (int i = 0; i < a.length-1; i++) {
            
            for (int j = 0; j < a.length-i-1; j++) {
                if(a[j]>a[j+1])
                {
                    swap(a,j+1,j);
                }
            }

        }

        System.out.println("After Bubble Sorting---->");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        }

    }

    public static void swap(int[] a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

}