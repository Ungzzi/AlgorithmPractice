#include <stdio.h>

int main() {
	int N, X;
	int A[10000];
	int i;

	scanf("%d %d", &N, &X);

	for (i = 0; i < N; i++)
	{
		scanf("%d", &A[i]);

		if (A[i] < X)
		{
			printf("%d ", A[i]);
		}
	}
	return 0;
}