from interface_strategy import Strategy
class Default(Strategy):
    def execute(self) -> str:
        return "Default"