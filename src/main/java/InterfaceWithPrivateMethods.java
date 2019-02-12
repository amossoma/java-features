public interface InterfaceWithPrivateMethods {
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
        InterfaceWithPrivateMethods interfaceWithPrivateMethods = new InterfaceWithPrivateMethods() {};
        interfaceWithPrivateMethods.methodWithDefaultImplementation();
        interfaceWithPrivateMethods.anotherMethodWithDefaultImplementation();
    }
}
