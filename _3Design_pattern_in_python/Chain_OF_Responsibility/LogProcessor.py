from abc import ABC , abstractmethod

class LogProcessor(ABC):
    def __init__(self, logprocessor):
        self.nextLogProcessor = logprocessor
    
    @abstractmethod
    def log(self,level, message):
        if self.nextLogProcessor!=None:
            self.nextLogProcessor.log(level, message)