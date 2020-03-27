import math

class Point:

    # static variable, class level
    name = "Point1"


    # constructor
    def __init__(self, x, y):
        self.x_coordinate = x
        self.y_coordinate = y

    # custom method
    def calculate_distance_to_origin(self):
        distance = math.sqrt(self.x_coordinate ** 2 + self.y_coordinate **2)
        return distance

    def move(self, x_shift, y_shift):
        self.x_coordinate += x_shift
        self.y_coordinate += y_shift

    # build-in method, works like toString in print(p)
    def __repr__(self):
        point_repr = "({}, {})".format(self.x_coordinate, self.y_coordinate)
        return point_repr


p = Point(2, 2)
p.move(1, 2)
print(p.calculate_distance_to_origin())
print(p)

#             inheritance in ()
class ColorPoint(Point):

    def __init__(self, x, y, color):
        super().__init__(x, y)
        self.color = color

    def recolor(self, color):
        self.color = color

    def __repr__(self):
        colorPoint_represent = super().__repr__() + " {}".format(self.color)
        return  colorPoint_represent


# this code outside both classes
colorPoint = ColorPoint(2, 3, "green")
colorPoint.recolor("yellow")
print(colorPoint.color)
