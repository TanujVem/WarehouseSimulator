package warehouse;

public class AddProduct {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);
        int numProducts = StdIn.readInt();
        Warehouse house = new Warehouse();
        for(int i = 0; i< numProducts; i++){
            int day = StdIn.readInt();
            int id = StdIn.readInt();
            String name = StdIn.readString();
            int stock = StdIn.readInt();
            int demand = StdIn.readInt();
            house.addProduct(id,name,stock,day,demand);
        }
        StdOut.print(house);

    }
}
