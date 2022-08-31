"The Builder Interface"
from abc import ABC, abstractmethod
class IHouseBuilder(ABC):
    "The House Builder Interface"
    @staticmethod
    @abstractmethod
    def set_building_type(building_type):
        "Build type"
        pass

    @staticmethod
    @abstractmethod
    def set_wall_material(wall_material):
        "Build material"
        pass

    @staticmethod
    @abstractmethod
    def set_number_doors(number):
        "Number of doors"
        pass

    @staticmethod
    @abstractmethod
    def set_number_windows(number):
        "Number of windows"
        pass
    
    @staticmethod
    @abstractmethod
    def get_result():
        "Return the final product"
        pass