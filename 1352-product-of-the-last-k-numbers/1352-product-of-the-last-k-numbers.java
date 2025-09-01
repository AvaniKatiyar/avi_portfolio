import java.util.*;

class ProductOfNumbers {
    private List<Integer> prefixProducts;

    public ProductOfNumbers() {
        prefixProducts = new ArrayList<>();
        prefixProducts.add(1); // start with 1 for easy multiplication
    }
    
    public void add(int num) {
        if (num == 0) {
            // Reset everything when zero is added
            prefixProducts.clear();
            prefixProducts.add(1);
        } else {
            // Multiply the last product by num and append
            int lastProduct = prefixProducts.get(prefixProducts.size() - 1);
            prefixProducts.add(lastProduct * num);
        }
    }
    
    public int getProduct(int k) {
        int n = prefixProducts.size();
        if (k >= n) {
            // If there was a zero within the last k adds, product is 0
            return 0;
        }
        // Product of last k numbers: divide last total prefix by the total prefix before last k numbers
        return prefixProducts.get(n - 1) / prefixProducts.get(n - k - 1);
    }
}
