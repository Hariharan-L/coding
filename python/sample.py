import numpy as np
import matplotlib.pyplot as plt

def cubic_map(x, a):
    return a * x**3 + (1 - a) * x

a_min, a_max = -2.0, 2.0
a_values = np.linspace(a_min, a_max, 10000)
iterations = 1000
last = 100 

x = np.ones_like(a_values) * 0.5
result_a = []
result_x = []

for i in range(iterations):
    x = cubic_map(x, a_values)
    if i >= (iterations - last):
        result_a.extend(a_values)
        result_x.extend(x)

plt.figure(figsize=(10, 7))
plt.plot(result_a, result_x, ',k', alpha=0.25)
plt.title("Bifurcation diagram of the cubic map")
plt.xlabel("a")
plt.ylabel("x")
plt.show()
