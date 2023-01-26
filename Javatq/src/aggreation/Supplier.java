package aggreation;

public class Supplier {
	
	int _id;
	String name;
	Item i;
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Item getI() {
		return i;
	}
	public void setI(Item i) {
		this.i = i;
	}
	@Override
	public String toString() {
		return "Supplier [_id=" + _id + ", name=" + name + ", i=" + i + "]";
	}
	
	

}
