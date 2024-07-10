#include <iostream>
#include <vector>
#include <string>

using namespace std;

class Sport {
    string sports_name;
    float fees;
public:
    Sport(const string& name, float fees) : sports_name(name), fees(fees) {}
    const string& getSportsName() const {
        return sports_name;
    }
    float getFees() const {
        return fees;
    }
};

class Person {
    string name;
    int age;
public:
    Person(const string& name, int age) : name(name), age(age) {}
    const string& getName() const {
        return name;
    }
    int getAge() const {
        return age;
    }
};

class Player : public Person {
    int id;
    long mobile;
    vector<Sport*> sports;
public:
    Player(int id, long mobile, const string& name, int age) : Person(name, age), id(id), mobile(mobile) {}
    void enrollSport(Sport* sport) {
        sports.push_back(sport);
    }
    void displaySports() const {
        cout << "Sports enrolled by player " << id << ": " << endl;
        for (const auto& sport : sports) {
            cout << sport->getSportsName() << endl;
        }
    }
};

int main() {
    vector<Player> players;
    vector<Sport> sports;

    while (true) {
        cout << "Menu:" << endl;
        cout << "1. Add new player" << endl;
        cout << "2. Add new sport" << endl;
        cout << "3. Enroll player into sport" << endl;
        cout << "4. Display sports of a player" << endl;
        cout << "5. Display all players and their sports registered" << endl;
        cout << "6. Exit" << endl;
        cout << "Enter your choice: ";
        int choice;
        cin >> choice;

        switch (choice) {
            case 1: {
                int id, age;
                long mobile;
                string name;
                cout << "Enter player ID: ";
                cin >> id;
                cout << "Enter player name: ";
                cin >> name;
                cout << "Enter player age: ";
                cin >> age;
                cout << "Enter player mobile: ";
                cin >> mobile;
                players.push_back(Player(id, mobile, name, age));
                break;
            }
            case 2: {
                string name;
                float fees;
                cout << "Enter sport name: ";
                cin >> name;
                cout << "Enter sport fees: ";
                cin >> fees;
                sports.push_back(Sport(name, fees));
                break;
            }
            case 3: {
                int playerId, sportIndex;
                cout << "Enter player ID: ";
                cin >> playerId;
                cout << "Choose sport to enroll (by index): " << endl;
                for (size_t i = 0; i < sports.size(); i++) {
                    cout << i << ". " << sports[i].getSportsName() << endl;
                }
                cin >> sportIndex;
                if (playerId < players.size() && sportIndex < sports.size()) {
                    players[playerId].enrollSport(&sports[sportIndex]);
                } else {
                    cout << "Invalid player ID or sport index." << endl;
                }
                break;
            }
            case 4: {
                int playerId;
                cout << "Enter player ID: ";
                cin >> playerId;
                if (playerId < players.size()) {
                    players[playerId].displaySports();
                } else {
                    cout << "Invalid player ID." << endl;
                }
                break;
            }
            case 5: {
                cout << "List of players and their sports:" << endl;
                for (const auto& player : players) {
                    cout << "Player ID: " << player.getName() << endl;
                    player.displaySports();
                }
                break;
            }
            case 6: {
                cout << "Exiting program." << endl;
                return 0;
            }
            default:
                cout << "Invalid choice. Please try again." << endl;
        }
    }

    return 0;
}
