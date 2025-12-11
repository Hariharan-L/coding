from fractions import Fraction
s="-1/4+1/8"
f=Fraction(eval(s))
# print(eval(s))
print(f"{f.numerator}/{f.denominator}")