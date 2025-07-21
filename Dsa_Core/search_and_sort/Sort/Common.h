#include<iostream>
#include "vector"
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

void printVector(vector<int>numbers){
    for(int i = 0; i < numbers.size(); i++){
        if (i == numbers.size() - 1){ cout << numbers[i]; }
        else { cout << numbers[i] << ", "; }
    }
}