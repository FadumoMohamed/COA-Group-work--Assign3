#include <iostream>
using namespace std;

int decimalToBinary(int n)
{
        // 32 bits
     for (int i = 31; i >= 0; i--) {
        int k = n >> i;
           if (k & 1)
            cout << "1";
           else
            cout << "0" ;
    }
}
void decToHexa(int m)
{
    char hexaDeciNum[100];


    int i = 0;
       while(m!=0)
    {

        int temp  = 0;


        temp = m % 16;

        if(temp < 10)
        {
            hexaDeciNum[i] = temp + 48;
            i++;
        }
        else
        {
            hexaDeciNum[i] = temp + 55;
            i++;
        }

        m = m/16;
    }


    for(int j=i-1; j>=0; j--)
        cout << hexaDeciNum[j] << endl;
}

int main()
{
    int m = 2;

    decToHexa(m);
    int n = 2;
    decimalToBinary(n);


    return 0;
}


