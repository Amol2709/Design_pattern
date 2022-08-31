from interface_strategy import Strategy
class ConcreteStrategyA(Strategy):
    def execute(self) -> str:
        return "ConcreteStrategy A"