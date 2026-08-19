def is_triangle(sides):
    return bool(len(sides) == 3 and 0 not in sides and sides[0]+sides[1] >= sides[2] and sides[1]+sides[2] >= sides[0] and sides[0]+sides[2] >= sides[1])

def equilateral(sides):
    return bool(is_triangle(sides) and sides[0] == sides[1] == sides[2])

def isosceles(sides):
    return bool(is_triangle(sides) and (sides[0] == sides[1] or sides[0] == sides[2] or sides[1] == sides[2]))

def scalene(sides):
    return bool(is_triangle(sides) and (sides[0] != sides[1] and sides[0] != sides[2] and sides[1] != sides[2]))
