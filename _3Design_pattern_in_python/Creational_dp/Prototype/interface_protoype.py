from abc import ABC, abstractmethod
class IProtoType(ABC):
    "interface with clone method"
    @staticmethod
    @abstractmethod
    def clone(mode):
        """The clone, deep or shallow.
        It is up to you how you want to implement
        the details in your concrete class"""
        pass
