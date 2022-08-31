import time
import random
from cube_a import CubeA
from cube_b_adapter import CubeBAdapter

# client
TOTALCUBES = 5
COUNTER = 0
while COUNTER < TOTALCUBES:
    # produce 5 cubes from which ever supplier can manufacture it first
    WIDTH = random.randint(1, 10)
    HEIGHT = random.randint(1, 10)
    DEPTH = random.randint(1, 10)
    CUBE = CubeA()
    SUCCESS = CUBE.manufacture(WIDTH, HEIGHT, DEPTH)
    if SUCCESS:
        print("Company A building Cube")
    else:
        print("Company A is busy, trying company B")
        CUBE = CubeBAdapter()

