package Day37_Constructors;

public class InstanceBlock {

    static {
        System.out.println("Static block");
    }

    {// it only runs when its obj is created
        System.out.println("Instance bolck");// number of print depends on the number of obj we create
    }

    public static void main(String[] args) {
        InstanceBlock obj1 = new InstanceBlock();
        InstanceBlock obj2 = new InstanceBlock();
    }

    {
        System.out.println("Instance block2");
    }
}
