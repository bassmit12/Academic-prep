module ExamPractice exposing (..)

factorial : Int -> Int
factorial x =
  if x == 0 then
        1
  else
    x * factorial(x-1)


fibonacci : Int -> Int
fibonacci n =
    if n <= 1 then
        n  -- Base case: Fibonacci of 0 is 0, Fibonacci of 1 is 1
    else
        fibonacci (n - 1) + fibonacci (n - 2)  -- Recursive case: Fibonacci of n is the sum of Fibonacci of (n - 1) and Fibonacci of (n - 2)

reverseList : List Int -> List Int
reverseList list =
  case list of
    [] -> []
    [x] -> [x]

    x :: xs ->
      reverseList xs ++ [x]


sumOfDigits : Int -> Int
sumOfDigits n =
    if n < 10 then
        n  -- Base case: if n is a single digit, return n
    else
        let
            lastDigit = modBy 10 n  -- Extract the last digit of n
            remainingDigits = n // 10  -- Remove the last digit from n
        in
        lastDigit + sumOfDigits remainingDigits  -- Recursive case: add the last digit to the sum of the remaining digits

lengthOfListRec : List Int -> Int
lengthOfListRec list = 
  case list of 
    [] -> 0

    x :: xs ->
      x // x + lengthOfListRec xs

maxElementInList : List Int -> Int 
maxElementInList list = 
  case list of 
    [] -> 0

    x :: xs ->
      if x > maxElementInList xs then
        x 
      else 
        maxElementInList xs

isListSorted : List Int -> Bool
isListSorted list =
  case list of 
    [] -> True
    [x] -> True

    x :: y :: xs ->
      if x <= y then
        isListSorted (y::xs)
      else
        False


power : Int -> Int -> Int
power base exponent =
    if exponent == 0 then
        1  -- Base case: any number raised to the power of 0 is 1
    else if exponent == 1 then
        base  -- Base case: any number raised to the power of 1 is itself
    else
        base * power base (exponent - 1)  -- Recursive case: multiply base by base raised to (exponent - 1)
    

countElementInList : List Int -> Int -> Int
countElementInList list element =
    case list of 
        [] ->
            0  -- Base case: empty list, return 0 occurrences of the element
        
        x :: xs ->
            let
                elementCount = if x == element then 1 else 0  -- Check if the current element matches the desired element
            in 
            elementCount + countElementInList xs element  -- Recursively count occurrences of the element in the rest of the list

