package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.Serializable;

public class ClassC implements Serializable {
	static final long serialVersionUID = -5993977944878930441L; // �̰� ���� ����. �������� �˾Ƴ���.
	// ���ʿ� �ο��� �ø����ȣ �־����.����.(����ȭ, ������ȭ�Ҷ� ���)
	// ����ȭ�Ҷ� serialVersionUID�� �ڵ������� ����(���� Ŭ���������Ǻ�) �ٵ� �������Ҷ� �ش� Ŭ������ ���� �� �߰��ϰ� �������ϸ� �ڵ尡 �ٲ�ϱ� �������°�.
	int field1;
	int field2; 
	// �������� �����ϸ� �ø��� ��ȣ�� �ٲ�. �ʵ�2�� �߰��ϸ� �ø����ȣ�� �����ʾƼ� ������ ���Ե�.
	// �̰� ����ȭ, ������ȭ���� ��������. -> �������ص� �ٲ��� �ʵ��� �Ҳ���
}
