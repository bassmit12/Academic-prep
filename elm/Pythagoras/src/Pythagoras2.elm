module Pythagoras2 exposing (..)

leg1 : Int -> Int -> Int
leg1 x y =
     x^2 - y^2

leg2 : Int -> Int -> Int
leg2 x y =
    2 * x * y

hyp : Int -> Int -> Int
hyp x y =
    x^2 + y^2

pythTriple : (Int, Int) -> (Int, Int, Int)
pythTriple (x, y) =
    (leg1 x y, leg2 x y, hyp x y)


isTriple : (Int, Int, Int) -> Bool
isTriple (a, b, c) =
    a^2 + b^2 == c^2 && (a > 0 && b > 0 && c > 0)


pythTriplesMap: List (Int, Int) -> List (Int, Int, Int)
pythTriplesMap pairs = 
  List.map pythTriple pairs

pythTriplesRec: List (Int, Int) -> List (Int, Int, Int)
pythTriplesRec pairs =
  case pairs of
    [] -> []

    firstPair :: restOfPairs ->
      pythTriple firstPair :: pythTriplesRec restOfPairs

arePythTriplesFilter: List (Int, Int, Int) -> List (Int, Int, Int)
arePythTriplesFilter pairs =
  List.filter isTriple pairs


arePythTriplesRec: List (Int, Int, Int) -> List (Int, Int, Int)
arePythTriplesRec pairs =
  case pairs of
  [] -> []

  firstPair :: restOfPairs ->
    if isTriple firstPair then
      firstPair :: arePythTriplesRec restOfPairs
    else
      arePythTriplesRec restOfPairs
