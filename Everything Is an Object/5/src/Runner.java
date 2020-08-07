public class Runner {
    public static void main(String[] args) {
        DataOnly dataOnly = new DataOnly(10,2.12f,true);

        System.out.println("Присвоил значения, теперь вывожу их: \ni= " + dataOnly.getI() + "\nf= " + dataOnly.getF() + "\nb= " + dataOnly.isB());
    }
}
