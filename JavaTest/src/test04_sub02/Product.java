package test04_sub02;

public class Product {
	protected String productId;
	protected String productName;
	protected int price;
	protected int quantity;
	
	
	
	
	public Product(String productId,String productName,int price,int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	public void updatePrice(int price) {
		this.price = price;
		System.out.println("키보드 가격 수정됨");
	}
	
	public void addStock(int quantity) {
		this.quantity += quantity;
		System.out.println("키보드 "+this.quantity+"개 재고 추가 됨");
	}
	
	public void printProdctInfo() {
		System.out.println("상품 ID: "+productId);
		System.out.println("상품 이름: "+productName);
		System.out.println("상품 가격: "+price);
		System.out.println("재고 수량: "+quantity);
	}

	public static void main(String[] args) {
		Product product = new Product("P001","키보드",35000,10);
		
		product.printProdctInfo();
		System.out.println("---------------");
		
		product.updatePrice(30000);
		System.out.println("---------------");
		
		product.printProdctInfo();
		System.out.println("---------------");
		
		product.addStock(5);
		
		System.out.println("---------------");
		
		product.printProdctInfo();
		System.out.println("---------------");
		
	}
	
	
}
