package id.anggra;

// Contoh simple dari inheritance

// membuat superclass
class A
{
    int i, j;

    void showij()
    {
        System.out.println("i dan j: " + i + " " + j);
    }
}

// membuat subclass b mengextend dari class a
class B extends A
{
    int k;

    void showk()
    {
        System.out.println("k: " + k);
    }

    void sum()
    {
        System.out.println("i+j+k: " + (i+j+k));
    }
}

/*
Program Utama

output:
Contents of superOb:
i dan j: 10 20

Contenst of subOb:
i dan j: 7 8
k: 9

Sum of i, j and k in subob:
i+j+k: 24
 */
class SimpleInheritance
{
    public static void main(String[] args)
    {
        A superOb = new A();
        B subOb = new B();

        // The superclass may be used by itself.
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of superOb: ");
        superOb.showij();
        System.out.println();

        /*
        The subclass has access to all public members of its superclass
         */
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Content of subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();

        System.out.println("Sum of i, j and k in subob: ");
        subOb.sum();
    }
}


