from context import Context
from strategyA import ConcreteStrategyA
from strategyB import ConcreteStrategyB
appA = Context()
appB = Context()
appC = Context()

## selecting stratigies
appA.setStrategy(ConcreteStrategyA())
appB.setStrategy(ConcreteStrategyB())
appC.setStrategy()    ## sets to default strategy

## each object below execute different strategy with same method
appA.executeStrategy()
appB.executeStrategy()
appC.executeStrategy()
