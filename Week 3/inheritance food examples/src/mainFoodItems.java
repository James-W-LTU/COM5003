import java.time.LocalDateTime;

public class mainFoodItems {
    public static void main(String[] args) {
        FreshFood apple = new FreshFood(1, "Apple", LocalDateTime.now().plusDays(10), true, "Refrigerate");
        System.out.println("FreshFood: " + apple.getItemName() + ", BBE: " + apple.getBBE());

        FrozenFood pizza = new FrozenFood(2, "Pizza", LocalDateTime.now().plusMonths(6), false, true, -18);
        System.out.println("FrozenFood: " + pizza.getItemName() +  ", Use Before:" + pizza.getUseBefore());
    }
}

