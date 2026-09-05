package session2.assignment_problems;

/**
 * Assignment 3: Product Inventory CSV Parser
 * Parses "ProductName,SKU,Quantity" lines into a formatted record.
 */
public class ProductInventoryCsvParser {

    static void parseInventoryRecord(String csvLine) {
        // TODO: split(",") into fields, validate exactly 3 fields present,
        // print "Product: ... | SKU: ... | Qty: ..." or "Invalid Record"
    }

    public static void main(String[] args) {
        parseInventoryRecord("Wireless Mouse,WM-2201,150");
        parseInventoryRecord("Wireless Mouse,150");
    }
}
