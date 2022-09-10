int main(void)
{
	int a, i, n;
	int sum = 0;

	scanf("%d", &n);

	for (i = 0; i < n; i++)
	{
		scanf("%1d", &a);
		sum +=  a;
	}

	printf("%d", sum);

	return 0;
}
