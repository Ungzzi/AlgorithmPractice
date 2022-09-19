def solution(citations):
    h_idx = 0
    s_citations = sorted(citations, reverse=True)
    for citation in s_citations:
        if citation > h_idx:
            h_idx += 1
        else:
            return h_idx
    return h_idx