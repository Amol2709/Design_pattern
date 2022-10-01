from LogProcessor import  LogProcessor


class InfoLogProcessor(LogProcessor):
    def __init__(self, logprocessor):
        super().__init__(logprocessor)
    

    def log(self, level, message):
        if level == 'INFO':
            print('Info: {}'.format(message))
        else:
            super().log(level, message)