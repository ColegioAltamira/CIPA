#include <iostream>
#include <math.h>

using namespace std;

int main() {
    float P,N,G,L, res;

    cin >> P;
    cin >> N;
    cin >> G;
    cin >> L;

    res = (2*P+(N-P)+G)/L;

    if(floorf(res) == res){
        cout << (int)floor(res);
    } else{
        cout << 0;
    }

    return 0;
}