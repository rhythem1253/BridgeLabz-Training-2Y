import java.util.ArrayList;
import java.util.List;

public class Problem15_MealPlan {
    interface MealPlan {}
    static class VegetarianMeal implements MealPlan { public String toString(){return "VegetarianMeal";} }
    static class VeganMeal implements MealPlan { public String toString(){return "VeganMeal";} }
    static class KetoMeal implements MealPlan { public String toString(){return "KetoMeal";} }

    public static class Meal<T extends MealPlan> {
        private T plan;
        public Meal(T plan){ this.plan = plan; }
        public T getPlan(){ return plan; }
        public String toString(){ return "Meal: " + plan; }
    }

    public static <T extends MealPlan> Meal<T> validateAndGenerate(T plan) {
        // simple validation example: always accept in this demo
        return new Meal<>(plan);
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> m1 = validateAndGenerate(new VegetarianMeal());
        Meal<VeganMeal> m2 = validateAndGenerate(new VeganMeal());
        System.out.println(m1);
        System.out.println(m2);
    }
}
