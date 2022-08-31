from house import House

HouseBoatDirector = House('House Boat','wood',6,8)
CastleDirector = House('Castle','Sandstone',100,200)
IglooDirector = House('Igloo',1,0,'Ice')

print(HouseBoatDirector.construction())
print(CastleDirector.construction())
print(IglooDirector.construction())