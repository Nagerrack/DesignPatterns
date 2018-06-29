package Composite;

import java.util.ArrayList;
import java.util.List;

public class Package implements StoredElement {

    private List<StoredElement> content;

    public Package() {
        content = new ArrayList<>();
    }

    public Package(int amount, double price, double weight) {
        content = new ArrayList<>();
        for(int i=0;i<amount;i++)
        {
            content.add(new Product("Product"+i,price,weight));
        }

    }

    public void addElement(StoredElement storedElement) {
        content.add(storedElement);
    }

    public List<StoredElement> getContent()
    {
        return content;
    }

    @Override
    public double TotalWeight() {
        double sum = 0;
        for (StoredElement se : content) {
            sum += se.TotalWeight();
        }
        return sum;
    }

    @Override
    public double TotalPrice() {
        double sum = 0;
        for (StoredElement se : content) {
            sum += se.TotalPrice();
        }
        return sum;
    }

    @Override
    public int Quantity() {
        int quantity = 0;
        for (StoredElement se : content) {
            quantity += se.Quantity();
        }
        return quantity;
    }

    @Override
    public String toString() {
        String result = "Package:\n";
        for (StoredElement se : content) {
            result += se;
        }
        return result;
    }
}
