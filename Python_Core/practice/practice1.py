import math
import random

print("task #1")
#  Користувач вводить ім’я. Привітайтесь з ним по імені й зі знаком оклику в кінці

#print("enter your name please:")
#name = input()
#print("Hello, " + name + "!")

print("task #2")
# задано три числа, вывести сумму

# print("enter three numbers pls:")
# first = int(input())
# second = int(input())
# third = int(input())
# summ = first + second + third
# print(summ)

print("task #3")
# Дано число. Вивести попереднє й наступне відносного нього

# print("enter number pls:")
# number = int(input())
# one = number + 1
# two = number - 1
# print("Original number is:")
# print(number)
# print("Number more then original on 1:")
# print(one)
# print("Number less then original on 1:")
# print(two)

print("task #4")
# Знайти сторону квадрата по його площі

# print("enter squere area pls:")
# squereArea = int(input())
# rib = math.sqrt(squereArea)
# print(rib)

print("task #5")
# Задано 3 сторони трикутника. Знайти його периметр і площу

# print("enter three ribs of triangle:")
# first = int(input())
# second = int(input())
# third = int(input())
#
# trianglePerimeter = first + second + third
# print(trianglePerimeter)
#
# h1 = (0.5*trianglePerimeter)
# squereTriangle = math.sqrt(h1 * (h1 - first) * (h1 - second) * (h1 - third))
# print("triangle squere: ")
# print(squereTriangle)

print("task #6")
#Дано розмір кредиту й одноразові відсотки по ньому. Знайти загальну суму з відсотками й розмір переплати.

# cred = int(input("Enter credit amount: "))
# percent = int(input("Enter credit  percentage: "))
#
# overpayment = (cred / 100) * percent
# totalPayment = cred + overpayment
# print(totalPayment)
# print(overpayment)

print("task #7")
#Реалізуйте простий калькулятор, що отримує два числа й виводить результати застосування стандартних математичних операцій над ними.

# x =  int(input("Enter first number: "))
# y =  int(input("Enter second number: "))
#
# z = x + y
# print("{} + {} = {}".format(x, y, z))
#
# z = x * y
# print("{} * {} = {}".format(x, y, z))
#
# z = x / y
# print("{} / {} = {}".format(x, y, z))
#
# z = x - y
# print("{} - {} = {}".format(x, y, z))

print("task #8")
# lower_value = int(input("Enter lover number: "))
# greater_value = int(input("Enter greater number: "))
#
# integerNumber = random.randint(lower_value, greater_value)
# print(integerNumber)
#
# floatNumber = random.triangular(lower_value, greater_value)
# print(floatNumber)


# Part 2 Tasks ================================================================
print("task #9")
# a = 4
# b = 6
# if a > b:
#     print(b)
# else:
#     print(a)

print("task #10")
#Реалізувати функцію sign(x).
# x = int(input("Enter X: "))
# sign = 0
# if x > 0:
#     sign = 1
# elif x < 0:
#     sign = -1
# else:
#     sign = 0
# print(sign)

print("task #11")
#Реалізуйте ще один простий калькулятор, що отримує два числа й операцію і виводить результат виконання операції
# над введеними значеннями. Допустимі операції: + - * /
# a = int(input())
# b = int(input())
# sign = str(input())
# result = 0
#
# if sign == "*":
#     result = a * b
# elif sign == "/":
#     result = a / b
# elif sign == "+":
#     result = a + b
# elif sign == "-":
#     result = a - b
#
# print(result)

print("task #12")
#Дано коефіцієнти a, b, c квадратного рівняння ax^2+bx+c=0. Знайти корені рівняння

# a = 7.0
# b = 12.0
# c = 5.0
#
# determinant = b * b - 4 * c * a
# print(determinant)
#
# if determinant > 0:
#     root1 = (-b + math.sqrt(determinant)) / (2*a)
#     root2 = (-b - math.sqrt(determinant)) / (2*a)
#     print("root1 = {}, root2 = {}".format(root1, root2))
# elif determinant == 0:
#     root1 = root2 = -b / (2 * a)
#     print("root1 = {}, root2 = {}".format(root1, root2))
# else:
#     print("roots are not real")

print("task #13")
#Пакет мобільного зв’язку передбачає 100 хвилин і 30 смс на місяць при фіксованій абонплаті у 30 гривень.
# Надалі дзвінки тарифікуються по 30 копійок за хвилину, а смс по 25 копійок за одиницю.
# Дано кількість хвилин й смс по номеру за місяць. Розрахувати загальну вартість послуг.

# actualMinutes = int(input("Enter spended minutes: "))
# actualSms = int(input("Enter spended SMS: "))
#
# fixedMinutes = 100
# fixedSms = 30
# monthlyFee = 30
#
# spendedMinutesFee = 0.0
# spendedSmsFee = 0.0
# total = 30.0
#
# if actualMinutes > fixedMinutes:
#     spendedMinutesFee = (actualMinutes - 100) * 0.3
#     total = total + spendedMinutesFee
#
# if actualSms > fixedSms:
#     spendedSmsFee = (actualSms - 30) * 0.25
#     total = total + spendedSmsFee
#
# print("Monthly total: {}".format(total))

print("task #14")
#Дано одну літеру. Визначити чи є вона голосною або приголосною

# vowels = "aeioquy"
# consonants = "bcdfghjklmnprstvwxz"
#
# let = input("Enter a letter: ").lower()
#
# resultNumberVov = vowels.find(let)
# resultNumberCons = consonants.find(let)
#
# if resultNumberVov > 0:
#     print("The letter entered is a vowel.")
# elif resultNumberCons > 0:
#     print("The letter entered is a consonant.")

print("task #15")
#Дано довжини трьох сторін трикутника. Визначити чи є трикутник рівностороннім або рівнобедреним

# a = int(input("Enter triangle edge A: "))
# b = int(input("Enter triangle edge B: "))
# c = int(input("Enter triangle edge C: "))
#
# if a == b and a == c:
#     print("Triangle is equilateral(равносторонний)")
# elif (a == b) or (b == c):
#     print("Triangle is isosceles (равнобедренный)")
# else:
#     print("Triangle is versatile (разносторонний)")