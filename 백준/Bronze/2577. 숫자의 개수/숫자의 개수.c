#include <stdio.h>

int main()
{
	int A, B, C;
	int result;
	int c0 = 0, c1 = 0, c2 = 0, c3 = 0, c4 = 0,
		c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0;

	scanf("%d", &A);
	scanf("%d", &B);
	scanf("%d", &C);

	result = A * B * C;

	while (result > 0)
	{
		if (result % 10 == 0)
			c0++;
		else if (result % 10 == 1)
			c1++;
		else if (result % 10 == 2)
			c2++;
		else if (result % 10 == 3)
			c3++;
		else if (result % 10 == 4)
			c4++;
		else if (result % 10 == 5)
			c5++;
		else if (result % 10 == 6)
			c6++;
		else if (result % 10 == 7)
			c7++;
		else if (result % 10 == 8)
			c8++;
		else if (result % 10 == 9)
			c9++;
		
		result /= 10;
	}
	printf("%d\n", c0);
	printf("%d\n", c1);
	printf("%d\n", c2);
	printf("%d\n", c3);
	printf("%d\n", c4);
	printf("%d\n", c5);
	printf("%d\n", c6);
	printf("%d\n", c7);
	printf("%d\n", c8);
	printf("%d\n", c9);

	return 0;
}