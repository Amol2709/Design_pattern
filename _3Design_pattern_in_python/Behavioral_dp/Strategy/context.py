## context - the primary class
from interface_strategy import  Strategy
from default_Startegy import Default
class Context:
    strategy: Strategy  ## the strategy interface

    def setStrategy(self, strategy: Strategy = None) -> None:
        if strategy is not None:
            self.strategy = strategy
        else:
            self.strategy = Default()

    def executeStrategy(self) -> str:
        print(self.strategy.execute())