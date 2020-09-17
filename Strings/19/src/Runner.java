//Exercise 19: (8) Building on the previous two exercises, write a program that examines
//Java source code and produces all the class names used in a particular program.


public class Runner {


    public static void main(String[] args) {
        String source = FileReaderService.getFileSource("src\\Runner.java");
        String clearSource = FileReaderService.getValues("\".*?\"", source);
        System.out.println(clearSource);
        clearSource = FileReaderService.getValues("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)", source);
        System.out.println(clearSource);
        clearSource = FileReaderService.getValues("class[\\s|\\n]([\\w|\\d]+)",source);
        System.out.println(clearSource);

    }
}
