principle = float(input("Enter the Amount: "))

rate_of_intrest = float(input("Enter the rate of intrest in %: "))

num_of_years = float(input("Enter the number of years: "))

intrest_amount = principle*rate_of_intrest*num_of_years/100

compund_intrest = principle*(1+rate_of_intrest/100)**num_of_years-principle

print("Simple Intrest: ", intrest_amount)
print("Compund Intrest: ",compund_intrest)