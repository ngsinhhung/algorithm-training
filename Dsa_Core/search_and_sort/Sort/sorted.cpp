#include <iostream>
#include "Common.h"
#include "Interchange_Sort.h"
#include "Bubble_Sort.h"
using namespace std;


int main() {

    // int arr[] = {5, 1, 4, 99, 2, 8};
    // int length = sizeof(arr) / sizeof(arr[0]);
    // Interchange_Sort(arr, length);
    // print(arr, length);


    vector<int> vNum = {6,5,3,1,8,7,2,4};
    Bubble_Sort_1(vNum);
    printVector(vNum);


    cout << "\n";
    return 0;
}