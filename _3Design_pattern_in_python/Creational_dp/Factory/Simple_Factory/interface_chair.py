from abc import ABC, abstractmethod
class IChair(ABC):
    "The Chair Interface (Product)"
    @staticmethod
    @abstractmethod
    def get_dimensions():
        "A static interface method"
        pass