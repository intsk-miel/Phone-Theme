package lambda;

@FunctionalInterface
public interface IDivideNumbers <D, F, S>{
    D divide(F num1, S num2);
}
