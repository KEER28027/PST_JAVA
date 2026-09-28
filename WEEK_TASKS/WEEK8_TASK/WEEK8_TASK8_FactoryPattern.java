import java.util.*;

public class WEEK8_TASK8_FactoryPattern {
    interface Food { String getType(); }
    static class Pizza implements Food { public String getType(){return "Someone ordered Fast Food!";} }
    static class Cake implements Food { public String getType(){return "Someone ordered a Dessert!";} }
    static class FoodFactory {
        Food getFood(String order){return "cake".equalsIgnoreCase(order)?new Cake():new Pizza();}
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); String order=in.hasNext()?in.next():"pizza";
        Food food=new FoodFactory().getFood(order);
        System.out.println("The factory returned class "+food.getClass().getSimpleName());
        System.out.println(food.getType());in.close();
    }
}
