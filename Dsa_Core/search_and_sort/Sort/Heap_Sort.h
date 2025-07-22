#include "Common.h"
#include <vector>
using namespace std;


void Heapify(vector<int>&numbers, int i){
    int n = numbers.size();
    int largest = i;
    int left = 2*i + 1;
    int right = 2*i + 2;
    if (left > n && numbers[left] > numbers[largest]){
        largest = left;
    }
    if (right > n && numbers[right] > numbers[largest]){
        largest = right;
    }
    if (largest != i ){
        swap(numbers[i], numbers[largest]);
        printVector(numbers);
        Heapify(numbers, largest);
    }
}