#include "Common.h"
#include <vector>
using namespace std;

void Bubble_Sort(vector<int>&numbers) {
    for(int i = numbers.size() - 1; i > 0; i--){
        for(int j = 0; j < i; j++){
            if(numbers[j] > numbers[j+1]){
                swap(numbers[j], numbers[j+1]);
            }
        }
    }
    return;
}
