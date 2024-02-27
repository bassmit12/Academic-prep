module Caesar2 exposing (..)

-- isAlpha works aswell
isCharacter : Char -> Bool
isCharacter char =
    let
        encodedChar = Char.toCode char
    in
    if encodedChar >= 65 && encodedChar <= 90 then
        True
    else if encodedChar >= 97 && encodedChar <= 122 then
        True
    else
        False

normalize : String -> String
normalize string =
   String.filter isCharacter string

encrypt: Int -> Char -> Char
encrypt shiftAmount character =
  let
    encodedCharacter = Char.toCode character
    
  in

  Char.fromCode shiftedCharacter






--encryptString: Int -> String -> String
--encryptString shiftAmount character =
  
  

--decryptString: Int -> String -> String
--decryptString shiftAmount character =
