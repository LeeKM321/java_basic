package etc.lambda;

@FunctionalInterface
public interface GenericFunction<X, Y> {

    // X에서 Y를 추출해 줄게.
    Y apply(X x);

}
