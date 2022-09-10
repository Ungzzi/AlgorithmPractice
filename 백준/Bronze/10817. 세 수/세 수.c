#include <stdio.h>

int main() {
	int A, B, C;
	int fir, sec;

	scanf("%d %d %d", &A, &B, &C);

	if (A == B && B == C)
		sec = A;

	else if (A >= B && A >= C) {
		fir = A;
		if (B >= C)
			sec = B;
		else
			sec = C;
	}

	else if (B >= A && B >= C) {
		fir = B;
		if (A >= C)
			sec = A;
		else
			sec = C;
	}

	else if (C >= A && C >= B) {
		fir = C;
		if (A >= B)
			sec = A;
		else
			sec = B;
	}

	printf("%d", sec);

	return 0;
}