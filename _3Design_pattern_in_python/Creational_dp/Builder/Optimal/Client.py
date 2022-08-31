from house_builder import HouseBuilder

HouseBoatDirector=HouseBuilder().\
                    set_building_type('House').\
                    set_wall_material('Boat').\
                    set_number_doors(6).\
                    set_number_windows(8).\
                    get_result()
CastleDirector=HouseBuilder().\
                    set_building_type('Castle').\
                    set_wall_material('SandStone').\
                    set_number_doors(100).\
                    set_number_windows(200).\
                    get_result()

IglooDirector=HouseBuilder().\
                    set_building_type('Igloo').\
                    set_wall_material('Boat').\
                    set_number_doors(6).\
                    get_result()
print(HouseBoatDirector.construction())
print(CastleDirector.construction())
print(IglooDirector.construction())


# HouseBoatDirector = House('House Boat','wood',6,8)
# CastleDirector = House('Castle','Sandstone',100,200)
# IglooDirector = House('Igloo',1,0,'Ice')

# print(HouseBoatDirector.construction())
# print(CastleDirector.construction())
# print(IglooDirector.construction())