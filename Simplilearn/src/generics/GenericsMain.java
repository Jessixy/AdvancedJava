package generics;

public class GenericsMain {

    public static void main(String[] args) {
        System.out.println("Generics");

        SingleGenericHolder<Integer> iObj = new SingleGenericHolder<Integer>(10);
        System.out.println(iObj.getObj());

        SingleGenericHolder<String> sObj = new SingleGenericHolder<String>("String Holder");
        System.out.println(sObj.getObj());

        DualGenericHolder< String, Integer> dualObj = new DualGenericHolder<String, Integer>("Dual Holder String", 10);
        dualObj.display();

    }
}
