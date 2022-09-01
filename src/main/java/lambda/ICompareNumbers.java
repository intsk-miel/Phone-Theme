package lambda;

@FunctionalInterface
public interface ICompareNumbers <C> {
    boolean compare(C number1, C number2);
}
