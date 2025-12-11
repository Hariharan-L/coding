class Customer:
  # intrest=0
  t="y"
  n=""
  def __init__(se,name,type):
    se.n=name
    se.t=type
    if(se.t=="s"):
      se.intrest=7
    else:
      se.intrest=10
c1=Customer("hi","s")
c2=Customer("hello","s")
print(c1.intrest)
print(c1.n)