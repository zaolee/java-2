package sec03.exam01_multi_type_parameter;

// ��Ƽ ���׸� Ÿ�� Ŭ����
public class Product<T, M> {
	private T kind;
	private M model;
	
	// getter setter ����Ű �̿��ϱ�.
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
