package sec03.exam01_multi_type_parameter;

public class ProductExample {
	public static void main(String[] args) {
		// Product클래스는 타입이 <kind, model>임
		// 해당 Tv, Car클래스에 넣어주는거.
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("스마트TV");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}
}
