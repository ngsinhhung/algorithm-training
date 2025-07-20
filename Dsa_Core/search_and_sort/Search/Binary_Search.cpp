#include <iostream>
using namespace std;

int BinarySearch(int arr[], int n, int target){
    int l = 0;
    int r = n - 1;
    while (l <= r) {
        int mid = (l + r) / 2;
        if (target > arr[mid]) {
            l = mid + 1;
        } else if (target < arr[mid])
        {
            r = mid - 1;
        } else {
            return mid;
        }
    }
    return -1;
}


int main() {
    int arr[] = {1,2,4,5,8,99};
    int result = BinarySearch(arr, sizeof(arr)/sizeof(arr[0]), 8);
    if (result == -1){
        cout << "Element not found";
        return 0;
    }
    cout << "Element found at " << result;

    cout << "\n";
    return 0;
}


