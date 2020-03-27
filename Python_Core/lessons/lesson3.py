### сравнение дробных до какго-то знака
# a = 1 / 3
# b = 0.1 / 0.3
# print(a, b)
# print(abs(a - b ) < 0.000001)

### сравнение arrays
# l1 = [1,2,3]
# l2 = [1,2,3]
#
# print(l1 == l2)

### сравнение по ссылке на объект
# t1 = [1,2,3]
# t2 = [1,2,3]
#
# print(t1 is t2)


### кортежи
# kort = (1,2,3)
#
# single_elem_kort = (12, )

### многомерные массивы
# m = [[1, 2, 3],
#      [4, 5, 6]]
#
# m[1][1] = -1
# print(m)


###
# values = []
#
# n = int(input("Rows: "))
# m = int(input("Columns: "))
#
# for z in range(n):
#     row = [float(v) for v in input().split()]
#     values.append(row)
#
# for x in range(n):
#     for y in range(m):
#         print(values[x][y], end=" ")
#         print()


### методы: факториал и выборка 40 из 1000

def factorial(n):
    factorial_n = 1
    for z in range(2, n + 1):
        factorial_n *= z
    return factorial_n

# print(factorial(5))

def number_of_combinations(n, k):
    return factorial(n) // ((factorial(k) * factorial(n - k)))

print(number_of_combinations(5, 2))

number_of_clients = int(input())
number_of_selected_clients = int(input())

print(number_of_combinations(number_of_clients, number_of_selected_clients))

# присвоение не по порядку, а конкретному аргументу
print(number_of_combinations(k=number_of_selected_clients, n=number_of_clients))