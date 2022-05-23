package project.market;

import project.shop.Shop;

public interface ShopOperations {
	public boolean insertShop(Shop s);
	public boolean removeShop(Shop s);
	public Shop searchShop(String sid);
	public void showAllShops();
}
