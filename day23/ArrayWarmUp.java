package day23;

public class ArrayWarmUp {

    public static void main(String[] args) {

        int max =0;
        int min = 0;
        int sum = 0;
        int average =0;
        int[] nums = {1,2,3,4,5,6,7};

        for (int x = nums.length-1; x >= 0; x--) {
            if(max<nums[x]){
                max=nums[x];
                System.out.println("max = " + max);}



            System.out.print( nums[x]);

        }


        System.out.println();


            int lastItem = nums.length;


        System.out.println("lastItem = " + lastItem);


        System.out.println("Middle item value = "+nums[nums.length/2]);

        for (int x = 0; x <nums.length ; x++) {
            sum+=nums[x];

        }

        System.out.println("Sum = " + sum);

        System.out.println("Average ="+ sum/nums.length);

        for (int x = 0; x <nums.length ; x++) {
            if(min>nums[x]){
                min=nums[x];
            }

        }
        System.out.println("Min = "+min);



    }
}
