package c.inner.practice;

public class MyPage {
    InputBox input;
    public static void main(String[] args) {
        MyPage page = new MyPage();
        page.setUI();
        page.pressKey();
    }
    public void setUI() { 
        input = new InputBox();
        KeyEventListener listener = new KeyEventListener() {
            public void onKeyUp() {
                System.out.println("Key Up");
            }
            public void onKeyDown() {
                System.out.println("Key Down");
            }
        };
        input.setKeyListener(listener);
    }
    public void pressKey() {
        input.listenerCalled(input.KEY_DOWN);
        input.listenerCalled(input.KEY_UP);
    }
}

