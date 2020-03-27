from pip._vendor.distlib.compat import raw_input

print("task #4.1")
### Написати програму, що для заданого списку чисел визначає скільки в ньому унікальних значень

# num = int(input("Enter list length: "))
# list = []
#
# for z in range(num):
#     elem = int(input("Enter next element: "))
#     list.append(elem)
#
# unique = set(list)
#
# print(list)
# print(unique)
# print(len(unique))

print("task #4.2")
### Написати програму, що інтерактивно отримує на ввід числа і для кожного повідомляє чи зустрічалося воно на вводі вже раніше.

# print("Enter your number")
# print("To finish program print '-1'")
#
# isFinished = False
# setOfNumbers = {0}
#
# while not isFinished:
#
#     try:
#         num = int(raw_input("Enter next number: "))
#     except ValueError:
#         print("Number should be integer and not empty")
#         continue
#
#     if num == -1:
#         isFinished = True
#         print("Program finished")
#         break
#
#     if num is None:
#         print("Number cant be empty")
#         continue
#
#     if num in setOfNumbers:
#         print("Number already exists")
#     else:
#         print("This number is new, added to list.")
#         setOfNumbers.add(num)

print("task #4.3")
### Написати програму, що дозволить підтримувати список електронних адрес для розсилки.
### Програма повинна дозволяти додавати, перевіряти наявність і видаляти електронні адреси.

# print("Email database")
#
# isFinished = False
# emails = set()
#
# while not isFinished:
#
#     print()
#     print("Choose an option:")
#     print(" - To add new email enter '1'")
#     print(" - To delete email enter '2'")
#     print(" - To check presence of email in the database enter '3'")
#     print(" - To show all emails enter '4'")
#     print(" - To finish program print '5'")
#     print()
#
#     num = int(input("Enter your operation number: "))
#     if num == 1:
#         newEmail = str(input("Enter new email: "))
#         emails.add(newEmail)
#         print("Email successfully added")
#     elif num == 2:
#         toDeleteEmail = str(input("Enter email which you want to delete: "))
#         if toDeleteEmail in emails:
#             emails.remove(toDeleteEmail)
#         else:
#             print("There is no such email in the database")
#     elif num == 3:
#         toCheckEmail = str(input("Enter email to check: "))
#         if toCheckEmail in emails:
#             print("Email already exists")
#         else:
#             print("There is no such email in the database")
#     elif num == 4:
#         print(emails)
#
#     elif num == 5:
#         print("Program finished")
#         isFinished = True

print("task #4.4")
### Написати програму, що для заданого списку слів підрахує кількість входжень кожного зі слів у цей список.
