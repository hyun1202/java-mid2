package collection.map.test.cart;

// 장바구니 추가
// 상품의 이름과 가격이 같으면 같은 상품
// 같으면 기존에 담긴 상품에 수량 추가
// 다르면 새로운 상품 추가

// 장바구니 제거
// 수량 감소, 수량이 0보다 작으면 상품이 장바구니에서 제거
public class CartMain {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("사과", 1000), 1);
        cart.add(new Product("바나나", 500), 1);
        cart.printAll();

        cart.add(new Product("사과", 1000), 2);
        cart.printAll();

        cart.minus(new Product("사과", 1000), 3);
        cart.printAll();
    }
}
