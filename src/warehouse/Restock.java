package warehouse;

public class Restock {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);
        int numQueries = StdIn.readInt();
        Warehouse house = new Warehouse();
        for(int i = 0; i<numQueries; i++){
            if(StdIn.readString().equals("add")){
            int day = StdIn.readInt();
            int id = StdIn.readInt();
            String name = StdIn.readString();
            int stock = StdIn.readInt();
            int demand = StdIn.readInt();
            house.addProduct(id,name,stock,day,demand);
            }
            else{
                house.restockProduct(StdIn.readInt(), StdIn.readInt());
            }
        }
        StdOut.print(house);

    }
}
