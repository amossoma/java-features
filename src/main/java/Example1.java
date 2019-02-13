public class Example1 {

    public static void main(String[] args) {
        var index = 10;
        System.out.println(index);
        var name = "John";
        System.out.println(name.toLowerCase());
        new Thread(() -> {
            var user = "Test";

            System.out.println(user);
        }).start();
    }

}