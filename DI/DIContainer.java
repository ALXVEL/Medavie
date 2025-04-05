package DI;
import java.util.Map;

import Appliances.AirConditioner;
import Appliances.Fan;
import Appliances.Light;
import Interfaces.Appliance;

public class DIContainer {
    public static Map<String, Appliance> getAppliances(){
        // here is the dependency injection container
        // this makes it easier to add future appliances without
        // breaking the controller/view code
        return Map.of(
            "light", new Light(),
            "fan", new Fan(),
            "ac", new AirConditioner()
        );
    }
}
