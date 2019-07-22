val y = List(3,4)

//prefix an integer onto y, but y is not changed
y.::(2) //prepend 2 to y
1 :: y //append y to 1

1 +: Vector(2,3) :+ 2 //prepend 1 and append 2

1::2::3::4::5::Nil
Nil.::(5).::(4).::(3).::(2).::(1)

List(1,2,3,4).filter(n => n%2 == 0)
