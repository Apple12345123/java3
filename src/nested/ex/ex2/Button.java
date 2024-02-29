package nested.ex.ex2;

public class Button {
    private OnClickListener Listener;

    public void setOnClickListener(OnClickListener listener) {
        this.Listener = listener;
    }

    public void click() {
        // null 일 때  예외처리
        if (Listener == null) {
            return;
        }
        Listener.onClick();
    }
}
