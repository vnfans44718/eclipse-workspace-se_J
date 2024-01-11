package button;

public class Button {
	OnClickListener listener;

	public void setOnClickListener(OnClickListener listener) {

	}

	public void touch() {
		listener.onClick();
	}

	public static interface OnClickListener {

		public void onClick();

	}

}
