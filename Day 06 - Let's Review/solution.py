NumberOfStrings = int(input())

for i in range(0, NumberOfStrings):
        
    string = input()
        
    print(string[::2],string[1::2])