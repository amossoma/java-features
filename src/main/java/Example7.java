public class Example7 {
    public static void main(String[] args) {
        System.out.println(new Test<Integer>() {
            @Override
            Integer create() {
                return 5;
            }
        }.create());
    }
}
abstract class Test<T> {
    abstract T create();
}