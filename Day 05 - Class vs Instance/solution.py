class Person:
    def __init__(self,initialAge):
        if initialAge > 0:
            self.age = initialAge
        else:
            print("Age is not valid, setting age to 0.")
            self.age = 0
        
    def amIOld(self):
        memory = ""
        if self.age < 13:
            memory = "young."
        elif self.age >= 13 and self.age < 18:
            memory = "a teenager."
        else:
            memory = "old."
        print("You are "+memory)
        
    def yearPasses(self):
        self.age += 1

t = int(input())
for i in range(0, t):
    age = int(input())         
    p = Person(age)  
    p.amIOld()
    for j in range(0, 3):
        p.yearPasses()       
    p.amIOld()
    print("")