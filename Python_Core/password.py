name = input()
password = input()

print("Enter login:")
if (name == "admin" and password == "root") or (name == "user" and password == "123"):
        print("Welcome")
else:
    print("Wrong login/password")