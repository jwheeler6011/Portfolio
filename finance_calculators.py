import math

print("Investment: to calculate the amount of interest you'll earn on your investment.")
print("")
print("Bond: to calculate the amount of interest you'll have to pay on a home loan.")
print("")

#here we get input from a user as to whether they want an investment or a bond
investment_or_bond = input("Enter either 'investment' or 'bond' from the menu above to proceed: ").lower()

if investment_or_bond == "investment":
    #here we get input from a user for the investment calculation
    investment_amount = float(input("Enter the amount of money you are depositing: "))
    print("")
    #here we get the interest rate from the user and convert it to a float
    interest_rate = float(input("Enter the interest rate: "))
    print("")
    #here we get the number of years the user plans on investing for and convert it to a float
    years = float(input("Enter the number of years you plan on investing for: "))
    print("")
    #here we get input from the user as to whether they want simple or compound interest
    interest = input("Enter either 'simple' or 'compound' interest: ").lower()

    if interest == "simple":
        #here we calculate the simple interest using the formula A = P(1 + rt)
        total_amount = investment_amount * (1 + (interest_rate / 100) * years)
        print("")
        print(f"The total amount after {years} years will be: {total_amount:.2f}")
    elif interest == "compound":
        #here we calculate the compound interest using the formula A = P(1 + r)^t
        total_amount = investment_amount * (1 + (interest_rate / 100)) ** years
        print("")
        print(f"The total amount after {years} years will be: {total_amount:.2f}")
    else:
        print("Invalid input. Please enter either 'simple' or 'compound'.")

elif investment_or_bond == "bond":
    #here we get input from a user for the bond calculation
    house_value = float(input("Enter the present value of the house: "))
    print("")
    #here we get the interest rate from the user and convert it to a float
    interest_rate = float(input("Enter the interest rate: "))
    print("")
    #here we get the number of months the user plans on repaying the bond for and convert it to a float
    months = float(input("Enter the number of months you plan on repaying the bond: "))
    print("")
    #here we calculate the monthly repayment using the formula x = (iP)/(1 - (1 + i)^-n)
    monthly_interest_rate = (interest_rate / 100) / 12
    monthly_repayment = (monthly_interest_rate * house_value) / (1 - (1 + monthly_interest_rate) ** (-months))
    print(f"The monthly repayment will be: {monthly_repayment:.2f}")

else:
    print("Invalid input. Please enter either 'investment' or 'bond'.")