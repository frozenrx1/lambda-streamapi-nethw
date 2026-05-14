package task12;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}