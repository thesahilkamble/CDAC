#include <iostream>
#include <vector>
#include <string>

using namespace std;

// Base class
class Person {
protected:
    string name;
public:
    Person(const string& _name) : name(_name) {}
};

// Seller class derived from Person
class Seller : public Person {
private:
    string seller_name;
    int id;
public:
    Seller(const string& _name, const string& _seller_name, int _id)
        : Person(_name), seller_name(_seller_name), id(_id) {}
    
    // Getters
    string getSellerName() const { return seller_name; }
    int getId() const { return id; }
};

// Product class
class Product {
private:
    int id;
    string product_name;
    double price;
public:
    Product(int _id, const string& _product_name, double _price)
        : id(_id), product_name(_product_name), price(_price) {}
    
    // Getters
    int getId() const { return id; }
    string getProductName() const { return product_name; }
    double getPrice() const { return price; }
};

// Ecommerce system class
class EcommerceSystem {
private:
    vector<Seller> sellers;
    vector<Product> products;
public:
    // Menu functions
    void addSeller(const string& name, const string& seller_name, int id) {
        Seller new_seller(name, seller_name, id);
        sellers.push_back(new_seller);
    }

    void addProduct(int id, const string& product_name, double price) {
        Product new_product(id, product_name, price);
        products.push_back(new_product);
    }

    void displayProductsBySeller(const string& seller_name) {
        cout << "Products sold by " << seller_name << ":" << endl;
        for (const Product& product : products) {
            cout << "ID: " << product.getId() << ", Name: " << product.getProductName() << ", Price: " << product.getPrice() << endl;
        }
    }

    void displayAllSellers() {
        cout << "All Sellers:" << endl;
        for (const Seller& seller : sellers) {
            cout << "Name: " << seller.getSellerName() << ", ID: " << seller.getId() << endl;
        }
    }

    void displayAllProducts() {
        cout << "All Products:" << endl;
        for (const Product& product : products) {
            cout << "ID: " << product.getId() << ", Name: " << product.getProductName() << ", Price: " << product.getPrice() << endl;
        }
    }
};

int main() {
    EcommerceSystem system;
    int choice;

    do {
        cout << "\nMenu:\n";
        cout << "1. Add Seller\n";
        cout << "2. Add Product\n";
        cout << "3. Display products sold by specific seller\n";
        cout << "4. Display All Sellers\n";
        cout << "5. Display All Products\n";
        cout << "6. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1: {
                string name, seller_name;
                int id;
                cout << "Enter seller name: ";
                cin >> name;
                cout << "Enter seller's store name: ";
                cin >> seller_name;
                cout << "Enter seller ID: ";
                cin >> id;
                system.addSeller(name, seller_name, id);
                break;
            }
            case 2: {
                int id;
                string name;
                double price;
                cout << "Enter product ID: ";
                cin >> id;
                cout << "Enter product name: ";
                cin >> name;
                cout << "Enter product price: ";
                cin >> price;
                system.addProduct(id, name, price);
                break;
            }
            case 3: {
                string seller_name;
                cout << "Enter seller name: ";
                cin >> seller_name;
                system.displayProductsBySeller(seller_name);
                break;
            }
            case 4:
                system.displayAllSellers();
                break;
            case 5:
                system.displayAllProducts();
                break;
            case 6:
                cout << "Exiting...\n";
                break;
            default:
                cout << "Invalid choice. Please enter a number between 1 and 6.\n";
        }
    } while (choice != 6);

    return 0;
}
