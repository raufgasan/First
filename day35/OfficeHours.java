package day35;

public class OfficeHours {
    public static void main(String[] args) {


        System.out.println(RemoveDup("AAAAMMBBBASLJASHAKSKANSJKFNKALSNF"));

        System.out.println(Frequency("AAAAAAAAAAAAFFADSLMASD:LASD:L<AS:<D:AS<D:AS:L", 'A'));

        System.out.println( frequencyOfChar("AAAAAAAAAAAAFFADSLMASD:LASD:L<AS:<D:AS<D:AS:L"));
    }

//    1.  write a return method called RemoveDup that accepts a String and removes duplicate values from the String
//    Ex:
//    RemoveDuplicate("aaabbbccc") ==> "abc"


    public static String RemoveDup(String str) {

        String result1 = "";

        for (int x = 0; x < str.length(); x++) {
            if (!result1.contains((str.substring(x, x + 1)))) {
                result1 += str.substring(x, x + 1);

            }
        }

        return result1;
    }

//2. write a return method called Frequency that accepts String and  char, the method will return the total number of ocuurence of the given char in the given string
//    Ex:
//    Frequency("AAABBB", 'A') ==> 3
    public static int Frequency (String str, char ch){



        int count = 0;
       char []arr = str.toCharArray();
        for (char each : arr) {

            if (each==ch){
                count++;
            }

        }
        return count;
    }


//    3. Combined the methods 1 & 2 to write a method that prints the the frequency of each characters from the given String
//    Ex:
//    FrequencyOfChars("CCAAABBBCCCC")  ==>"A3B3C6"


public static String frequencyOfChar(String str){

        String result ="";
     String nonDup = RemoveDup(str);

    for (int x = 0; x <nonDup.length() ; x++) {
        int count = Frequency(str, nonDup.charAt(x));
        result+=""+nonDup.charAt(x)+count;
    }


return result;

}

}
