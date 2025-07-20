#include<iostream>
#pragma once
using namespace std;


void swap(int &a, int &b) {
    int temp = a;
    a = b;
    b = temp;
}

void print(int a[], int n) {
    cout << "[";
    for(int i = 0; i < n; i++){
        if (i == n - 1){ cout << a[i]; }
        else { cout << a[i] << ", "; }
    }
    cout << "]";
}