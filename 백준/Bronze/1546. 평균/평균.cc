#include <stdio.h>

int main() {
	int i;
	double N;
	double M = 0;
	double grade[1000];
	double n_grade[1000];
	double sum = 0;

	scanf("%lf", &N);

	for (i = 0; i < N; i++)
	{
		scanf("%lf", &grade[i]);
		
		if (grade[i] > M)
			M = grade[i];
	}

	for (i = 0; i < N; i++)
	{
		n_grade[i] = grade[i] / M * 100;
		sum += n_grade[i];
	}
	
	printf("%.2lf", sum / N);

	return 0;
}