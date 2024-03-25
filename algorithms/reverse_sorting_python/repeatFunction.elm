module RepeatFunction exposing (..)


repeatUntil: (a -> Bool) -> (a -> a) -> a -> a
repeatUntil predicate value initial =
    if predicate initial then
        initial
    else
        repeatUntil predicate value (value initial)


above100: Int -> Bool
above100 x = x > 100


double: Int -> Int
double x = x * 2



aboveX: Int -> Int -> Bool
aboveX x limit = x > limit



logBase: Int -> Int -> Int
logBase base target =
    let
        multiplyUntil x count =
            if x > target then
                count
            else
                multiplyUntil (x * base) (count + 1)
    in
    multiplyUntil 1 0



repeatUntilList: (List Int -> Bool) -> (List Int -> List Int) -> List Int -> List Int
repeatUntilList predicate value initial =
    if predicate initial then
        initial
    else
        repeatUntilList predicate value (value initial)



collatzTransform: List Int -> List Int
collatzTransform list =
    let
        x = List.head list
    in
    case x of
        Just n ->
            if n == 1 then
                list
            else if (\num -> modBy 2 num == 0) n then
                (n // 2) :: list
            else
                (3 * n + 1) :: list
        Nothing ->
            []

collatzSequence: Int -> List Int
collatzSequence n =
    List.reverse (repeatUntilList (\list -> List.head list == Just 1) collatzTransform [n])


testDoubleZero : Bool
testDoubleZero =
    double 0 == 0

testAbove100 : Bool
testAbove100 =
    above100 101 == True

testRepeatUntilDouble : Bool
testRepeatUntilDouble =
    repeatUntil (\x -> x >= 10) double 1 == 16

testRepeatUntilIncrement : Bool
testRepeatUntilIncrement =
    repeatUntil (\x -> x >= 10) (\x -> x + 1) 1 == 10

testAboveX : Bool
testAboveX =
    aboveX 10 5 == True

testCollatzSequence : Bool
testCollatzSequence =
    collatzSequence 19 == [19,58,29,88,44,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1]

testDoubleNegative : Bool
testDoubleNegative =
    double (-5) == -10

testAll : List Bool
testAll =
    [ testDoubleZero
    , testAbove100
    , testRepeatUntilDouble
    , testRepeatUntilIncrement
    , testAboveX
    , testCollatzSequence
    , testDoubleNegative
    ]
