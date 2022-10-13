public class quickSort {
    public static int partition(int a[],int l,int h)
    {
        int i=l;
        int j=h;
        int pivot=a[i];
        while(i<j)
        {
            while(a[i]<=pivot) i++;
            while(a[h]>pivot) j--;
            swap(a,i,j);
        }
        swap(a,j,l);
        return pivot;
    }

    public static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }


    public static void quik(int a[],int l,int h)
    {
        if(l<h)
        {
            int pivot=partition(a,l, h);
            quik(a,l, pivot-1);
            quik(a,pivot+1,h );
        }
    }

    public static void main(String[] args) {
        int a[]={4, 2, 8, 3, 1, 5, 7,11,6};
        quik(a, 0, a.length-1);
        System.out.println("After All---->");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
