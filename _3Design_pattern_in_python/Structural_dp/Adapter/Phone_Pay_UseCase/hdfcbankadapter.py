from interface_bankapi import BankApi
from hdfcbackapi import HDFCAPI
class HDFCBankAdapter(BankApi):
    def __init__(self):
        self.obj = HDFCAPI()
    
    def paymoney(self):
        self.obj.makepayment()
        
    
    def recievemoney(self):
        self.obj.recievepayment()

    def verifystatus(self):
        self.obj.checkstatus()