package c.inner;

public class MagicButton {
    public MagicButton() {
    }
    private EventListener listener;
    public void setListener(EventListener listener) {
        this.listener = listener;
    }
    public void onClkickProcess() {
        if(listener != null) {
            listener.onClick();
        }
    }
}
