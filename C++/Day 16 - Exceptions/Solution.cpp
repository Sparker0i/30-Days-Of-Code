#include <cstring>
#include <iostream>

using namespace std;


int main(){
    string S;
    cin >> S;
    try {
        cout << stoi(S);
    }
    catch (std::invalid_argument) {
        cout << "Bad String";
    }
    return 0;
}
