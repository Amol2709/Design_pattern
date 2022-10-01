from LogProcessor import  LogProcessor


class DebugLogProcessor(LogProcessor):
    def __init__(self, logprocessor):
        super().__init__(logprocessor)
    

    def log(self, level, message):
        if level == 'DEBUG':
            print('Debug: {}'.format(message))
        else:
            super().log(level, message)
