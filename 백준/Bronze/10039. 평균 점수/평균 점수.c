#include <stdio.h>

int main()
{
	int grade[5];
	int i;
	int sum = 0, avg = 0;

	for (i = 0; i < 5; i++)
	{
		scanf("%d", &grade[i]);

		if (grade[i] < 40)
			sum += 40;
		else
			sum += grade[i];
	}

	avg = sum / 5;

	printf("%d", avg);

	return 0;
}