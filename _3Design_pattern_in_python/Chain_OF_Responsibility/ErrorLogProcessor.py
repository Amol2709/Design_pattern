from LogProcessor import  LogProcessor


class ErrorLogProcessor(LogProcessor):
    def __init__(self, logprocessor):
        super().__init__(logprocessor)
    

    def log(self, level, message):
        if level == 'ERROR':
            print('Error: {}'.format(message))
        else:
            super().log(level, message)
