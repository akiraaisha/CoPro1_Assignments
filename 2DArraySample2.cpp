#include <iostream>
using namespace std;

int main(int argc, char** argv) {

    //Assigning Variables
    const int ROW = 4;
    const int COLUMN = 5;
    int AssignedArray[ROW][COLUMN];

    //Display Title
    cout << "=================================================="
        << "\n2 Dimensional Array: 4 Rows and 5 Columns\n" 
        << "==================================================\n";


    //this is for Inputting values for the Array.
    for (int i = 0; i < ROW; ++i) {
        for (int j = 0; j < COLUMN; ++j) {
            cout << "Enter number for " << "[" << i << "][" << j << "]: ";
            cin >> AssignedArray[i][j];
            cout << endl;

            //AssignedArray[i][j] = rand() % 100;
        }
    }

    //this is for displaying your array.
    cout << "Output:";
    for (int i = 0; i < ROW; ++i) {
        for (int j = 0; j < COLUMN; ++j) {
            cout << "\n[" << i << "] [" << j << "] = " << AssignedArray[i][j];
        }
    }


    cout << endl;
    system("pause");
    return 0;
}