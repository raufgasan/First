package day27;

public class SingleDimensionalArray {
    public static void main(String[] args) {

        int [][] nums ={{1,2,3},{5,6,7,8},{11,15,18,21,22,26,28}};

        for (int x = 0; x <nums.length ; x++) {
            for (int i = 0; i <nums[x].length ; i++) {
                if (nums[x][i]%2==0){
                    System.out.println(nums[x][i]+"");
                }
            }
        }




    }
}
