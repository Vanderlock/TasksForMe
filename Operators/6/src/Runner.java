public class Runner {
    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();

        spot.name = "Spot";
        spot.says = "Miau";



        scruffy.name = "Scruffy";
        scruffy.says = "A`m angrrrrry";

        System.out.println("I`m dog " + spot.name + " and i say: " + spot.says);
        System.out.println("I`m dog " + scruffy.name + " and i say: " + scruffy.says);

        // создаю ссылку на обьект Dog spot

        Dog copyScruffy = scruffy;


        System.out.println("compare name with == : " + scruffy.name == copyScruffy.name );
        System.out.println("compare says with == : " + scruffy.says == copyScruffy.says );
        System.out.println("compare name equals() : " + scruffy.name.equals(copyScruffy.name) );
        System.out.println("compare says equals() : " + scruffy.says.equals(copyScruffy.says) );
        System.out.println("I`m dog " + copyScruffy.name + " and i say: " + copyScruffy.says);
        //Оператор == сравнивает ссылки
        //Метод equals() сравивет содержимое


    }
}
