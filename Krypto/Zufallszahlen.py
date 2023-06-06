p = 191
q = 167
s = 599
y = []

n = p*q
x = (s*s)%n

for i in range(100):
    x  = (x*x) % n
    z = x % 2
    y.append(z)

print(y)