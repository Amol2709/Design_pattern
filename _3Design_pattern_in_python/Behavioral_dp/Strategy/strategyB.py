from interface_strategy import Strategy
class ConcreteStrategyB(Strategy):
    def execute(self) -> str:
        return "ConcreteStrategy B"