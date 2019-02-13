public interface Example2 {
    default void methodWithDefaultImplementation() {
        doSomething();
    }

    default void anotherMethodWithDefaultImplementation() {
        doSomething();
    }

    private void doSomething() {
        System.out.println("Hello World!!!");
    }

    static void main(String[] args) {
        Example2 interfaceWithPrivateMethods = new Example2() {};
        interfaceWithPrivateMethods.methodWithDefaultImplementation();
        interfaceWithPrivateMethods.anotherMethodWithDefaultImplementation();
    }
}
