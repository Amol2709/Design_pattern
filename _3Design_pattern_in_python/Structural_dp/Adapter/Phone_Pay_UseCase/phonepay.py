class PhonePay:
    def __init__(self, bankadapter):
        self.bankadapter = bankadapter
    def sendMoney(self):
        self.bankadapter.paymoney()
    def recievMoney(self):
        self.bankadapter.recievmoney()
    def checkSTATUS(self):
        self.bankadapter.verifystatus()