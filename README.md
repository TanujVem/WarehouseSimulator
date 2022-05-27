# WarehouseSimulator
Warehouse/stock simulator where user can add, delete, and restock products based on popularity
## Program Structure
The warehouse consists of 10 sectors which can store 5 products each. This enables near constant time access to respective products as the last digit of a product id is used to determine which sector it will fall into. Each sector is a priority queue where the least purchesed product is at the top, giving constant access to that product in the event it is replaced. 
#### Data Structures Used: Hash table, priority queue, and linked lists!
## How To Run Code
### Warehouse instance can be started by running everything.java with input and output file at args[0] and args[1] respectively
Warehouse queries in the input must follow the following format (For Sample, look at everything.in):
1. An integer n representing the number of queries
2. n lines, each containing either an add, restock, purchase, or delete query
#### Add Query
1. The current day
2. The product ID
3. The product name (Guaranteed to not contain spaces)
4. The initial item stock
5. The initial item demand
##### For sample add queries, look at addproduct.in
#### Restock Query
1. The product ID to restock
2. The amount to restock
##### For sample restock queries, look at restock.in
#### Purchase Query
1. The current day
2. The product ID to purchase
3. The amount purchased
##### For sample purchase queries, look at purchaseproduct.in
#### Delete Query
1. The product ID to delete
##### For sample delete queries, look at deleteproduct.in
