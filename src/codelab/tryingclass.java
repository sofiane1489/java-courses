package codelab;
public class tryingclass {

    public static void main(String[] args) {

        int[] a={1,5,7,4,8,9,3,2,0};
        int temp;
        for (int i = 1; i <a.length ; i++) {
            for (int j = i; j > 0; j--) {
                if(a[j]<a[j-1]){
                      temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                   }

                 }
            }
			for (int i = 0; i <a.length ; i++)
            System.out.println(a[i]);


    }
}






















