#include <stdio.h>

int main()
{
	int num[8];
	int i;

	for (i = 0; i < 8; i++) {
		scanf("%d", &num[i]);
	}

	if (num[0] == 1 && num[1] == 2 && num[2] == 3 && num[3] == 4 &&
		num[4] == 5 && num[5] == 6 && num[6] == 7 && num[7] == 8)
		printf("ascending");
	else if (num[0] == 8 && num[1] == 7 && num[2] == 6 && num[3] == 5 &&
		num[4] == 4 && num[5] == 3 && num[6] == 2 && num[7] == 1)
		printf("descending");
	else
		printf("mixed");

	return 0;
}