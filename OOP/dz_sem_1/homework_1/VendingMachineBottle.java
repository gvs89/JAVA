import java.util.ArrayList;
import java.util.List;

public class VendingMachineBottle implements VendingMachine {
    List<BottleOfWater> bottleOfWaterList = new ArrayList<>();


    @Override
    public void initProduct() {
    }


    public void initProduct(List<BottleOfWater> bottle) {
        this.bottleOfWaterList = bottle;
    }


    @Override
    public String getProduct() {
        return null;
    }

    public String getProduct(String name) {
        for (BottleOfWater el : bottleOfWaterList) {
            if (el.getName().equals(name)) return el.toString();
        }
        return "Не найдено!";
    }
}
