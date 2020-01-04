package interviewquestions;

public class ForEachLoopReadOnly {
    public static void main(String[] args) {


        int yourNum =300;
        int myNum = yourNum;

        myNum = 299;



        long[] nums ={10,20,30};

        //nums[0]=nums[0]*2;   //nums[0]*=2;

     //   System.out.println("nums[0]) = " + nums[0]) ;


        for (int x=0; x<3;x++){


            long eachIteam = nums[x];
            eachIteam =100; //does not change any thing

           // System.out.println(nums[x]*2);
            nums[x]=nums[x]*2;
        }
        System.out.println("After we modify the value");

        for (int x=0; x<3;x++){

            System.out.println(nums[x]);

        }




    }
}
