#include <iostream>
#include <vector>
#include <string>

// Base class: Person
class Person {
protected:
    std::string name;

public:
    Person(const std::string& personName) : name(personName) {}
    virtual ~Person() {}

    std::string getName() const {
        return name;
    }
};

// Derived class: Seller
class Seller : public Person {
private:
    int id;

public:
    Seller(const std::string& sellerName, int sellerId) : Person(sellerName), id(sellerId) {}

    int getId() const {
        return id;
    }
};

// Class: Product
class Product {
private:
    int id;
    std::string productName;
    double price;

public:
    Product(int productId, const std::string& productName, double productPrice)
        : id(productId), productName(productName), price(productPrice) {}

    int getId() const {
        return id;
    }

    std::string getProductName() const {
        return productName;
    }

    double getPrice() const {
        return price;
    }
};

int main() {
    std::vector<Seller> sellers;
    std::vector<Product> products;

    while (true) {
        std::cout << "\nMenu:\n";
        std::cout << "1. Add Seller\n";
        std::cout << "2. Add Product\n";
        std::cout << "3. Display products sold by specific seller\n";
        std::cout << "4. Display All Sellers\n";
        std::cout << "5. Display All Products\n";
        std::cout << "6. Exit\n";
        std::cout << "Enter your choice: ";

        int choice;
        std::cin >> choice;

        switch (choice) {
            case 1: {
                std::string sellerName;
                int sellerId;
                std::cout << "Enter seller name: ";
                std::cin >> sellerName;
                std::cout << "Enter seller ID: ";
                std::cin >> sellerId;
                sellers.emplace_back(sellerName, sellerId);
                break;
            }
            case 2: {
                int productId;
                std::string productName;
                double productPrice;
                std::cout << "Enter product ID: ";
                std::cin >> productId;
                std::cout << "Enter product name: ";
                std::cin >> productName;
                std::cout << "Enter product price: ";
                std::cin >> productPrice;
                products.emplace_back(productId, productName, productPrice);
                break;
            }
            case 3: {
                int sellerId;
                std::cout << "Enter seller ID: ";
                std::cin >> sellerId;
                for (const auto& product : products) {
                    if (product.getId() == sellerId) {
                        std::cout << "Product ID: " << product.getId() << ", Name: " << product.getProductName()
                                  << ", Price: $" << product.getPrice() << "\n";
                    }
                }
                break;
            }
            case 4: {
                std::cout << "All Sellers:\n";
                for (const auto& seller : sellers) {
                    std::cout << "Seller ID: " << seller.getId() << ", Name: " << seller.getName() << "\n";
                }
                break;
            }
            case 5: {
                std::cout << "All Products:\n";
                for (const auto& product : products) {
                    std::cout << "Product ID: " << product.getId() << ", Name: " << product.getProductName()
                              << ", Price: $" << product.getPrice() << "\n";
                }
                break;
            }
            case 6:
                std::cout << "Exiting the program.\n";
                return 0;
            default:
                std::cout << "Invalid choice. Please try again.\n";
        }
    }

    return 0;
}
