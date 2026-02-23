import math


# Function to calculate the sum for a given x up to x^10/10!
def calculate_sum(x):
    total = 0
    for n in range(1, 11):  # Summing up to x^10/10!
        total += (x**n) / math.factorial(n)
    return total


# Calculate the sum for x = 1, 2, 3, 4
results = {x: calculate_sum(x) for x in range(1, 5)}
print(results)
