
// 1. Smart Home Lighting Automation using Lambdas

interface LightAction {
    void execute();
}

public class One {
    public static void main(String[] args) {
        LightAction motion = () -> System.out.println("Lights ON due to motion.");
        LightAction nightTime = () -> System.out.println("Lights dimmed for night.");
        LightAction voice = () -> System.out.println("Lights changing color via voice command.");

        motion.execute();
        nightTime.execute();
        voice.execute();
    }
}
