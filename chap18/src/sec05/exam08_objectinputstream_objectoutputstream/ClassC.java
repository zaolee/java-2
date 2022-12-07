package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.Serializable;

public class ClassC implements Serializable {
	static final long serialVersionUID = -5993977944878930441L; // 이거 자주 보임. 뭔뜻인지 알아놓기.
	// 애초에 부여된 시리얼번호 넣어놓기.고정.(직렬화, 역직렬화할때 사용)
	// 직렬화할때 serialVersionUID가 자동적으로 생성(같은 클래스인지판별) 근데 역직렬할때 해당 클래스에 내용 더 추가하고 컴파일하면 코드가 바뀌니까 에러나는거.
	int field1;
	int field2; 
	// 컴파일을 새로하면 시리얼 번호가 바뀜. 필드2를 추가하면 시리얼번호가 맞지않아서 에러가 나게됨.
	// 이거 직렬화, 역직렬화에서 문제생김. -> 컴파일해도 바뀌지 않도록 할꺼임
}
