from furniture_factory import FurnitureFactory
FURNITURE = FurnitureFactory.get_furniture("SmallChair")
print('{}: {}'.format(FURNITURE.__class__,FURNITURE.get_dimensions()))