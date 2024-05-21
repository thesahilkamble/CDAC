#include <iostream>
using namespace std;
int main() 
{
    int rows = 5;
    for (int i = 1; i <= rows; i++) {
        
        for (int j = 1; j <= i; j++) {
            cout << j << " ";
        }
        for (int k = 1; k <= (rows - i) * 2; k++) {
            cout << "  ";
        }
        for (int l = i; l >= 1; l--) {
            if (l != rows) {
                cout << l << " ";
            }
        }
        cout <<endl;
    }

    return 0;
}