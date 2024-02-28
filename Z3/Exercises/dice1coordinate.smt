; appearing letters: C, A, T, S, O, N, P, D, R, I, G, E
(declare-const C Int)
(declare-const A Int)
(declare-const T Int)
(declare-const S Int)
(declare-const O Int)
(declare-const N Int)
(declare-const P Int)
(declare-const D Int)
(declare-const R Int)
(declare-const I Int)
(declare-const G Int)
(declare-const E Int)

;give each letter a unique value
(assert (= C 1))
(assert (= A 2))
(assert (= T 3))
(assert (= S 4))
(assert (= O 5))
(assert (= N 6))
(assert (= P 7))
(assert (= D 8))
(assert (= R 9))
(assert (= I 10))
(assert (= G 11))
(assert (= E 12))

; All dice can be seen as a 3*4 grid where dice 2 position 3 is the integer resenting on (2, 3)
(declare-fun Dice (Int) Int)

;
(define-fun Words ((Letter1 Int) (Letter2 Int) (Letter3 Int)) Bool
  (and
    (distinct Letter1 Letter2 Letter3)
    (and
      (or (= Letter1 (Dice 1)) (= Letter1 (Dice 2)) (= Letter1 (Dice 3)) (= Letter1 (Dice 4)))
      (or (= Letter2 (Dice 1)) (= Letter2 (Dice 2)) (= Letter2 (Dice 3)) (= Letter2 (Dice 4)))
      (or (= Letter3 (Dice 1)) (= Letter3 (Dice 2)) (= Letter3 (Dice 3)) (= Letter3 (Dice 4)))
    )
    (and
      (or (= Letter1 (Dice 5)) (= Letter1 (Dice 6)) (= Letter1 (Dice 7)) (= Letter1 (Dice 8)))
      (or (= Letter2 (Dice 5)) (= Letter2 (Dice 6)) (= Letter2 (Dice 7)) (= Letter2 (Dice 8)))
      (or (= Letter3 (Dice 5)) (= Letter3 (Dice 6)) (= Letter3 (Dice 7)) (= Letter3 (Dice 8)))
    )
    (and
      (or (= Letter1 (Dice 9)) (= Letter1 (Dice 10)) (= Letter1 (Dice 11)) (= Letter1 (Dice 12)))
      (or (= Letter2 (Dice 9)) (= Letter2 (Dice 10)) (= Letter2 (Dice 11)) (= Letter2 (Dice 12)))
      (or (= Letter3 (Dice 9)) (= Letter3 (Dice 10)) (= Letter3 (Dice 11)) (= Letter3 (Dice 12)))
    )
  )
)



; begin assert
(assert (and
    (distinct 
        (Dice 1)
        (Dice 2)
        (Dice 3)
        (Dice 4)

        (Dice 5)
        (Dice 6)
        (Dice 7)
        (Dice 8)

        (Dice 9)
        (Dice 10)
        (Dice 11)
        (Dice 12)


    )
    (and
        (<= 1 (Dice 1) 12)
        (<= 1 (Dice 2) 12)
        (<= 1 (Dice 3) 12)
        (<= 1 (Dice 4) 12)

        (<= 1 (Dice 5) 12)
        (<= 1 (Dice 6) 12)
        (<= 1 (Dice 7) 12)
        (<= 1 (Dice 8) 12)

        (<= 1 (Dice 9) 12)
        (<= 1 (Dice 10) 12)
        (<= 1 (Dice 11) 12)
        (<= 1 (Dice 12) 12)

    )
    (Words C A T)
    (Words S O N)
    (Words P O D)
    
))
(check-sat)

(echo "dice1 contains the following letters: ")
(get-value ((Dice 1)(Dice 2)(Dice 3)(Dice 4)))

(echo "dice2 contains the following letters: ")
(get-value ((Dice 5)(Dice 6)(Dice 7)(Dice 8)))

(echo "dice3 contains the following letters: ")
(get-value ((Dice 9)(Dice 10)(Dice 11)(Dice 12)))

