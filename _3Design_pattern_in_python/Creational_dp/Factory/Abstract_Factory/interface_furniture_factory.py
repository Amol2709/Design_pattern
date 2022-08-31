from abc import ABC, abstractmethod
class IFurnitureFactory(ABC):
    "Abstract Furniture Factory Interface"
    @staticmethod
    @abstractmethod
    def get_furniture(furniture):
        "The static Abstract factory interface method"
        pass