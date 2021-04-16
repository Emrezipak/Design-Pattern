package AbstractFactoryPattern;

public class ModelNote9 implements IPhone {
	private String model;
	private double price;
	private int width;
	private int height;

	public ModelNote9(String model, double price, int width, int height) {
		this.model = model;
		this.price = price;
		this.width = width;
		this.height = height;
	}

	@Override
	public String model() {
		return model;
	}


	@Override
	public double price() {
		return price;
	}


	@Override
	public int width() {
		return width;
	}


	@Override
	public int height() {
		return height;
	}

	@Override
	public String toString() {
		return "model : "+model+"\nPrice : "+price+"\nWidth : "+width+"\nheight : "+height;
	}

}
