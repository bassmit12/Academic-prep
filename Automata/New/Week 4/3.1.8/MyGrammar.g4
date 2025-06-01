grammar MyGrammar;

// Grammar for {a^n b^m : (n + m) is odd}
start  : expr EOF;

// Two cases for n+m odd:
// 1. Odd number of a's followed by even number of b's
// 2. Even number of a's followed by odd number of b's
expr   : oddA evenB // Case 1
       | evenA oddB // Case 2
       ;

oddA   : 'a'                  // 1 a
       | 'a' 'a' 'a'          // 3 a's
       | 'a' 'a' 'a' 'a' 'a'  // 5 a's
       ;

evenA  : /* empty */          // 0 a's
       | 'a' 'a'              // 2 a's
       | 'a' 'a' 'a' 'a'      // 4 a's
       ;

oddB   : 'b'                  // 1 b
       | 'b' 'b' 'b'          // 3 b's
       | 'b' 'b' 'b' 'b' 'b'  // 5 b's
       ;

evenB  : /* empty */          // 0 b's
       | 'b' 'b'              // 2 b's
       | 'b' 'b' 'b' 'b'      // 4 b's
       ;

       // Skip whitespace
WS : [ \t\r\n]+ -> skip ;
