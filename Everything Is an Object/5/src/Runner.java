public class Runner {
    public static void main(String[] args) {
        DataOnly dataOnly = new DataOnly();
        dataOnly.i = 10;
        dataOnly.f = 2.12f;
        dataOnly.b = true;
        System.out.println("Присвоил значения, теперь вывожу их: " + dataOnly.toString());
    }
}
