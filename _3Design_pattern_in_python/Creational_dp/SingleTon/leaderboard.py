class Leaderboard:
    _table = {}
    def __new__(cls):
        return cls
    
    @classmethod
    def printLeaderBoard(cls):
        print('-------LeaderBoard---------')
        for key, value in sorted(cls._table.items()):
            print(key,value)

    @classmethod
    def add_winner(cls, position, name):
        cls._table[position]=name