P = float(input())
N = float(input())
G = float(input())
L = float(input())

res = (2*P+(N-P)+G)/L

if res.is_integer():
    print(int(res))
else:
    print(0)
