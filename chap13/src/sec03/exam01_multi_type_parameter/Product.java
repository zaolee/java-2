package sec03.exam01_multi_type_parameter;

// 멀티 제네릭 타입 클래스
public class Product<T, M> {
	private T kind;
	private M model;
	
	// getter setter 단축키 이용하기.
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}	
}
