package shop;

import project.product.Product;

public interface ProductOperations {
	public boolean insertProduct(Product p);
	public boolean removeProduct(Product p);
	public Product searchProduct(String pid);
	public void showAllProducts( );
}
