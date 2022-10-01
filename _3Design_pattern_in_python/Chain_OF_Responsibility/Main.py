from InfoLogProcessor import InfoLogProcessor
from DebugLogProcessor import DebugLogProcessor
from ErrorLogProcessor import ErrorLogProcessor

obj = InfoLogProcessor(DebugLogProcessor(ErrorLogProcessor(None)))

obj.log('ERROR','This is error')
obj.log('DEBUG','This is Debug')
obj.log('INFO','This is info')