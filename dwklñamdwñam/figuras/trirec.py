import math

class TrianguloRectangulo:
    
    def __init__ (self, diametro, angulo):
        self.diametro = float(diametro)
        self.angulo = float(angulo)
    
    def catetoA (self):
        self.catetoA = math.sin(self.angulo) * self.diametro
        return self.catetoA
    def catetoB (self):
        self.catetoB = math.cos(self.angulo) * self.diametro
        return self.catetoB

    def area(self):
        self.area = (self.catetoA()*self.catetoB())/2
        return self.area


x = input("Ingrese la  hipotenusa del triangulo:")
y = input("Ingrese el angulo derrnol triangulo:")

triangulo = TrianguloRectangulo(x, y)

print(triangulo.area())
