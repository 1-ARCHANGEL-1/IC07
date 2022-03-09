import java.text.NumberFormat;
import java.util.Arrays;

public class PizzaOrder
{
    public static final int MAX_PIZZAS = 100;
    private int kNumPies;
    private Pizza[] kPies = new Pizza[MAX_PIZZAS];


    public boolean addPizzaOrders(char size, boolean pepperoni, boolean sausage, boolean mushroom, boolean vegan)
    {
        if (kNumPies < MAX_PIZZAS)
        {
            kPies[kNumPies++] = new Pizza(size, pepperoni, sausage, mushroom, vegan);
            return true;
        }
        return false;
    }


    public double calcCost()
    {
        double cost = 0.0;
        for(int i = 0; i<kNumPies;i++)
        {
            switch(kPies[i].getSize())
            {
                case 'S':
                case 's':
                    cost += 8.0;
                    break;
                case 'M':
                case 'm':
                    cost += 10.0;
                    break;
                case 'L':
                case 'l':
                    cost += 12.0;
                     break;
            }
            cost += kPies[i].getNumToppings();
        }
        return cost;
    }

    @Override
    public String toString()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String output = " Pizza Order: Number of Pies = "+kNumPies+"\n";
        //loop
        for(int i = 0; i<kNumPies; i++)
        {
            output += "Pie #"+ (i+1) + ": "+kPies[i] + "\n";

        }
        output += "Total Cost = "+ calcCost();
        return output;


        /*return "PizzaOrder{" +
                "kNumPies=" + kNumPies +
                ", kPies=" + Arrays.toString(kPies) +
                '}';*/
    }
}