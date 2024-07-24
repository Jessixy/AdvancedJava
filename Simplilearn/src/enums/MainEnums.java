package enums;

public class MainEnums {

    // Enum declaration
    enum Color {
        RED, GREEN, BLUE;
    }


    // A more Complex Enum
    enum ComplexColor {
        RED("Red"),
        GREEN("Green"),
        BLUE("Blue");

        private String value;

        ComplexColor(String value){
            this.value = value;
        }

        // Getter
        public String getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enums");
        // Enum Usage
        Color red = Color.RED;
        System.out.println("RED Enum " + red.name() );

        System.out.println("------------------------------------------");

        ComplexColor complexRed = ComplexColor.RED;
        System.out.println("Value of Complex Enum: " + complexRed.name());
        System.out.println("Value of Complex Enum: " + complexRed.getValue());



        // All Colors
        System.out.println("All existing colors in enum");
        for (Color color : Color.values()) {
            System.out.println(color);
        }



    }
}
