package repl;

public class Repl_166_Methods_WithReturn4_ProfitorLoss {

    public static void main(String[] args) {
//
//        c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
//        it returns a string value that can be "profit","loss","no loss"
//
//        for example:
//        c_profis(100,1500)
//        returns : "profit"
//
//        c_profis(20,5)
//        returns : "loss"
//
//        c_profis(100,100)
//        returns : "no loss"
    }

    public String c_profits (int buyPrice,int sellPrice)
    {
        //your code here
        if (buyPrice<sellPrice){
            return "profit";
        }else if (buyPrice>sellPrice){
            return "loss";
        }
            return "no loss";


    }
}
