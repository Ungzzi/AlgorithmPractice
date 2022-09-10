#include <stdio.h>

int main()
{
	int N;
	int count = 0;

	scanf("%d", &N);

	if (N == 4)
	{
		printf("-1");
		
	}
	else if (N == 7)
	{
		printf("-1");

	}
	else
	{
		if (N % 5 == 0)
		{
			while (N != 0) {
				N -= 5;
				count++;
			}
		}
		else if (N % 5 == 1)
		{
			count += 2;
			N -= 6;
			while (N != 0) {
				N -= 5;
				count++;
			}
		}
		else if (N % 5 == 2)
		{
			count += 4;
			N -= 12;
			while (N != 0) {
				N -= 5;
				count++;
			}
		}
		else if (N % 5 == 3)
		{
			count += 1;
			N -= 3;
			while (N != 0) {
				N -= 5;
				count++;
			}
		}
		else if (N % 5 == 4)
		{
			count += 3;
			N -= 9;
			while (N != 0) {
				N -= 5;
				count++;
			}
		}
		printf("%d", count);
	}
	return 0;
}