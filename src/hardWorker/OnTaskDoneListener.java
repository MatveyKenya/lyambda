package hardWorker;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
