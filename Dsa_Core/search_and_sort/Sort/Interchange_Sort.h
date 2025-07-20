#include<iostream>
#include "Common.h"
using namespace std;

void Interchange_Sort(int arr[], int n) {
    for(int i = 0; i < n ; i++) {
        for(int j = i + 1; j < n ; j++) {
            if(arr[i] > arr[j]) {
                swap(arr[i], arr[j]);
            }
        }
    }
}