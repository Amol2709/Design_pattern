from chairfactory import ChairFactory
# The Client
CHAIR = ChairFactory().get_chair("SmallChair")
print(CHAIR.get_dimensions())