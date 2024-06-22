package Collection;
import java.util.*;
class Product {
    String addProduct;
    String removeProduct;
    String setProduct;

    public void productAdd(String addProduct) {
        this.addProduct = addProduct;
    }

    public void productRemove(String removeProduct) {
        this.removeProduct = removeProduct;
    }

    public void productSet(String setProduct) {
        this.setProduct = setProduct;
    }
}

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Product sc = new Product();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Set Product");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product Name: ");
                    String addProduct = scanner.nextLine();
                    list.add(addProduct);
                    System.out.println("Added Products: " + list);
                    sc.productAdd(addProduct);
                    break;
                case 2:
                    System.out.print("Remove Product: ");
                    String removeProduct = scanner.nextLine();
                    list.remove(removeProduct);
                    System.out.println("After Remove: "+ list);
                    sc.productRemove(removeProduct);
                    break;
                case 3:
                    System.out.print("Set Product: ");
                    String setProduct = scanner.nextLine();
                    list.set(0, setProduct);
                    System.out.println("After Set: "+ list);
                    sc.productSet(setProduct);
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose 1, 2, 3, or 4.");
            }
        } while (choice != 4);
    }
}