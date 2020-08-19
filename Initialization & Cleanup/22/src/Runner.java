//Exercise 21:   (1) Create an enum of the least-valuable six types of paper currency.
// Loop through the values( ) and print each value and its ordinal( ).
//Exercise 22:   (2) Write a switch statement for the enum in the previous example.
// For each case, output a description of that particular currency.



public class Runner {
    public static void main(String[] args) {

        for (PaperCurrency paperCurrency:PaperCurrency.values()) {
            //System.out.println("values " + paperCurrency + " ordinal " + paperCurrency.ordinal());
            switch (paperCurrency){
                case ONE:
                    System.out.println("1");
                    break;
                case TWO:
                    System.out.println("2");
                    break;
                case FIVE:
                    System.out.println("5");
                    break;
                case TEN:
                    System.out.println("10");
                    break;
                case TWENTY:
                    System.out.println("20");
                    break;
                case FIFTY:
                    System.out.println("50");
                    break;
                default:break;
            }
        }
    }
}
