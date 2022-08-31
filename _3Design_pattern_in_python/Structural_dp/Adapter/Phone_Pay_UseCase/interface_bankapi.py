from abc import ABC, abstractmethod

class BankApi(ABC):
    @abstractmethod
    def paymoney():
        pass
    
    @abstractmethod
    def recievemoney():
        pass

    @abstractmethod
    def verifystatus():
        pass