#include <iostream>
#include "Interchange_Sort.h"
#include "Common.h"
using namespace std;


int main() {

    int arr[] = {5, 1, 4, 99, 2, 8};
    int length = sizeof(arr) / sizeof(arr[0]);
    Interchange_Sort(arr, length);
    print(arr, length);

    cout << "\n";
    return 0;
}