package id.anggra;

// A superclass variable can reference a subclass object

/*
Output:

Volume of boxWeight is 105.0
Weight of boxWeight is 8.37

Volume of plainbox is 105.0
 */
public class RefDemo
{
    public static void main(String[] args)
    {
        BoxWeight boxWeight = new BoxWeight(3, 5, 7, 8.37);
        Box plainBox = new Box();
        double vol;

        vol = boxWeight.volume();
        System.out.println("Volume of boxWeight is " + vol);
        System.out.println("Weight of boxWeight is " + boxWeight.weight);
        System.out.println();

        // assign BoxWeight reference to Box reference
        plainBox = boxWeight;

        vol = plainBox.volume(); // OK, volume() defined in Box
        System.out.println("Volume of plainbox is " + vol);

        /* The following statement is invalid because plainbox does not define a weight member.
         */

        //System.out.println("Weight of plainbox is " + plainBox.weight);
    }
}
