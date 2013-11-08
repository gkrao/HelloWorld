/**
*  Author : Gopal Rao
*/
public class Buttons {
	private String id;
	private String label;
	private boolean disabled;
	public Buttons() {
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return this.label;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public boolean isDisabled() {
		return this.disabled;
	}

}

