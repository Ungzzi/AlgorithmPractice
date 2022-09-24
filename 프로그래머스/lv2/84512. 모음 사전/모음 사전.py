from itertools import product

def solution(word):
    order = ["A", "E", "I", "O", "U"]
    product_list = []
    n_list = [""]

    # 중복순열
    for i in range(1, 6):
        for j in product(order, repeat=i):
            product_list.append(j)

    for products in product_list:
        n_list.append(''.join(products))
    n_list.sort()

    return n_list.index(word)