def solution(phone_book):
    phone_book.sort()
    
    answer = True
    
    for i in range(0, len(phone_book) - 1):        
        cur = phone_book[i]
        if cur == phone_book[i+1][:len(cur)]:
            answer = False
            break
        
    return answer
