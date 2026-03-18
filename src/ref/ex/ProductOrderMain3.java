package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요:");
        int count = sc.nextInt();
        sc.nextLine();

        ProductOrder[] orders = new ProductOrder[count];
        for (int i = 0; i < count; i++) {
            orders[i] = new ProductOrder();
            System.out.println(i+1+"번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            orders[i].productName = sc.nextLine();
            System.out.print("가격: ");
            orders[i].price = sc.nextInt();
            System.out.print("수량: ");
            orders[i].quantity = sc.nextInt();
            sc.nextLine();//nextint는 엔터를 버퍼에 남겨놓는다. int끼리는 엔터를무시
                            //하지만 nextline는 엔터를 먹는다.
        }

        printOrders(orders);
        System.out.println("총 결제금액: " + getTotalAmount(orders));
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: "+order.productName+" 가격: "+order.price+" 수량: "+order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
        return total;
    }



}
