import java.time.LocalDateTime;

public class mainFoodItems {
    public static void main(String[] args) {
        FreshFood apple = new FreshFood(1, "Apple", LocalDateTime.now().plusDays(10), true, "Refrigerate");
        System.out.println("Fresh Food: " + apple.getItemName() + ", BBE: " + apple.getBBE());

        FrozenFood pizza = new FrozenFood(2, "Pizza", LocalDateTime.now().plusMonths(6), false, true, -18);
        System.out.println("Frozen Food: " + pizza.getItemName() +  ", Use Before:" + pizza.getUseBefore());

        CannedFood tomatoes = new CannedFood(3, "Tomatoes", LocalDateTime.now().plusMonths(24),true, true);
        System.out.println("Canned Food: " + tomatoes.getItemName() +  ", Use Before:" + tomatoes.getUseBefore());

        DryFood rice = new DryFood(4, "Rice", LocalDateTime.now().plusMonths(12),false, 650);
        System.out.println("Dry Food: " + rice.getItemName() +  ", Use Before:" + rice.getUseBefore());
    }
}

