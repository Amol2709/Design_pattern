from interface_bankapi import BankApi
from yesbankapi import YesBankAPI
class YesBankAdapter(BankApi):
    def __init__(self):
        self.obj = YesBankAPI()
    
    def paymoney(self):
        self.obj.makepayment()
        
    
    def recievemoney(self):
        self.obj.recievepayment()

    def verifystatus(self):
        self.obj.checkstatus()