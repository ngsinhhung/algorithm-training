#include <vector>
#include "Common.h"
using namespace std;

void Selection_Sort(vector<int>&numbers) {
    for (int i = 0; i < numbers.size() - 2; i++){
        int k = i;
        for (int j = i + 1; j < numbers.size() - 1; j++){
            if(numbers[k] > numbers[j]){
                k = j;
            }
        }
        swap(numbers[k], numbers[i]);
        cout << "i = " << i << ": ";
        printVector(numbers);
        cout << "\n";
    }
    return;
}