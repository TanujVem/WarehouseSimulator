package warehouse;


public class Everything {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);
        int numQueries = StdIn.readInt();
        Warehouse x = new Warehouse();
        for(int i = 0; i<numQueries; i++){
            String query = StdIn.readString();
            if(query.equals("add")){
                int day = StdIn.readInt();
                int id = StdIn.readInt();
                String name = StdIn.readString();
                int stock = StdIn.readInt();
                int demand = StdIn.readInt();
                x.addProduct(id,name,stock,day,demand); 
            }
            else if(query.equals("purchase")){
                int day = StdIn.readInt();
                int ID = StdIn.readInt();
                int amount = StdIn.readInt();
                x.purchaseProduct(ID, day, amount);
            }
            else if(query.equals("restock")){
                x.restockProduct(StdIn.readInt(), StdIn.readInt());
            }
            else if(query.equals("delete")){
                x.deleteProduct(StdIn.readInt());
            }
        }
        StdOut.print(x);
    }
}
