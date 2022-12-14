#include <iostream>
using namespace std;

int main(int argc, char** argv) {

    //Assigning Variables
    const int ROW = 2;
    const int COLUMN = 2;
    const int DEPTH = 2;
    int AssignedArray[ROW][COLUMN][DEPTH];

    //Display Title
    cout << "3 Dimensional Array: 2 Rows, 2 Columns and 2 Depths\n\n";


    //this is for Inputting values for the Array.
    for (int i = 0; i < ROW; ++i) {
        for (int j = 0; j < COLUMN; ++j) {
			for (int k = 0; k < DEPTH; ++k) {
				cout << "Enter value for Array[" << i << "][" << j << "][" << k << "]: ";
				cin >> AssignedArray[i][j][k];
                cout << endl;
			}
        }
    }

    //this is for displaying your array.
    for (int i = 0; i < ROW; ++i) {
        for (int j = 0; j < COLUMN; ++j) {
            for (int k = 0; k < DEPTH; ++k) {
                cout << "\n[" << i << "] [" << j << "] [" << k << "] = " << AssignedArray[i][j][k];
            }
        }
    }
    cout << endl;
    system("pause");
    return 0;
}