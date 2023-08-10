	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	public class LeastOffer {
	class Item {
	    private String name;
	    private double price;
	    private double discountPercentage;

	    public Item(String name, double price, double discountPercentage) {
	        this.name = name;
	        this.price = price;
	        this.discountPercentage = discountPercentage;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getDiscountAmount() {
	        return (price * discountPercentage) / 100;
	    }

	    public double getDiscountPercentage() {
	        return discountPercentage;
	    }
	}

	public class main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of items: ");
	        int itemCount = scanner.nextInt();
	        scanner.nextLine();
	        List<Item> items = new ArrayList<>();

	        for (int i = 0; i < itemCount; i++) {
	            System.out.print("Enter item details (name, price, discount percentage): ");
	            String input = scanner.nextLine();
	            String[] details = input.split(",");

	            String name = details[0].trim();
	            double price = Double.parseDouble(details[1].trim());
	            double discountPercentage = Double.parseDouble(details[2].trim());

	           items.add(new Item(name, price, discountPercentage));
	        }

	        double minDiscount = Double.MAX_VALUE;
	        List<String> minDiscountItems = new ArrayList<>();

	        for (Item item : items) {
	            double discount = item.getDiscountAmount();
	            if (discount < minDiscount) {
	                minDiscount = discount;
	                minDiscountItems.clear();
	                minDiscountItems.add(item.getName());
	            } else if (discount == minDiscount) {
	                minDiscountItems.add(item.getName());
	            }
	        }

	        System.out.println("Items with Minimum Discount:");
	        for (String itemName : minDiscountItems) {
	            System.out.println(itemName);
	        }
	    }
	}
	}

