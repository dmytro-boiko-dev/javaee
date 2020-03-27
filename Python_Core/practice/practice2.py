################# tasks:
from math import sqrt

print("task #2.1")
### Написати програму, яка зчитує число, виводить його квадратний корінь і приймає наступне число.
### Програма повинна припинити роботу коли їй буде введено від’ємне число.


# isValid = True
# while isValid:
#     number = int(input("Enter positive number:"))
#     if number > 0:
#         isValid = True
#     else:
#         isValid = False

print("task #2.2")
### Дано число N і N чисел. Вивести максимум серед введених чисел

# number = int(input("Enter number of numbers:"))
# cache = 0
#
# for i in range(number):
#     a = int(input("Enter number:"))
#     if a > cache:
#         cache = a
# print(cache)

print("task #2.3")
### Дано знак “+” або “*”, число N і N чисел. Вивести суму або добуток введених чисел залежно від заданого знаку

# number = int(input("Enter number of numbers: "))
# sign = input("Enter sign: ")
#
# sumResult = 0
# multiResult = 1
#
# for i in range(number):
#     a = int(input("Enter number: "))
#
#     if sign == "+":
#         sumResult = sumResult + a
#     elif sign == "*":
#         multiResult = multiResult * a
#     else:
#         "something went wrong"
#
# if sumResult > 0:
#     print(sumResult)
# elif multiResult > 1:
#     print(multiResult)

print("task #2.4")
### Дано число N. Вивести перші N чисел Фібоначчі

# n = int(input("Enter number: "))
# a = 1
# b = 1
#
# print(a)
# print(b)
#
# for i in range(n):
#     a, b = b, a+b
#     print(b)

print("task #2.5")
### Дано число N. Вивести послідовність чисел Фібоначчі, що менші від N

# n = int(input("Enter number: "))
# a = 1
# b = 1
#
# print(a)
# print(b)
#
# for i in range(n):
#     a, b = b, a+b
#     if b > n:
#         break
#     print(b)

print("task #2.6")
### Написати програму, що будує таблицю відповідності між градусами за Цельсієм і Фаренгейтом.
# Дано початкове значення у градусах Цельсія, кінцеве значення і крок. Вивести таблицю відповідностей.

# celStart = int(input("Enter starting value: "))
# celEnd = int(input("Enter ending value: "))
# step = int(input("Enter step: "))
# result = 0.0
#
# print("Celsius   Fahrenheit")
# for i in range(celStart, celEnd, step):
#     result = i * 1.8
#
#     fahrenheit = str(result)
#     celsius = str(i)
#     print("   " + celsius + "         " + fahrenheit)


print("task #2.7")
### Дано число N. Після чого в порядку обходу вводяться N пар координат многокутника на площині.
# Знайти периметр цього многокутника.

# numberOfRibs = int(input("Enter ribs count: "))
# perimeterLength = 0
#
# for i in range(numberOfRibs):
#     print("Enter coordinates for rib #" + str(i + 1))
#     x1 = int(input("x1 = "))
#     y1 = int(input("y1 = "))
#     x2 = int(input("x2 = "))
#     y2 = int(input("y2 = "))
#     d = sqrt(((x2 - x1) ** 2) + ((y2 - y1) ** 2))
#     perimeterLength += d
#
# print("Perimeter length = " + str(perimeterLength))

print("task #2.8")
### Дано число N і список з N чисел. Для кожно числа зі списку вивести його відношення до середнього арифметичного
### цього списку (менше, дорівнює, більше).

# number = int(input("Enter number: "))
# array = []
# sum = 0
#
# for z in range(number):
#     array.append(int(input("Enter next number: ")))
#     sum = sum + array[z]
#
# print("Original array: ")
# print(array)
#
# middle = sum / len(array)
# print(middle)
#
# results = []
# for arr in array:
#     result = middle / arr
#     results.append(result)
#
# print("Result array: ")
# print(results)

print("task #2.9")
### Дано число N і список з N чисел. Вивести всі числа, що більші від обох своїх сусідніх у списку.

# number = int(input("Enter list size: "))
# list = []
#
# for z in range(number):
#     elem = int(input("Enter next element: "))
#     list.append(elem)
#
# for i in range(number):
#
#     if i == (len(list) - 1): break
#
#     if list[i] > list[i-1] and list[i] > list[i+1]:
#         print(list[i])

print("task #2.10")
### Дано число N і список з N чисел. Вивести список у зворотному порядку.

