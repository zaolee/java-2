package sec03.exam02_hashcode;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		} 
		return false;
	}
	
	@Override
	public int hashCode() {
		return number; // 자기객체 필드의 값을 return하도록 재정의함.                 
	}
}

// 비교하려면 논리적으로 맞아야되기때문에 equals와 hashcode의 재정의 필수.
