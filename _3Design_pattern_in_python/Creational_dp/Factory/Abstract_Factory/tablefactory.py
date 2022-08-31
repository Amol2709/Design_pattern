from small_table import SmallTable
from medium_table import MediumTable
from big_table import BigTable
class TableFactory: # pylint: disable=too-few-public-methods
    "The Factory Class"
    @staticmethod
    def get_chair(table):
        "A static method to get a chair"
        if table == 'BigTable':
            return BigTable()
        if table == 'MediumTable':
            return MediumTable()
        if table == 'SmallTable':
            return SmallTable()
        return None