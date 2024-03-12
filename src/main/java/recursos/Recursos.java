package recursos;

import java.util.List;

class Recursos {
    private String name;
    private int quantity;
    private List<Supplier> suppliers;

    public Recursos(String name, int quantity, List<Supplier> suppliers) {
        this.name = name;
        this.quantity = quantity;
        this.suppliers = suppliers;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public List<Supplier> getSuppliers() {
        return this.suppliers;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }
}

class Supplier {
    private String name;
    private List<Recursos> resources;

    public Supplier(String name, List<Recursos> resources) {
        this.name = name;
        this.resources = resources;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public List<Recursos> getResources() {
        return this.resources;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setResources(List<Recursos> resources) {
        this.resources = resources;
    }
}

class ZooResources {
    private List<Recursos> resources;
    private List<Supplier> suppliers;

    public ZooResources(List<Recursos> resources, List<Supplier> suppliers) {
        this.resources = resources;
        this.suppliers = suppliers;
    }

    // Getters
    public List<Recursos> getResources() {
        return this.resources;
    }

    public List<Supplier> getSuppliers() {
        return this.suppliers;
    }

    // Setters
    public void setResources(List<Recursos> resources) {
        this.resources = resources;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }
}