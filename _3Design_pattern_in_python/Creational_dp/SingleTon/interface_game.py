from abc import ABC, abstractmethod
class IGame(ABC):
    @abstractmethod
    def add_winner(position, name):
        pass