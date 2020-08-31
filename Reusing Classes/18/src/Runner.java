

//Exercise 18:   (2) Create a class with a static final field and a final field
// and demonstrate the difference between the two.


public class Runner {
    public static void main(String[] args) {
        Difference d1 = new Difference("d1");
        Difference d2 = new Difference("d2");
        Difference d3 = new Difference("d3");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);


        //output

        //d1: sft:Test@1c7c054 , ft:Test@12204a1 , SFS:static final , fs:final , SFI:1040662398 , fi:1545055522
        //d2: sft:Test@1c7c054 , ft:Test@a298b7 , SFS:static final , fs:final , SFI:1040662398 , fi:-808880560
        //d3: sft:Test@1c7c054 , ft:Test@14991ad , SFS:static final , fs:final , SFI:1040662398 , fi:96810377

        // final static means that this variable is constant and is associated only with the class itself, that is,
        // "one constant variable per class", while final means "one constant variable per instance"

        //I cant change constant values
    }
}
