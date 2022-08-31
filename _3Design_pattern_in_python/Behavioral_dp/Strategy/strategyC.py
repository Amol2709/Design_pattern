from interface_strategy import Strategy
class ConcreteStrategyC(Strategy):
    def execute(self) -> str:
        return "ConcreteStrategy C"