package com.company;

public interface subarray {
    public static void main(String[] args) {
        int[] arr={1,-2,6,-1,3};
        int max=0;
        int sum=0;
        System.out.println( arr.length);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <= arr.length ; j++) {
                for (int k = i; k <j ; k++) {
                    sum=sum+arr[k];
                    System.out.print(arr[k]+" ");
                }
                System.out.print(" "+sum);
                if(max<sum)
                {
                    max=sum;
                }
                System.out.println();
                sum=0;
            }

        }
        System.out.println(max);

    }
}
