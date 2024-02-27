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

; All dice can be seen as a 4*3 grid where dice 2 position 3 is the integer resenting on (2, 3)
(declare-fun Dice (Int Int) Int)


; begin assert
(assert (and
    (distinct 
        (Dice 1 1)
        (Dice 1 2)
        (Dice 1 3)

        (Dice 2 1)
        (Dice 2 2)
        (Dice 2 3)

        (Dice 3 1)
        (Dice 3 2)
        (Dice 3 3)

        (Dice 4 1)
        (Dice 4 2)
        (Dice 4 3)
    )
    (and
        (<= 1 (Dice 1 1) 12)
        (<= 1 (Dice 1 2) 12)
        (<= 1 (Dice 1 3) 12)
        (<= 1 (Dice 2 1) 12)
        (<= 1 (Dice 2 2) 12)
        (<= 1 (Dice 2 3) 12)
        (<= 1 (Dice 3 1) 12)
        (<= 1 (Dice 3 2) 12)
        (<= 1 (Dice 3 3) 12)
        (<= 1 (Dice 4 1) 12)
        (<= 1 (Dice 4 2) 12)
        (<= 1 (Dice 4 3) 12)
    )
))
(check-sat)

(echo "dice1 contains the following letters: ")
(get-value ((Dice 1 1)(Dice 1 2)(Dice 1 3)))

(echo "dice2 contains the following letters: ")
(get-value ((Dice 2 1)(Dice 2 2)(Dice 2 3)))

(echo "dice3 contains the following letters: ")
(get-value ((Dice 3 1)(Dice 3 2)(Dice 3 3)))

(echo "dice4 contains the following letters: ")
(get-value ((Dice 4 1)(Dice 4 2)(Dice 4 3)))