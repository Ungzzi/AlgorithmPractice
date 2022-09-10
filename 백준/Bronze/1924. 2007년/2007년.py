month, day = map(int, input().split())

n_sum = 0

week = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT']
n_day = {1:31, 2:28, 3:31, 4:30, 5:31, 6:30, 7:31, 8:31, 9:30, 10:31, 11:30, 12:31}

for i in range(1, month):
    n_sum += n_day[i]

n_sum += day
n_week = n_sum % 7

print(week[n_week])