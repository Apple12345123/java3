package nested.ex.ex4;
/*
중첩 인터페이스가 내부에 선언된 CheckBox 클래스가 아래와 같이 있습니다.
체크박스가 선택되었을 때 "배경을 변경합니다"라고 실행되는
리스너를 클래스와 익명 객체로 각각 만들어보세요.

public class CheckBox {
	OnSelectListener listener;

	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}

	void select() {
		listener.onSelect();
	}

	static interface OnSelectListener {
		void onSelect();
	}
}
 */
public class Ex4 {
    public static void main(String[] args) {
        CheckBox checkBox = new CheckBox();

        // 클래스를 만드는 경우
        var listener = new ChangeBackgroundSelectListener();
        checkBox.setOnSelectListener(listener);
        checkBox.select();

        // 익명 클래스로 리스너를 설정하는 경우
        checkBox.setOnSelectListener(new CheckBox.OnSelectListener() {
            @Override
            public void onSelect() {
                    System.out.println("배경을 변경합니다. (익명)");
                }
        });
        checkBox.select();

    }
}
