package question2;

public interface Command<T> {
    public void execute(T t);
    public void undo();
}
