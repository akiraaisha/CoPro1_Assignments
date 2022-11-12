#include <iostream>
using namespace std;

int main(int argc, char** argv) {

    //Assigning Variables
    const int ROWS = 4;
    const int COLUMNS = 5;
    int AssignedArray[ROWS][COLUMNS];

    //Display Title
    cout << "2 Dimensional Array: 4 Rows and 5 Columns\n\n";


    //this is for Inputting values for the Array.
    for (int i = 0; i < ROWS; ++i) {
        for (int j = 0; j < COLUMNS; ++j) {
            cout << "Enter number for " << "[" << i << "][" << j << "]: ";
            cin >> AssignedArray[i][j];
            cout << endl;
        }
    }

    //this is for displaying your array.
    for (int i = 0; i < ROWS; ++i) {
        for (int j = 0; j < COLUMNS; ++j) {
            cout << "\n[" << i << "] [" << j << "] = " << AssignedArray[i][j];
        }
    }


    cout << endl;
    system("pause");
    return 0;
}
