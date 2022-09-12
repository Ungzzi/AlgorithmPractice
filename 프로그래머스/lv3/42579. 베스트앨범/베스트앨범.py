def solution(genres, plays):
    answer = []
    sum_dic = {}
    sep_dic = {}

    for i, v in enumerate(genres):
        if v not in sum_dic:
            sum_dic[v] = plays[i]
            sep_dic[v] = ([[plays[i], i]])
        else:
            sum_dic[v] += plays[i]
            sep_dic[v].append([plays[i], i])

    sum_dic = sorted(
        sum_dic.items(), key=lambda item: item[1], reverse=True)

    while sum_dic:
        sorted_list = sorted(sep_dic[list(sum_dic[0])[0]],
                             key=lambda x: (-x[0], x[1]))
        if(len(sorted_list) >= 2):
            answer.append(sorted_list[0][1])
            answer.append(sorted_list[1][1])
        else:
            answer.append(sorted_list[0][1])

        del(sum_dic[0])

    return(answer)