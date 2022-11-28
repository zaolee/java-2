package sec10.exam04_singleton;

public class SingletonLazyInit {
	private volatile static SingletonLazyInit singleton; // DCL�� ���� volatile Ű���� �̿�

	private SingletonLazyInit() {
	}

	public static SingletonLazyInit getInstance() {
		if (singleton == null) {
			synchronized (SingletonLazyInit.class) { // �ν��Ͻ��� �����Ҷ��� ����ȭ ��Ŵ
				if (singleton == null) { // DCL(Double-Checking Locking)
					singleton = new SingletonLazyInit();
				}
			}
		}
		return singleton;
	}
}
