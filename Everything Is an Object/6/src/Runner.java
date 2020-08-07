public class Runner {
    public static void main(String[] args) {
        String string = "";
        if (string == null){
            System.out.println("String is null");
        }else if (string.isEmpty()){
            System.out.println("String is empty, but storage this: " +storage(string));
        }else{
            System.out.println("Bytes to storage this string: " + storage(string));
        }


    }
    static int storage(String s){
        return s.length()*2;
    }
}
