package kyu8;

public class Swapper {

    public Object[] arguments;

    public Swapper(final Object[] args) {
        this.arguments = args;
    }

    public void swapValues() {
        Object[] args = new Object[]{arguments[0], arguments[1]};
        arguments[0] = args[1];
        arguments[1] = args[0];
    }

}
