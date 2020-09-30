public class GenericMethods {
    <T> void bookMethod(T x){
        System.out.println(x.getClass().getName());
    }
    <T> void ex9Method(T x, T y, T z){
        System.out.println(x.getClass().getName());
        System.out.println(y.getClass().getName());
        System.out.println(z.getClass().getName());
    }
    <T> void ex10Method(T x, T y, String z){
        System.out.println(x.getClass().getName());
        System.out.println(y.getClass().getName());
        System.out.println(z.getClass().getName());
    }
}
