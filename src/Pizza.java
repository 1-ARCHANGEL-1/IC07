public class Pizza
{
    private char kSize;
    private boolean kPepperoni;
    private boolean kSausage;
    private boolean kMushrooms;
    private boolean kVegan;

    public Pizza(char size, boolean pepperoni, boolean sausage, boolean mushrooms, boolean vegan) {
        kSize = size;
        kPepperoni = pepperoni;
        kSausage = sausage;
        kMushrooms = mushrooms;
        kVegan = vegan;
    }

    public char getSize()
    {
        return kSize;
    }
    public int getNumToppings()
    {
        int amtToppings = 0;
        if(kPepperoni)
         amtToppings += 1;
        if(kMushrooms)
            amtToppings += 1;
        if(kSausage)
          amtToppings += 1;
        return amtToppings;
    }

    @Override
    public String toString()
    {
       String strPepper = (( kPepperoni)? "Pepperoni": "");
        String strSausage = (( kSausage)? "Sausage": "");
        String strMushrooms = (( kMushrooms)? "Mushrooms": "");
        String strVegan = (( kVegan)? "Vegan": "");
         return "Pizza{" +
                "Size=" + kSize + strPepper + strSausage + strMushrooms + strVegan +
                '}';


    }
}
