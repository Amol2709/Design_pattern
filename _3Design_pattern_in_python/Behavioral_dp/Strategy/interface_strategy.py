from abc import ABC, abstractmethod

## Strategy interface
class Strategy(ABC):
    @abstractmethod
    def execute(self) -> str:
        pass