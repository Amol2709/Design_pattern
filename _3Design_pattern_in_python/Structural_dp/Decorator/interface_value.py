from abc import ABC, abstractmethod
class IValue(ABC):
    "Methods the component must implement"
    @staticmethod
    @abstractmethod
    def __str__():
        pass