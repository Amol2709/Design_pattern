from abc import ABC, abstractmethod
class ITable(ABC):
    "The Chair Interface (Product)"
    @staticmethod
    @abstractmethod
    def get_dimensions():
        "A static interface method"
        pass