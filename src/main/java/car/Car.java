package car;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;

@Entity
@Table
public class Car {
	@Id
	private int carId;
	private String model;
	private String brand;
	private String color;
	private double price;
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", model=" + model + ", brand=" + brand + ", color=" + color + ", price=" + price
				+ "]";
	}
	public static void main(String[] args) {
		Car c = new Car();
		
		c.setBrand("Audi");
		c.setCarId(2);
		c.setColor("White");
		c.setModel("R8");
		c.setPrice(19000000);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("carwaalla");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
//		// to insert into the database
//		et.begin();
//		em.persist(c);//persist method helps to insert object in database
//		et.commit();

		
//		//update
//		et.begin();
//		em.merge(c);
//		et.commit();
		
//		//read or retrieve
//		Car car = em.find(Car.class, 2);
//		System.out.println(car);
		
//		// to delete
//		Car audi = em.find(Car.class, 2);
//		et.begin();
//		System.out.println(audi);
//		em.remove(audi);
//		et.commit();
	}
}
