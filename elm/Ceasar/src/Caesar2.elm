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

encodeChar: Int -> Char -> Char
encodeChar shiftNumber character =
    if Char.isAlpha character then
        let 
            baseCode = if Char.isUpper character then 65 else 97
            characterCode = Char.toCode character - baseCode
            shiftedCharacterCode = (modBy 26 (characterCode + shiftNumber)) + baseCode
        in Char.fromCode shiftedCharacterCode
    else character

decodeChar: Int -> Char -> Char
decodeChar shiftNumber character =
    encodeChar (negate shiftNumber) character


applyOperation : (Int -> Char -> Char) -> Int -> List Char -> List Char
applyOperation operation shiftNumber charList =
    case charList of
        [] ->
            []

        firstChar :: restOfChars ->
            operation shiftNumber firstChar :: applyOperation operation shiftNumber restOfChars


encrypt : Int -> String -> String
encrypt shiftNumber string =
    let
        listString = String.toList string
        encodedListString = applyOperation encodeChar shiftNumber listString
    in
    String.fromList encodedListString

decrypt : Int -> String -> String
decrypt shiftNumber string =
    let
        listString = String.toList string
        decodedListString = applyOperation decodeChar shiftNumber listString
    in
    String.fromList decodedListString
