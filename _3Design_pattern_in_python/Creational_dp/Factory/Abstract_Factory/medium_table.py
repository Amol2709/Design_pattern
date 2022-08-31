from interface_table import ITable
class MediumTable(ITable):
    "The Small Chair Concrete Class implements the IChair interface"
    def __init__(self):
        self._height = 40
        self._width = 40
        self._depth = 40
    def get_dimensions(self):
        return {
        "width": self._width,
        "depth": self._depth,
        "height": self._height
        }