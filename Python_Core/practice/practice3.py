from array import *
from math import sqrt

print("task #3.1")
# Дано число N і M. Далі вводяться N рядків по M чисел.
# Вивести M чисел, що відповідають значенням сум відповідних стовпчиків.
# Ввід:
# 2 3
# 1 2 3
# 4 5 6
# Вивід:
# 5 7 9


### решение с занятия:

# n = int(input("Rows: "))
# m = int(input("Columns: "))
# values = []
#
# for z in range(n):
#     row = [int(v) for v in input().split()]
#     values.append(row)
#
# for y in range(m):
#     s = 0
#     for x in range(n):
#         s += values[x][y]
#     print(s, end=" ")

print("task #3.2")
# Дано число N. Створити й вивести двовимірний масив розмірністю N на N,
# у якого на основній діагоналі розташовані одиниці, а всі інші значення дорівнюють нулю.
# Ввід:
# 3
# Вивід:
# 1 0 0
# 0 1 0
# 0 0 1

# ### input
# size = int(input("Enter size: "))
# array = []
#
# for x in range(size):
#     for y in range(size):
#         if y == x:
#             array.append(1)
#         else:
#             array.append(0)
#
# ### print
# for y in range(size):
#     for x in range(size):
#         print(array[x][y], end=" ")
#     print()


# тут получаю такую ошибку, пока не удалось починить:
#     print(array[x][y], end=" ")
# TypeError: 'int' object is not subscriptable

print("task #3.3")
### Дано матрицю N на M. Вивести транспоновану матрицю

# n = int(input("Rows: "))
# m = int(input("Columns: "))
# values = []
#
# for z in range(n):
#     row = [int(v) for v in input().split()]
#     values.append(row)
#
# ### print original
# for y in range(n):
#     for x in range(m):
#         print(values[y][x], end=" ")
#     print()
#
# ### print transparent
# for y in range(m):
#     for x in range(n):
#         print(values[x][y], end=" ")
#     print()

print("task #3.4")
### Написати функцію для знаходження відстані між двома точками в просторі: (x1, y1, z1) і (x2, y2, z2).

# x1 = 1.0
# y1 = -2.0
# z1 = 4.0
#
# x2 = 5.0
# y2 = 0.0
# z2 = 8.0
#
# distance = 0.0
#
#
# def findDistInSpace():
#     distance = sqrt(((x2 - x1) ** 2) + ((y2 - y1) ** 2) + ((z2 - z1) ** 2))
#     return distance
#
# print(findDistInSpace())

print("task #3.5")
### Написати функцію, яка отримує список натуральних чисел і повертає новий список, в якому містяться лише парні числа з початкового списку

# original = [1, 2, 3, 4, 5, 8, 11, 15, 16, 22, 27, 89, 97]
# pairs = []
#
#
# def pairNumbers(list):
#     for num in original:
#         if (num % 2) == 0:
#             pairs.append(num)
#     return pairs
#
# print(pairNumbers(original))

print("task #3.6")
### Написати набір функцій для розрахунку наступних характеристик кола: діаметр, довжина й площа. Коло задається радіусом.

# r = 5.0
#
# def diameter(radius):
#     return radius * 2
#
# def circumference(radius):
#     return 2 * 3.14 * radius
#
# def circleArea(radius):
#     return (3.14 * radius) ** 2
#
#
# print(diameter(r))
# print(circumference(r))
# print(circleArea(r))

print("task #3.7")
### Написати функцію, яка використовує функції із попереднього завдання, і для заданого кола повертає відформатований рядок з його описом.
### Ввід:
### Enter radius of the circle: 10
### Вивід:
### Diameter of the circle = 20.00 units
### Circumference of the circle = 62.83 units
### Area of the circle = 314.16 sq. units


# r = int(input("Enter radius: "))
#
# def diameter(radius):
#     return radius * 2
#
# def circumference(radius):
#     return 2 * 3.14 * radius
#
# def circleArea(radius):
#     return (3.14 * radius) ** 2
#
#
# def formattedPrint():
#
#     dim = str(diameter(r))
#     circumf = str(circumference(r))
#     area = str(circleArea(r))
#
#     print("Diameter of the circle = " + dim + " units")
#     print("Circumference of the circle = " + circumf + " units")
#     print("Area of the circle = " + area + " units")
#
#
# formattedPrint()

print("task #3.8")
### Написати функцію, що отримує два відсортованих списки і об'єднує їх у новий відсортований список

list1 = [7, 2, 1, 0, 8, 12, 5]
list2 = [64, 256, 2, 16, 32, 512, 8]

list1.sort()
list2.sort()

def concat(l1, l2):
    list3 = l1 + l2
    return list3

print(concat(list1, list2))