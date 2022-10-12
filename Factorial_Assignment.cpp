#include<iostream>
using namespace std;

int main() {
    int x, fact = 1, n;

    cout << "Enter a number to find factorial: ";
    cin >> n;

    for (x = 1; x <= n; x++)
        fact = fact * x;
    
    cout << "The factorial of the given number is: " << fact;

    return 0;

}
