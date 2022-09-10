def solution(id_list, report, k):
    answer = []
    dic = {id : [] for id in id_list}
    report_cnt = {id : 0 for id in id_list}
    report_list = []
    report = list(set(report))

    for i in range(len(report)):
        report_list.append(report[i].split())
    
    for name in report_list:
        report_cnt[name[1]] += 1
        dic[name[0]].append(name[1])

    for val in dic.values():
        cnt = 0
        for item in val:
            if report_cnt[item] >= k:
                cnt += 1
        answer.append(cnt)

    return answer