#include <iostream>
using namespace std;

int LinearSearch(int arr[], int n, int target){
    for(int i = 0; i < n; i++){
        if(arr[i] == target){
            return i;
        }
    }
    return -1;
}


int main() {
    int arr[] = {5, 1, 4, 99, 2, 8};
    int result = LinearSearch(arr, sizeof(arr)/sizeof(arr[0]), 8);
    if (result == -1){
        cout << "Element not found";
        return 0;
    }
    cout << "Element found at " << result;

    cout << "\n";
    return 0;
}