public class Ford extends Car{

    public Ford(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> break";
    }
}