# number = int(input("Enter list size: "))
# list = []
#
# for z in range(number):
#     elem = int(input("Enter next element: "))
#     list.append(elem)
#
# reverseList = []
#
# for x in range(number, 0, -1):
#
#
#     print(list[x-1])
#     reverseList.append(list[x-1])
#
#
# for li in reverseList:
#     print(li, end=" ")
#
# print()


print("task #2.11")
### Дано число N і список з N чисел. Далі на вхід задаються пари чисел A,B>=0.
# Для кожної пари вивести значення списку з індексами від A включно до B не включно.
# Завершити роботу коли буде введено два нулі. Врахувати випадок коли A>B.
# Ввід:
# 4
# 1
# 2
# 3
# 4
# 0
# 2
# 0
# 0
# Вивід:
# [1,2]


#
# number = int(input("Enter list size: "))
# list = []
#
# for z in range(number):
#     elem = int(input("Enter next element: "))
#     list.append(elem)
#
# for z in range(number):
#     a = int(input("Enter min range value: "))
#     b = int(input("Enter max range value >=0 : "))
#
#     if a > b:
#         print("A should be less then B, please ty again.")
#         continue
#     elif a > number or b > number:
#         print("Out of range, A and B should be less than number of elements.")
#         continue
#
#     if a < b:
#         for y in range(a, b, 1):
#             print(list[y], end=" ")
#         print()
#     elif a == 0 and b == 0:
#         break
#
# print()


print("task #2.12")
### Дано число N і список з N чисел. Вивести всі числа, що зустрічаються у списку лише раз.

### я решил как в голову пришло (причем сначала в Java)
### но потом уже обсудил с товарищем и он мне подкинул идею
### что можно было отсортировать и потом попарно сравнивать

### test list: 3, 0, 8, 0, 5, 9, 9, 0

#
# number = int(input("Enter list size: "))
# list = []
# buffer = []
#
# for z in range(number):
#     elem = int(input("Enter next element: "))
#     list.append(elem)
#
# for z in range(number):
#     buffer.append(-1)
#
# # logic part:
#
# counter = 0
# repeat = -1
#
# for i in range(len(list) - 1):
#
#     if (repeat == list[i]):
#         repeat = -1
#         continue
#
#     counter = 0
#
#     for j in range(len(list) - 1):
#         if list[i] == list[j]:
#             buffer[i] = list[i]
#             counter += 1
#
#         if counter == 2:
#             repeat = list[i]
#
# print("Origin: ")
# for b in list:
#     print(b)
#
# print("Buffer: ")
# for b in buffer:
#     print(b)


print("task #2.13")
### Дано число N, список з N чисел, число M і далі список з M чисел. Вивести всі числа, які трапляються в обох списках.

### input:
# number1 = int(input("Enter list #1 size: "))
# list1 = []
#
# for z in range(number1):
#     elem = int(input("Enter next element: "))
#     list1.append(elem)
#
# number2 = int(input("Enter list #2 size: "))
# list2 = []
#
# for z in range(number2):
#     elem = int(input("Enter next element: "))
#     list2.append(elem)
#
# common = []
# common1 = []

# for i in range(len(list1)):
#
#     for j in range(len(list2)):
#         if list1[i] == list2[j]:
#             common.append(list1[i])
#
# ### output:
#
# print("List #1: ")
# for a in list1:
#     print(a, end=" ")
#
# print()
#
# print("List #2: ")
# for b in list2:
#     print(b, end=" ")
#
# print()
#
# print("Common: ")
# for c in common:
#     print(c, end=" ")
#
# print()


print("task #2.14")
### Реалізуйте CRM систему, яка повинна приймати й обробляти запити наступних видів:
### Додати працівника з іменем <name> у систему.
# add
# <name>
# Перевірити чи є працівник з іменем <name> у системі.
# find
# <name>
# Вивести список всіх працівників.
# list
# Видалити працівника з іменем <name> із системи.
# delete
# <name>
# Завершити роботу системи.
# stop

listOfEmployees = []

print("Program started")

while True:

    command = input("Enter command: ")

    if command == "add":
        name = input("Enter new name: ")
        listOfEmployees.append(name)
    elif command == "find":
        searchName = input("Enter the search name: ")
        i = listOfEmployees.index(searchName)
        print(listOfEmployees[i])
    elif command == "list":
        for n in listOfEmployees:
            print(n)
    elif command == "delete":
        nameToDelete = input("Enter name to delete: ")
        listOfEmployees.remove(nameToDelete)

    if command == "stop":
        break

print("Program finished")
