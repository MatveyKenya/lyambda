package hardWorker;

@FunctionalInterface
public interface OnTaskErrorListener {
    boolean onError(int i);
}
