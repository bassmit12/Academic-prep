module Main exposing (..)


repeatUntil : (a -> Bool) -> (a -> a) -> a -> a
repeatUntil condition function value =
    if condition value then
        value
    else
        repeatUntil condition function (function value)

above100: Int -> Bool 
above100 x =
    x > 100

double: Int -> Int 
double x = 
    x * 2
