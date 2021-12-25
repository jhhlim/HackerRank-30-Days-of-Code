#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int testcases;
    cin >> testcases;
    for (int i = 0; i < testcases; i++ )
    {
        string n;
        cin >> n;
        for (int j = 0; j < n.length(); j++)
        {
            if (j%2 ==0)
            {
                cout << n[j];
            }
        }
        cout << " ";
       for (int j = 0; j < n.length(); j++)
        {
            if (j%2 !=0)
            {
                cout << n[j];
            }
        }
        cout << endl;
        
    }
    return 0;
}
