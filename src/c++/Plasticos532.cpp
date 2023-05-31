#include <iostream>

int pesoPlastico(int n, int t) {
    return t - n;
}

int main() {
    int c;
    std::cin >> c;

    for (int i = 0; i < c; i++) {
        int n, t;
        std::cin >> n >> t;
        std::cout << pesoPlastico(n, t) << std::endl;
    } return 0;
}
