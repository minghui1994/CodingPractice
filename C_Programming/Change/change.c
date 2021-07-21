#include <stdio.h>

// Constants
const double FIFTY_CENT = 0.5;
const double TWENTY_CENT = 0.2;
const double TEN_CENT = 0.1;
const double FIVE_CENT = 0.05;

/*
    Function to find minimum number of change to return
*/
void change()
{
    printf("Input amount to return: ");
    double amount = 0.0;
    scanf("%lf", &amount);

    int numFifty = amount / FIFTY_CENT;
    amount -= (numFifty * FIFTY_CENT);

    int numTwenty = amount / TWENTY_CENT;
    amount -= (numTwenty * TWENTY_CENT);

    int numTen = amount / TEN_CENT;
    amount -= (numTen * TEN_CENT);

    int numFive = amount / FIVE_CENT;

    printf(numFifty > 1 ? "%d pieces of 50c\n" : "%d piece of 50c\n", numFifty);
    printf(numTwenty > 1 ? "%d pieces of 20c\n" : "%d piece of 20c\n", numTwenty);
    printf(numTen > 1 ? "%d pieces of 10c\n" : "%d piece of 10c\n", numTen);
    printf(numFive > 1 ? "%d pieces of 5c\n" : "%d piece of 5c\n", numFive);
}

int main()
{
    change();
    return 0;
}