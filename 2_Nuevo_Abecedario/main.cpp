#include <iostream>

int main() {
    int n;
    std::cin >> n;

    char palabra[n];
    std::cin >> palabra;

    const char vocales[] = {'A','E','I','O','U','a','e','i','o','u'};

    for (int i = 0; i < n; i++){
        if (palabra[i] == 'D') {
            palabra[i] = 'W';
            if (i > 0) {
                if (std::find(std::begin(vocales), std::end(vocales), palabra[i-1]) != std::end(vocales)){
                    palabra[i] = 'X';
                }
            }
        }
        if (palabra[i] == 'd') {
            palabra[i] = 'w';
            if (i > 0) {
                if (std::find(std::begin(vocales), std::end(vocales), palabra[i-1]) != std::end(vocales)){
                    palabra[i] = 'x';
                }
            }
        }
    }
    std::cout << palabra;
    return 0;
}