###for each
# for c in "hello":
#     print(c)

###for with index
# for i in range(5):
#     print(i)

### range(b), 0 <= i < b, i++
### range(a, b), a <= i < b, i++
### range(a, b, s), a <= i < b, i = i + s


#for i in range(5, 0, -1):
#     print(i)

###for with brake and else
# for z in range(5):
#     if z == 2
#         continue
# else:
#     print("loop finished normally")

### while loop
# i = 0
# while i < 5:
#     print(i)
#     i+=1


######################  arrays

# primes = [2, 3, 5, 7, 11]
# print(primes[0])

### if we want to move through array by index
# for z in range( len(primes) ):
#     print(primes[z])

### read only (for each)
# for prime in primes:
#     print(prime)

### creation of new array
# n = 5
# l = n * [0]
# print(l)

### new empty array + adding to the end of array by append()
# n = 5
# l = []
#
# for z in range(n):
#     l.append(0)
# print(l)

### засовывает то что слева от for в каждую ячейку массива
# l = [5 for z in range(5)]
# print(l)

### получение ренжа из массива
# primes = [2, 3, 5, 7, 11]
# print(primes[1:5])
# print(primes[1:5:2])
# print(primes[5::-1]) # reverse
# print(primes[1:-1]) # обрезанные концы

# нахождение числа в массиве, возвращает boolean
# print(7 in primes)
# print(7 not in primes)

### склеивание массивов:
# primes = [2, 3, 5, 7, 11]
# crimes = [1, 4, 6, 8]
# primes += crimes
# print(primes)

### сортировка
l = [3, 1, 2]
#print(sorted(l)) # создает копию
l.sort() # сортирует родной массив
print(l)

# finonachi
# a, b = b, a+b
