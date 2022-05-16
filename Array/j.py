n=input("Please provide the number to calculate it\'s factorial")
print("you entered the number =",n)
fact=1
for i in range(1,n+1):
    fact = fact*i
print("Factorial of given number is = ",fact)