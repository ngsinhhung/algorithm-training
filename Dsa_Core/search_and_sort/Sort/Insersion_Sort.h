#include <vector>
#include "Common.h"
using namespace std;

void Insersion_Sort(vector<int>&numbers) {
    for(int i = 1; i < numbers.size(); i++) {
        int x = numbers[i];
        int j = i - 1;
        while (j >= 0 && numbers[j] > x) {
            numbers[j + 1] = numbers[j];
            j--;
        }
        numbers[j+1] = x;
    }
    return;
}